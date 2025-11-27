package com.personalbanking.gateway.controller.usercontroller;


import com.personalbanking.gateway.dto.userdtos.ChangePassword.ChangePasswordReqDto;
import com.personalbanking.gateway.dto.userdtos.GetFromAccount.FromAccountDataDto;
import com.personalbanking.gateway.dto.userdtos.GetFromAccount.FromAccountOptionDto;
import com.personalbanking.gateway.dto.userdtos.GetFromAccount.GetFromAccountResponseDto;
import com.personalbanking.gateway.dto.userdtos.GetMe.GenderDto;
import com.personalbanking.gateway.dto.userdtos.GetMe.GetMeResDto;
import com.personalbanking.gateway.dto.userdtos.GetMe.NationalityDto;
import com.personalbanking.gateway.dto.userdtos.GetMe.SelectAccountDetailsDto;
import com.personalbanking.gateway.dto.userdtos.GetTransactionHistory.GetAccountResDto;
import com.personalbanking.gateway.dto.userdtos.GetTransactionHistory.GetTransactionHistoryOptionDto;
import com.personalbanking.gateway.dto.userdtos.GetTransactionHistory.GetUserResDto;
import com.personalbanking.gateway.dto.userdtos.SetPin.SetPinReqDto;
import com.personalbanking.gateway.dto.userdtos.SwitchAccount.SwitchAccountReqDto;
import com.personalbanking.gateway.dto.userdtos.UpdateMe.UpdateMeReqDto;
import com.personalbanking.gateway.dto.userdtos.VerifyPin.VerifyPinReqDto;
import com.personalbanking.user.grpc.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/personal-banking/users")
public class UserController {
    @GrpcClient("personal-user-service")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @GetMapping("/me")
    public ResponseEntity<GetMeResDto> getPersonalDetails(){
        return ResponseEntity.ok(getMeResDto());
    }
    private GetMeResDto getMeResDto(){
        GetMeReq req=GetMeReq.newBuilder().build();
        GetMeRes res=userServiceBlockingStub.getMe(req);

        return new GetMeResDto(
                res.getEmail(),
                res.getUsername(),
                res.getFullname(),
                res.getPhoneNumber(),
                res.getAddress(),
                res.getDateOfBirth(),
                new GenderDto(
                        res.getGender().getId(),
                        res.getGender().getName()
                ),
                new NationalityDto(
                        res.getNationality().getId(),
                        res.getNationality().getName()
                ),
                res.getIsPolicyAgreement(),
                res.getIsAutoSaveReceipt(),
                res.getIsFirstTimeLogin(),
                res.getHasInitialPin(),
                res.getCurrentBalance(),
                new SelectAccountDetailsDto(
                        res.getSelectAccountDetails().getId(),
                        res.getSelectAccountDetails().getAccountNumber(),
                        res.getSelectAccountDetails().getBalance()
                )
        );
    }

    @PatchMapping("/me")
    public ResponseEntity<GetMeResDto> updatePersonalDetails(@RequestBody UpdateMeReqDto req){
        return ResponseEntity.ok(updateMeRes(req));
    }
    private GetMeResDto updateMeRes(UpdateMeReqDto updateMeReqDto) {
        UpdateMeReq req = UpdateMeReq.newBuilder()
                .setFullname(updateMeReqDto.fullname())
                .setDateOfBirth(updateMeReqDto.dateOfBirth())
                .setGenderId(String.valueOf(updateMeReqDto.genderId()))
                .setNationalityId(updateMeReqDto.nationalityId())
                .setPhoneNumber(updateMeReqDto.phoneNumber())
                .setAddress(updateMeReqDto.address())
                .build();
        UpdateMeRes res=userServiceBlockingStub.updateMe(req);

        return new GetMeResDto(
                res.getEmail(),
                res.getUsername(),
                res.getFullname(),
                res.getPhoneNumber(),
                res.getAddress(),
                res.getDateOfBirth(),
                new GenderDto(
                        res.getGender().getId(),
                        res.getGender().getName()
                ),
                new NationalityDto(
                        res.getNationality().getId(),
                        res.getNationality().getName()
                ),
                res.getIsPolicyAgreement(),
                res.getIsAutoSaveReceipt(),
                res.getIsFirstTimeLogin(),
                res.getHasInitialPin(),
                res.getCurrentBalance(),
                new SelectAccountDetailsDto(
                        res.getSelectAccountDetails().getId(),
                        res.getSelectAccountDetails().getAccountNumber(),
                        res.getSelectAccountDetails().getBalance()
                )
        );
    }

    @PutMapping("/autoSaveReceipt")
    public ResponseEntity<String> updateAutoSave(@RequestParam("flag") boolean autoSaveReceipt){
        return ResponseEntity.ok(updateSave(autoSaveReceipt));
    }
    private String updateSave(boolean autoSaveReceipt){
        AutoSaveReq req=AutoSaveReq.newBuilder()
                .setAutoSaveReceipt(autoSaveReceipt)
                .build();
        AutoSaveRes res=userServiceBlockingStub.updateAutoSave(req);
        System.out.println(res);
        return String.valueOf(res);
    }

    @PostMapping("/verify-pin")
    public ResponseEntity<String> verifyPin(@RequestBody VerifyPinReqDto pinReqDto){
        return ResponseEntity.ok(verifyUserPin(pinReqDto));
    }
    private String verifyUserPin(VerifyPinReqDto verifyPinReqDto){
        VerifyPinReq req=VerifyPinReq.newBuilder()
                .setOldPin(verifyPinReqDto.pin())
                .build();
        VerifyPinRes res=userServiceBlockingStub.verifyPin(req);
        return String.valueOf(res);
    }

