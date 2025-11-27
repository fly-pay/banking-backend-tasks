package com.personalbanking.personaluser.features.user.service;

import com.personalbanking.personaluser.features.user.dtos.GetFromAccount.FromAccountOptionDto;
import com.personalbanking.personaluser.features.user.dtos.GetMe.GetMeResDto;
import com.personalbanking.personaluser.features.user.dtos.GetRecentTransferList.GetRecentTransferOptionDto;
import com.personalbanking.personaluser.features.user.dtos.GetTransactionHistory.GetTransactionHistoryOptionDto;
import com.personalbanking.personaluser.features.user.dtos.SwitchAccount.AccountDetailsResDto;
import com.personalbanking.personaluser.features.user.dtos.UpdateMe.UpdateMeReqDto;
import com.personalbanking.personaluser.features.user.repository.impl.UserRepositoryImpl;
import com.personalbanking.user.grpc.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@GrpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {
    private final UserRepositoryImpl userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserService(UserRepositoryImpl userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    //demo
    public Long getCurrentLoggedInUserId() { return 1L; }

    @Override
    public void getMe(GetMeReq req, StreamObserver<GetMeRes> responseObserver) {
        try{
            Long userId = getCurrentLoggedInUserId();
            GetMeResDto dto=userRepository.getMe(userId);

            if(dto==null) {
                responseObserver.onError(
                        Status.NOT_FOUND
                                .withDescription("User with this Id is not found"+userId)
                                .asRuntimeException()

                );
                return;
            }
            GetMeRes res=GetMeRes.newBuilder()
                    .setEmail(dto.email())
                    .setUsername(dto.username())
                    .setFullname(dto.fullname())
                    .setPhoneNumber(dto.phoneNumber())
                    .setAddress(dto.address())
                    .setDateOfBirth(dto.dateOfBirth())
                    .setGender(
                            Gender.newBuilder()
                                    .setId(dto.gender().id())
                                    .setName(dto.gender().name())
                                    .build()
                    )

                    .setNationality(
                            Nationality.newBuilder()
                                    .setId(dto.nationality().id())
                                    .setName(dto.nationality().name())
                                    .build()
                    )

                    .setIsPolicyAgreement(dto.isPolicyAgreement())
                    .setIsAutoSaveReceipt(dto.isAutoSaveReceipt())
                    .setIsFirstTimeLogin(dto.isFirstTimeLogin())
                    .setHasInitialPin(dto.hasInitialPin())
                    .setCurrentBalance(dto.currentBalance())

                    .setSelectAccountDetails(
                            SelectAccountDetails.newBuilder()
                                    .setId(dto.selectAccountDetails().id())
                                    .setAccountNumber(dto.selectAccountDetails().accountNumber())
                                    .setBalance(dto.selectAccountDetails().balance())
                                    .build()
                    )
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();


        }catch(Exception ex){
            responseObserver.onError(ex);
            ex.getMessage();
            ex.printStackTrace();
        }

    }
    @Override
    public void updateMe(UpdateMeReq req, StreamObserver<UpdateMeRes> responseObserver) {
        try{
            Long userId = getCurrentLoggedInUserId();
            UpdateMeReqDto update=new UpdateMeReqDto(
                    req.getFullname(),
                    req.getDateOfBirth(),
                    req.getGenderId(),
                    req.getNationalityId(),
                    req.getPhoneNumber(),
                    req.getAddress()
            );

            GetMeResDto dto=userRepository.updateMe(userId, update);
            if(dto==null) {
                responseObserver.onError(
                        Status.INTERNAL
                                .withDescription("Error in Update User Details Service"+userId)
                        .asRuntimeException()
                );
                return;
            }
            UpdateMeRes res=UpdateMeRes.newBuilder()
                    .setEmail(dto.email())
                    .setUsername(dto.username())
                    .setFullname(dto.fullname())
                    .setPhoneNumber(dto.phoneNumber())
                    .setAddress(dto.address())
                    .setDateOfBirth(dto.dateOfBirth())
                    .setGender(
                            Gender.newBuilder()
                                    .setId(dto.gender().id())
                                    .setName(dto.gender().name())
                                    .build()
                    )

                    .setNationality(
                            Nationality.newBuilder()
                                    .setId(dto.nationality().id())
                                    .setName(dto.nationality().name())
                                    .build()
                    )

                    .setIsPolicyAgreement(dto.isPolicyAgreement())
                    .setIsAutoSaveReceipt(dto.isAutoSaveReceipt())
                    .setIsFirstTimeLogin(dto.isFirstTimeLogin())
                    .setHasInitialPin(dto.hasInitialPin())
                    .setCurrentBalance(dto.currentBalance())

                    .setSelectAccountDetails(
                            SelectAccountDetails.newBuilder()
                                    .setId(dto.selectAccountDetails().id())
                                    .setAccountNumber(dto.selectAccountDetails().accountNumber())
                                    .setBalance(dto.selectAccountDetails().balance())
                                    .build()
                    )
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();

        }catch(Exception ex){
            responseObserver.onError(ex);
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    @Override
    public void updateAutoSave(AutoSaveReq req, StreamObserver<AutoSaveRes> responseObserver){
        try{
            Long userId = getCurrentLoggedInUserId();
            boolean update=req.getAutoSaveReceipt();
            String data=userRepository.updateSaveReceipt(userId, update);

            AutoSaveRes res=AutoSaveRes.newBuilder()
                    .setData(data)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }catch(Exception ex){
            responseObserver.onError(ex);
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    @Override
    public void verifyPin(VerifyPinReq request, StreamObserver<VerifyPinRes> responseObserver) {
        if (request.getOldPin() == null) {
            throw new IllegalArgumentException("Old Pin cannot be null");
        }
        try{
            Long userId = getCurrentLoggedInUserId();
            String pin= userRepository.verifyPin(userId);
            if(pin!=null&&passwordEncoder.matches(request.getOldPin(), pin)) {
                VerifyPinRes res= VerifyPinRes.newBuilder()
                        .setData("Verify Successful")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
            }else{
                responseObserver.onError(
                        Status.INTERNAL
                        .withDescription("Invalid PIN")
                                .asRuntimeException()
                );
            }

        }catch(Exception ex){
            responseObserver.onError(ex);
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    @Override
    public void setPin(SetPinReq request, StreamObserver<SetPinRes> responseObserver) {
        try{
            Long userId = getCurrentLoggedInUserId();
            String pin=request.getPin();
            String hashedPin=passwordEncoder.encode(pin);
            String data=userRepository.setPin(userId,hashedPin);

            SetPinRes res= SetPinRes.newBuilder()
                    .setData(data)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();
        }catch(Exception ex){
            responseObserver.onError(ex);
            ex.getMessage();
            ex.printStackTrace();
        }
    }
    @Override
    public void switchAccount(SwitchAccountReq request, StreamObserver<SwitchAccountRes> responseObserver) {
        try {
            Long userId = getCurrentLoggedInUserId();
            int accountId = request.getAccountId();

            // Retrieve all accounts for the given user
            List<AccountDetailsResDto> accountList = userRepository.findAccountById(userId);

            // Check if the accountId is part of the user's accounts
            boolean accountExists = accountList.stream()
                    .anyMatch(account -> account.id() == accountId);

            if (!accountExists) {
                responseObserver.onError(
                        Status.UNAVAILABLE
                                .withDescription("Account not found")
                                .asRuntimeException()
                );
                return; // Return early if account is not found
            }

            // Account found, update selected_account_id
            userRepository.switchAccount(userId, accountId);

            // Send success response
            SwitchAccountRes res = SwitchAccountRes.newBuilder()
                    .setData("Switch Account Successful")
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();

        } catch (Exception ex) {
            responseObserver.onError(ex);
            ex.getMessage();
            ex.printStackTrace();
        }
    }

    @Override
    public void changePassword(ChangePasswordReq request, StreamObserver<ChangePasswordRes> responseObserver) {
        try {
            Long userId = getCurrentLoggedInUserId();

            // Validate inputs
            if (request.getOldPassword() == null || request.getNewPassword() == null) {
                responseObserver.onError(
                        Status.INVALID_ARGUMENT.withDescription("Old Password or New Password cannot be null").asRuntimeException()
                );
                return;
            }

            if (request.getOldPassword().equals(request.getNewPassword())) {
                responseObserver.onError(
                        Status.INVALID_ARGUMENT.withDescription("Old Password and New Password cannot be the same").asRuntimeException()
                );
                return;
            }

            String oldPassword = request.getOldPassword();

            // Retrieve the stored password from the database
            String storedPassword = userRepository.getUserPassword(userId);

            if (storedPassword == null) {
                responseObserver.onError(
                        Status.NOT_FOUND.withDescription("User not found or password is incorrect").asRuntimeException()
                );
                return;
            }

            // Verify if the old password matches the stored password
            if (passwordEncoder.matches(oldPassword, storedPassword)) {
                // Encrypt the new password
                String hashedPassword = passwordEncoder.encode(request.getNewPassword());

                // Update the password in the database
                userRepository.updateUserPassword(userId, hashedPassword);

                // Send success response
                ChangePasswordRes res = ChangePasswordRes.newBuilder()
                        .setData("Password successfully updated")
                        .build();
                responseObserver.onNext(res);
                responseObserver.onCompleted();
            } else {
                responseObserver.onError(
                        Status.PERMISSION_DENIED.withDescription("Incorrect old password").asRuntimeException()
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(
                    Status.INTERNAL.withDescription("An internal error occurred while processing the request").asRuntimeException()
            );
        }
    }

    @Override
    public void agreePolicy(AgreePolicyReq request, StreamObserver<AgreePolicyRes> responseObserver) {
        try {
            Long userId = getCurrentLoggedInUserId();
            boolean agree=request.getPolicyAgreement();
            String data=userRepository.updateAgreePolicy(userId,agree);

            AgreePolicyRes res= AgreePolicyRes.newBuilder()
                    .setData(data)
                    .build();
            responseObserver.onNext(res);
            responseObserver.onCompleted();

        }catch(Exception ex){
            responseObserver.onError(
                    Status.INTERNAL.withDescription("Invalid Param").asRuntimeException()
            );
        }
    }

    @Override
    public void getTransactionHistory(GetTransactionHistoryReq request,
                                      StreamObserver<GetTransactionHistoryRes> responseObserver) {
        try {
            Long userId = getCurrentLoggedInUserId();

            List<GetTransactionHistoryOptionDto> dtos =
                    userRepository.getTransactionHistory(userId);

            List<GetTransactionHistoryOption> protoList = dtos.stream()
                    .map(dto -> {
                        var u=dto.getUserResDto();
                        var a=dto.getAccountResDto();

                        return GetTransactionHistoryOption.newBuilder()
                                .setUser(
                                        User.newBuilder()
                                                .setId(u.id())
                                                .setName(u.name())
                                                .build()
                                )
                                .setAccount(
                                        Account.newBuilder()
                                                .setId(a.id())
                                                .setAccountNumber(a.accountNumber())
                                                .setBalance(a.balance())
                                                .build()
                                )
                                .setIsIncome(dto.isIncome())
                                .build();
                    })
                    .toList();


            // 3) now addAll gets only proto items
            GetTransactionHistoryRes res = GetTransactionHistoryRes.newBuilder()
                    .addAllGetTransactionHistoryOption(protoList)
                    .build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();

        } catch (Exception ex) {
            ex.printStackTrace();
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Failed to get transaction history")
                            .asRuntimeException()
            );
        }
    }

    @Override
    public void getRecentTransferList(GetRecentTransferListReq request,
                                      StreamObserver<GetRecentTransferListRes> responseObserver) {
        try {
            Long userId = getCurrentLoggedInUserId();
            List<GetRecentTransferOptionDto> dtos =
                    userRepository.getRecentTransferList(userId);

            List<GetRecentTransferOption> protoList = dtos.stream()
                    .map(dto -> {
                        var u=dto.getUserResDto();
                        var a=dto.getAccountResDto();

                        return GetRecentTransferOption.newBuilder()
                                .setUser(
                                        User.newBuilder()
                                                .setId(u.id())
                                                .setName(u.name())
                                                .build()
                                )
                                .setAccount(
                                        Account.newBuilder()
                                                .setId(a.id())
                                                .setAccountNumber(a.accountNumber())
                                                .setBalance(a.balance())
                                                .build()
                                )
                                .setIsIncome(dto.isIncome())
                                .build();
                    })
                    .toList();


            // 3) now addAll gets only proto items
            GetRecentTransferListRes res = GetRecentTransferListRes.newBuilder()
                    .addAllGetRecentTransferOption(protoList)
                    .build();

            responseObserver.onNext(res);
            responseObserver.onCompleted();

        } catch (Exception ex) {
            ex.printStackTrace();
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Failed to get transaction history")
                            .asRuntimeException()
            );
        }
    }

    @Override
    public void getFromAccounts(GetFromAccountsRequest request, StreamObserver<GetFromAccountsResponse> responseObserver) {

        Long userId = getCurrentLoggedInUserId();

        List<FromAccountOptionDto> fromAccountOptions = userRepository.findAllFromAccountsByUserId(userId);

        List<FromAccountOption> fromAccountOptionsGrpc = fromAccountOptions.stream().map(this::toFromAccountOptionsGrpc).toList();

        FromAccountData data = toFromAccountData(fromAccountOptionsGrpc);

        GetFromAccountsResponse response = toGetFromAccountsResponse(data);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private GetFromAccountsResponse toGetFromAccountsResponse(FromAccountData data) {
        return GetFromAccountsResponse.newBuilder().setData(data).build();
    }

    private FromAccountData toFromAccountData(List<FromAccountOption> fromAccList) {
        return FromAccountData.newBuilder()
                .addAllFromAccountOptions(fromAccList)
                .build();
    }

    private FromAccountOption toFromAccountOptionsGrpc(FromAccountOptionDto dto) {
        return FromAccountOption.newBuilder()
                .setId(dto.id())
                .setAccountNumber(dto.accountNumber())
                .setBalance(dto.balance())
                .build();
    }
}
