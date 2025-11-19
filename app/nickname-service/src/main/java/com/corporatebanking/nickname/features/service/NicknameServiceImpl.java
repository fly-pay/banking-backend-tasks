package com.corporatebanking.nickname.features.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.corporatebanking.nickname.features.models.NicknameData;
import com.corporatebanking.nickname.features.repository.jdbc.NicknameJdbcRepository;
import com.corporatebanking.nickname.grpc.CreateNicknameRequest;
import com.corporatebanking.nickname.grpc.DeleteNicknameRequest;
import com.corporatebanking.nickname.grpc.DeleteNicknameResponse;
import com.corporatebanking.nickname.grpc.GetAllNicknamesRequest;
import com.corporatebanking.nickname.grpc.GetNicknameRequest;
import com.corporatebanking.nickname.grpc.NicknameListResponse;
import com.corporatebanking.nickname.grpc.NicknameResponse;
import com.corporatebanking.nickname.grpc.NicknameServiceGrpc;
import com.corporatebanking.nickname.grpc.UpdateNicknameRequest;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class NicknameServiceImpl extends NicknameServiceGrpc.NicknameServiceImplBase {

    private final NicknameJdbcRepository nicknameRepository;
    private final DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

    @Autowired
    public NicknameServiceImpl(NicknameJdbcRepository nicknameRepository) {
        this.nicknameRepository = nicknameRepository;
    }

    @Override
    public void createNickname(CreateNicknameRequest request, StreamObserver<NicknameResponse> responseObserver) {
    	NicknameData nickname = new NicknameData(
                null,
                request.getFromAccount(),
                request.getToAccount(),
                request.getNickname(),
                null,
                null,
                request.getCreatedBy(),
                null
        );

        NicknameData savedNickname = nicknameRepository.save(nickname);
        responseObserver.onNext(toNicknameResponse(savedNickname));
        responseObserver.onCompleted();
    }

    @Override
    public void getNickname(GetNicknameRequest request, StreamObserver<NicknameResponse> responseObserver) {
        nicknameRepository.findById(request.getToAccount()).ifPresent(nickname -> {
            responseObserver.onNext(toNicknameResponse(nickname));
        });
        
        responseObserver.onCompleted();
    }

    @Override
    public void getAllNicknames(GetAllNicknamesRequest request, StreamObserver<NicknameListResponse> responseObserver) {
        List<NicknameData> nicknames = nicknameRepository.findAll();
        List<NicknameResponse> nicknameResponses = nicknames.stream()
                .map(this::toNicknameResponse)
                .collect(Collectors.toList());

        NicknameListResponse response = NicknameListResponse.newBuilder()
                .addAllNicknames(nicknameResponses)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateNickname(UpdateNicknameRequest request, StreamObserver<NicknameResponse> responseObserver) {
        Optional<NicknameData> existingOrgOpt = nicknameRepository.findByToAccountId(request.getToAccount());
        if (existingOrgOpt.isPresent()) {
             NicknameData orgToUpdate = new NicknameData(
            	existingOrgOpt.get().id(),
            	existingOrgOpt.get().fromAccount(),
                request.getToAccount(),
                request.getNickname(),
                existingOrgOpt.get().createdAt(),
                LocalDate.now(),
                existingOrgOpt.get().createdBy(),
                request.getUpdatedBy()
            );
            nicknameRepository.update(orgToUpdate).ifPresent(updatedOrg -> {
                 responseObserver.onNext(toNicknameResponse(updatedOrg));
            });
        }
        responseObserver.onCompleted();
    }

    @Override
    public void deleteNickname(DeleteNicknameRequest request, StreamObserver<DeleteNicknameResponse> responseObserver) {
        nicknameRepository.deleteById(request.getToAccount());
        DeleteNicknameResponse response = DeleteNicknameResponse.newBuilder()
                .setMessage("NicknameData with ID " + request.getToAccount() + " deleted successfully.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private NicknameResponse toNicknameResponse(NicknameData nickname) {
        NicknameResponse.Builder builder = NicknameResponse.newBuilder();
        builder.setId(nickname.id())
                .setFromAccount(nickname.fromAccount())
                .setToAccount(nickname.toAccount())
                .setNickname(nickname.nickname());

        if (nickname.createdAt() != null) {
            builder.setCreatedAt(nickname.createdAt().format(dateFormatter));
        }
        if (nickname.updatedAt() != null) {
            builder.setUpdatedAt(nickname.updatedAt().format(dateFormatter));
        }
        if (nickname.createdBy() != null) {
            builder.setCreatedBy(nickname.createdBy());
        }
        if (nickname.updatedBy() != null) {
            builder.setUpdatedBy(nickname.updatedBy());
        }

        return builder.build();
    }
}