    @PostMapping("/set-pin")
    public ResponseEntity<String> setPin(@RequestBody SetPinReqDto setPinReqDto){
        return ResponseEntity.ok(setUserPin(setPinReqDto));
    }

    private String setUserPin(SetPinReqDto setPinReqDto) {
        SetPinReq req=SetPinReq.newBuilder()
                .setPin(setPinReqDto.pin())
                .build();
        SetPinRes res=userServiceBlockingStub.setPin(req);
        System.out.println(res);
        return String.valueOf(res);
    }

    @PostMapping("switch-account")
    public ResponseEntity<String> switchAccount(@RequestBody SwitchAccountReqDto switchAccountReqDto){
        return ResponseEntity.ok(switchAcc(switchAccountReqDto));
    }

    private String switchAcc(SwitchAccountReqDto switchAccountReqDto) {
        SwitchAccountReq req=SwitchAccountReq.newBuilder()
                .setAccountId(switchAccountReqDto.accountId())
                .build();
        SwitchAccountRes res=userServiceBlockingStub.switchAccount(req);
        return String.valueOf(res);
    }

    @PostMapping("change-password")
    public ResponseEntity<String> changePassword(@RequestBody ChangePasswordReqDto changePasswordReqDto){
        return ResponseEntity.ok(changePwd(changePasswordReqDto));
    }
    private String changePwd(ChangePasswordReqDto changePasswordReqDto){
        ChangePasswordReq req=ChangePasswordReq.newBuilder()
                .setOldPassword(changePasswordReqDto.oldPassword())
                .setNewPassword(changePasswordReqDto.newPassword())
                .build();
        ChangePasswordRes res=userServiceBlockingStub.changePassword(req);
        return String.valueOf(res);
    }

    @PostMapping("agree-policy")
    public ResponseEntity<String> agreePolicy(@RequestParam("agree")  boolean agree){
        return ResponseEntity.ok(agreePolicyMethod(agree));
    }

    private String agreePolicyMethod(boolean agree) {
        AgreePolicyReq req= AgreePolicyReq.newBuilder()
                .setPolicyAgreement(agree)
                .build();
        AgreePolicyRes res=userServiceBlockingStub.agreePolicy(req);
        return String.valueOf(res);
    }

    @GetMapping("transaction-history")
    public ResponseEntity<List<GetTransactionHistoryOptionDto>> getTransactionHistory(){
        return ResponseEntity.ok(getTransactionHist());
    }

    private List<GetTransactionHistoryOptionDto> getTransactionHist() {
        GetTransactionHistoryReq req=GetTransactionHistoryReq.newBuilder().build();
        GetTransactionHistoryRes res=userServiceBlockingStub.getTransactionHistory(req);

        List<GetTransactionHistoryOptionDto> restList =
                res.getGetTransactionHistoryOptionList().stream()
                        .map(p -> new GetTransactionHistoryOptionDto(
                                new GetUserResDto(
                                        p.getUser().getId(),
                                        p.getUser().getName()
                                ),
                                new GetAccountResDto(
                                        p.getAccount().getId(),
                                        p.getAccount().getAccountNumber(),
                                        p.getAccount().getBalance()
                                ),
                                p.getIsIncome()
                        ))
                        .toList();
        return restList;
    }


    @GetMapping("recent-transfer-list")
    public ResponseEntity<List<GetTransactionHistoryOptionDto>> getRecentTransferList(){
        return ResponseEntity.ok(getRecentTransfer());
    }
    private List<GetTransactionHistoryOptionDto> getRecentTransfer() {
        GetRecentTransferListReq req=GetRecentTransferListReq.newBuilder().build();
        GetRecentTransferListRes res=userServiceBlockingStub.getRecentTransferList(req);
        List<GetTransactionHistoryOptionDto> restList =
                res.getGetRecentTransferOptionList().stream()
                        .map(p -> new GetTransactionHistoryOptionDto(
                                new GetUserResDto(
                                        p.getUser().getId(),
                                        p.getUser().getName()
                                ),
                                new GetAccountResDto(
                                        p.getAccount().getId(),
                                        p.getAccount().getAccountNumber(),
                                        p.getAccount().getBalance()
                                ),
                                p.getIsIncome()
                        ))
                        .toList();
        return restList;
    }

    @GetMapping("/from-accounts")
    public ResponseEntity<GetFromAccountResponseDto> getUsersFromAccounts() {
        return ResponseEntity.ok(getFromAccountResponseDto());
    }

    private GetFromAccountResponseDto getFromAccountResponseDto() {
        GetFromAccountsRequest req=GetFromAccountsRequest.newBuilder().build();
        GetFromAccountsResponse res=userServiceBlockingStub.getFromAccounts(req);

        FromAccountDataDto fromAccountDataDto = new FromAccountDataDto(extractAccountOptions(res));
        return new GetFromAccountResponseDto(fromAccountDataDto);
    }

    private List<FromAccountOptionDto> extractAccountOptions(GetFromAccountsResponse response) {

        FromAccountData fromAccountData = response.getData();
        List<FromAccountOption> fromAccountOptions = fromAccountData.getFromAccountOptionsList();
        return fromAccountOptions.stream()
                .map(this::toFromAccontOptionDto).toList();
    }

    private FromAccountOptionDto toFromAccontOptionDto(FromAccountOption fromAccountOption) {
        return new FromAccountOptionDto(
                fromAccountOption.getId(),
                fromAccountOption.getAccountNumber(),
                fromAccountOption.getBalance()
        );
    }
}
