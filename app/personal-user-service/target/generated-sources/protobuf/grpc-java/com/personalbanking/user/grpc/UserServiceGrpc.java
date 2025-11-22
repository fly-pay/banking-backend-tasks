package com.personalbanking.user.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: user-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.personalbanking.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetMeReq,
      com.personalbanking.user.grpc.GetMeRes> getGetMeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMe",
      requestType = com.personalbanking.user.grpc.GetMeReq.class,
      responseType = com.personalbanking.user.grpc.GetMeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetMeReq,
      com.personalbanking.user.grpc.GetMeRes> getGetMeMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetMeReq, com.personalbanking.user.grpc.GetMeRes> getGetMeMethod;
    if ((getGetMeMethod = UserServiceGrpc.getGetMeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetMeMethod = UserServiceGrpc.getGetMeMethod) == null) {
          UserServiceGrpc.getGetMeMethod = getGetMeMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.GetMeReq, com.personalbanking.user.grpc.GetMeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetMeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetMeRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetMe"))
              .build();
        }
      }
    }
    return getGetMeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.UpdateMeReq,
      com.personalbanking.user.grpc.UpdateMeRes> getUpdateMeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMe",
      requestType = com.personalbanking.user.grpc.UpdateMeReq.class,
      responseType = com.personalbanking.user.grpc.UpdateMeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.UpdateMeReq,
      com.personalbanking.user.grpc.UpdateMeRes> getUpdateMeMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.UpdateMeReq, com.personalbanking.user.grpc.UpdateMeRes> getUpdateMeMethod;
    if ((getUpdateMeMethod = UserServiceGrpc.getUpdateMeMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateMeMethod = UserServiceGrpc.getUpdateMeMethod) == null) {
          UserServiceGrpc.getUpdateMeMethod = getUpdateMeMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.UpdateMeReq, com.personalbanking.user.grpc.UpdateMeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.UpdateMeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.UpdateMeRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateMe"))
              .build();
        }
      }
    }
    return getUpdateMeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.AutoSaveReq,
      com.personalbanking.user.grpc.AutoSaveRes> getUpdateAutoSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAutoSave",
      requestType = com.personalbanking.user.grpc.AutoSaveReq.class,
      responseType = com.personalbanking.user.grpc.AutoSaveRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.AutoSaveReq,
      com.personalbanking.user.grpc.AutoSaveRes> getUpdateAutoSaveMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.AutoSaveReq, com.personalbanking.user.grpc.AutoSaveRes> getUpdateAutoSaveMethod;
    if ((getUpdateAutoSaveMethod = UserServiceGrpc.getUpdateAutoSaveMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateAutoSaveMethod = UserServiceGrpc.getUpdateAutoSaveMethod) == null) {
          UserServiceGrpc.getUpdateAutoSaveMethod = getUpdateAutoSaveMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.AutoSaveReq, com.personalbanking.user.grpc.AutoSaveRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAutoSave"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.AutoSaveReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.AutoSaveRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateAutoSave"))
              .build();
        }
      }
    }
    return getUpdateAutoSaveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.VerifyPinReq,
      com.personalbanking.user.grpc.VerifyPinRes> getVerifyPinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyPin",
      requestType = com.personalbanking.user.grpc.VerifyPinReq.class,
      responseType = com.personalbanking.user.grpc.VerifyPinRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.VerifyPinReq,
      com.personalbanking.user.grpc.VerifyPinRes> getVerifyPinMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.VerifyPinReq, com.personalbanking.user.grpc.VerifyPinRes> getVerifyPinMethod;
    if ((getVerifyPinMethod = UserServiceGrpc.getVerifyPinMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerifyPinMethod = UserServiceGrpc.getVerifyPinMethod) == null) {
          UserServiceGrpc.getVerifyPinMethod = getVerifyPinMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.VerifyPinReq, com.personalbanking.user.grpc.VerifyPinRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyPin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.VerifyPinReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.VerifyPinRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerifyPin"))
              .build();
        }
      }
    }
    return getVerifyPinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.SwitchAccountReq,
      com.personalbanking.user.grpc.SwitchAccountRes> getSwitchAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SwitchAccount",
      requestType = com.personalbanking.user.grpc.SwitchAccountReq.class,
      responseType = com.personalbanking.user.grpc.SwitchAccountRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.SwitchAccountReq,
      com.personalbanking.user.grpc.SwitchAccountRes> getSwitchAccountMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.SwitchAccountReq, com.personalbanking.user.grpc.SwitchAccountRes> getSwitchAccountMethod;
    if ((getSwitchAccountMethod = UserServiceGrpc.getSwitchAccountMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSwitchAccountMethod = UserServiceGrpc.getSwitchAccountMethod) == null) {
          UserServiceGrpc.getSwitchAccountMethod = getSwitchAccountMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.SwitchAccountReq, com.personalbanking.user.grpc.SwitchAccountRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SwitchAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.SwitchAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.SwitchAccountRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SwitchAccount"))
              .build();
        }
      }
    }
    return getSwitchAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.SetPinReq,
      com.personalbanking.user.grpc.SetPinRes> getSetPinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPin",
      requestType = com.personalbanking.user.grpc.SetPinReq.class,
      responseType = com.personalbanking.user.grpc.SetPinRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.SetPinReq,
      com.personalbanking.user.grpc.SetPinRes> getSetPinMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.SetPinReq, com.personalbanking.user.grpc.SetPinRes> getSetPinMethod;
    if ((getSetPinMethod = UserServiceGrpc.getSetPinMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSetPinMethod = UserServiceGrpc.getSetPinMethod) == null) {
          UserServiceGrpc.getSetPinMethod = getSetPinMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.SetPinReq, com.personalbanking.user.grpc.SetPinRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.SetPinReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.SetPinRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SetPin"))
              .build();
        }
      }
    }
    return getSetPinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.ChangePasswordReq,
      com.personalbanking.user.grpc.ChangePasswordRes> getChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangePassword",
      requestType = com.personalbanking.user.grpc.ChangePasswordReq.class,
      responseType = com.personalbanking.user.grpc.ChangePasswordRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.ChangePasswordReq,
      com.personalbanking.user.grpc.ChangePasswordRes> getChangePasswordMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.ChangePasswordReq, com.personalbanking.user.grpc.ChangePasswordRes> getChangePasswordMethod;
    if ((getChangePasswordMethod = UserServiceGrpc.getChangePasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getChangePasswordMethod = UserServiceGrpc.getChangePasswordMethod) == null) {
          UserServiceGrpc.getChangePasswordMethod = getChangePasswordMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.ChangePasswordReq, com.personalbanking.user.grpc.ChangePasswordRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.ChangePasswordReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.ChangePasswordRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ChangePassword"))
              .build();
        }
      }
    }
    return getChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.AgreePolicyReq,
      com.personalbanking.user.grpc.AgreePolicyRes> getAgreePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AgreePolicy",
      requestType = com.personalbanking.user.grpc.AgreePolicyReq.class,
      responseType = com.personalbanking.user.grpc.AgreePolicyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.AgreePolicyReq,
      com.personalbanking.user.grpc.AgreePolicyRes> getAgreePolicyMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.AgreePolicyReq, com.personalbanking.user.grpc.AgreePolicyRes> getAgreePolicyMethod;
    if ((getAgreePolicyMethod = UserServiceGrpc.getAgreePolicyMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAgreePolicyMethod = UserServiceGrpc.getAgreePolicyMethod) == null) {
          UserServiceGrpc.getAgreePolicyMethod = getAgreePolicyMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.AgreePolicyReq, com.personalbanking.user.grpc.AgreePolicyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AgreePolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.AgreePolicyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.AgreePolicyRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AgreePolicy"))
              .build();
        }
      }
    }
    return getAgreePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetTransactionHistoryReq,
      com.personalbanking.user.grpc.GetTransactionHistoryRes> getGetTransactionHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransactionHistory",
      requestType = com.personalbanking.user.grpc.GetTransactionHistoryReq.class,
      responseType = com.personalbanking.user.grpc.GetTransactionHistoryRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetTransactionHistoryReq,
      com.personalbanking.user.grpc.GetTransactionHistoryRes> getGetTransactionHistoryMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetTransactionHistoryReq, com.personalbanking.user.grpc.GetTransactionHistoryRes> getGetTransactionHistoryMethod;
    if ((getGetTransactionHistoryMethod = UserServiceGrpc.getGetTransactionHistoryMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetTransactionHistoryMethod = UserServiceGrpc.getGetTransactionHistoryMethod) == null) {
          UserServiceGrpc.getGetTransactionHistoryMethod = getGetTransactionHistoryMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.GetTransactionHistoryReq, com.personalbanking.user.grpc.GetTransactionHistoryRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTransactionHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetTransactionHistoryReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetTransactionHistoryRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetTransactionHistory"))
              .build();
        }
      }
    }
    return getGetTransactionHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetRecentTransferListReq,
      com.personalbanking.user.grpc.GetRecentTransferListRes> getGetRecentTransferListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecentTransferList",
      requestType = com.personalbanking.user.grpc.GetRecentTransferListReq.class,
      responseType = com.personalbanking.user.grpc.GetRecentTransferListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetRecentTransferListReq,
      com.personalbanking.user.grpc.GetRecentTransferListRes> getGetRecentTransferListMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetRecentTransferListReq, com.personalbanking.user.grpc.GetRecentTransferListRes> getGetRecentTransferListMethod;
    if ((getGetRecentTransferListMethod = UserServiceGrpc.getGetRecentTransferListMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetRecentTransferListMethod = UserServiceGrpc.getGetRecentTransferListMethod) == null) {
          UserServiceGrpc.getGetRecentTransferListMethod = getGetRecentTransferListMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.GetRecentTransferListReq, com.personalbanking.user.grpc.GetRecentTransferListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecentTransferList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetRecentTransferListReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetRecentTransferListRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetRecentTransferList"))
              .build();
        }
      }
    }
    return getGetRecentTransferListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetFromAccountReq,
      com.personalbanking.user.grpc.GetFromAccountRes> getGetFromAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFromAccounts",
      requestType = com.personalbanking.user.grpc.GetFromAccountReq.class,
      responseType = com.personalbanking.user.grpc.GetFromAccountRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetFromAccountReq,
      com.personalbanking.user.grpc.GetFromAccountRes> getGetFromAccountsMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.user.grpc.GetFromAccountReq, com.personalbanking.user.grpc.GetFromAccountRes> getGetFromAccountsMethod;
    if ((getGetFromAccountsMethod = UserServiceGrpc.getGetFromAccountsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetFromAccountsMethod = UserServiceGrpc.getGetFromAccountsMethod) == null) {
          UserServiceGrpc.getGetFromAccountsMethod = getGetFromAccountsMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.user.grpc.GetFromAccountReq, com.personalbanking.user.grpc.GetFromAccountRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFromAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetFromAccountReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.user.grpc.GetFromAccountRes.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetFromAccounts"))
              .build();
        }
      }
    }
    return getGetFromAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getMe(com.personalbanking.user.grpc.GetMeReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetMeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMeMethod(), responseObserver);
    }

    /**
     */
    default void updateMe(com.personalbanking.user.grpc.UpdateMeReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.UpdateMeRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMeMethod(), responseObserver);
    }

    /**
     */
    default void updateAutoSave(com.personalbanking.user.grpc.AutoSaveReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.AutoSaveRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAutoSaveMethod(), responseObserver);
    }

    /**
     */
    default void verifyPin(com.personalbanking.user.grpc.VerifyPinReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.VerifyPinRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyPinMethod(), responseObserver);
    }

    /**
     */
    default void switchAccount(com.personalbanking.user.grpc.SwitchAccountReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.SwitchAccountRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSwitchAccountMethod(), responseObserver);
    }

    /**
     */
    default void setPin(com.personalbanking.user.grpc.SetPinReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.SetPinRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPinMethod(), responseObserver);
    }

    /**
     */
    default void changePassword(com.personalbanking.user.grpc.ChangePasswordReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.ChangePasswordRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    /**
     */
    default void agreePolicy(com.personalbanking.user.grpc.AgreePolicyReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.AgreePolicyRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAgreePolicyMethod(), responseObserver);
    }

    /**
     */
    default void getTransactionHistory(com.personalbanking.user.grpc.GetTransactionHistoryReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetTransactionHistoryRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTransactionHistoryMethod(), responseObserver);
    }

    /**
     */
    default void getRecentTransferList(com.personalbanking.user.grpc.GetRecentTransferListReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetRecentTransferListRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecentTransferListMethod(), responseObserver);
    }

    /**
     */
    default void getFromAccounts(com.personalbanking.user.grpc.GetFromAccountReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetFromAccountRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFromAccountsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getMe(com.personalbanking.user.grpc.GetMeReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetMeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMe(com.personalbanking.user.grpc.UpdateMeReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.UpdateMeRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAutoSave(com.personalbanking.user.grpc.AutoSaveReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.AutoSaveRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAutoSaveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyPin(com.personalbanking.user.grpc.VerifyPinReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.VerifyPinRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyPinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void switchAccount(com.personalbanking.user.grpc.SwitchAccountReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.SwitchAccountRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSwitchAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setPin(com.personalbanking.user.grpc.SetPinReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.SetPinRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePassword(com.personalbanking.user.grpc.ChangePasswordReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.ChangePasswordRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void agreePolicy(com.personalbanking.user.grpc.AgreePolicyReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.AgreePolicyRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAgreePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTransactionHistory(com.personalbanking.user.grpc.GetTransactionHistoryReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetTransactionHistoryRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTransactionHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecentTransferList(com.personalbanking.user.grpc.GetRecentTransferListReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetRecentTransferListRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecentTransferListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFromAccounts(com.personalbanking.user.grpc.GetFromAccountReq request,
        io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetFromAccountRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFromAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.personalbanking.user.grpc.GetMeRes getMe(com.personalbanking.user.grpc.GetMeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.UpdateMeRes updateMe(com.personalbanking.user.grpc.UpdateMeReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.AutoSaveRes updateAutoSave(com.personalbanking.user.grpc.AutoSaveReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAutoSaveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.VerifyPinRes verifyPin(com.personalbanking.user.grpc.VerifyPinReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyPinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.SwitchAccountRes switchAccount(com.personalbanking.user.grpc.SwitchAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSwitchAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.SetPinRes setPin(com.personalbanking.user.grpc.SetPinReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.ChangePasswordRes changePassword(com.personalbanking.user.grpc.ChangePasswordReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.AgreePolicyRes agreePolicy(com.personalbanking.user.grpc.AgreePolicyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAgreePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.GetTransactionHistoryRes getTransactionHistory(com.personalbanking.user.grpc.GetTransactionHistoryReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTransactionHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.GetRecentTransferListRes getRecentTransferList(com.personalbanking.user.grpc.GetRecentTransferListReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecentTransferListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.personalbanking.user.grpc.GetFromAccountRes getFromAccounts(com.personalbanking.user.grpc.GetFromAccountReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFromAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.GetMeRes> getMe(
        com.personalbanking.user.grpc.GetMeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.UpdateMeRes> updateMe(
        com.personalbanking.user.grpc.UpdateMeReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.AutoSaveRes> updateAutoSave(
        com.personalbanking.user.grpc.AutoSaveReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAutoSaveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.VerifyPinRes> verifyPin(
        com.personalbanking.user.grpc.VerifyPinReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyPinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.SwitchAccountRes> switchAccount(
        com.personalbanking.user.grpc.SwitchAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSwitchAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.SetPinRes> setPin(
        com.personalbanking.user.grpc.SetPinReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.ChangePasswordRes> changePassword(
        com.personalbanking.user.grpc.ChangePasswordReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.AgreePolicyRes> agreePolicy(
        com.personalbanking.user.grpc.AgreePolicyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAgreePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.GetTransactionHistoryRes> getTransactionHistory(
        com.personalbanking.user.grpc.GetTransactionHistoryReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTransactionHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.GetRecentTransferListRes> getRecentTransferList(
        com.personalbanking.user.grpc.GetRecentTransferListReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecentTransferListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.user.grpc.GetFromAccountRes> getFromAccounts(
        com.personalbanking.user.grpc.GetFromAccountReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFromAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ME = 0;
  private static final int METHODID_UPDATE_ME = 1;
  private static final int METHODID_UPDATE_AUTO_SAVE = 2;
  private static final int METHODID_VERIFY_PIN = 3;
  private static final int METHODID_SWITCH_ACCOUNT = 4;
  private static final int METHODID_SET_PIN = 5;
  private static final int METHODID_CHANGE_PASSWORD = 6;
  private static final int METHODID_AGREE_POLICY = 7;
  private static final int METHODID_GET_TRANSACTION_HISTORY = 8;
  private static final int METHODID_GET_RECENT_TRANSFER_LIST = 9;
  private static final int METHODID_GET_FROM_ACCOUNTS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ME:
          serviceImpl.getMe((com.personalbanking.user.grpc.GetMeReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetMeRes>) responseObserver);
          break;
        case METHODID_UPDATE_ME:
          serviceImpl.updateMe((com.personalbanking.user.grpc.UpdateMeReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.UpdateMeRes>) responseObserver);
          break;
        case METHODID_UPDATE_AUTO_SAVE:
          serviceImpl.updateAutoSave((com.personalbanking.user.grpc.AutoSaveReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.AutoSaveRes>) responseObserver);
          break;
        case METHODID_VERIFY_PIN:
          serviceImpl.verifyPin((com.personalbanking.user.grpc.VerifyPinReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.VerifyPinRes>) responseObserver);
          break;
        case METHODID_SWITCH_ACCOUNT:
          serviceImpl.switchAccount((com.personalbanking.user.grpc.SwitchAccountReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.SwitchAccountRes>) responseObserver);
          break;
        case METHODID_SET_PIN:
          serviceImpl.setPin((com.personalbanking.user.grpc.SetPinReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.SetPinRes>) responseObserver);
          break;
        case METHODID_CHANGE_PASSWORD:
          serviceImpl.changePassword((com.personalbanking.user.grpc.ChangePasswordReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.ChangePasswordRes>) responseObserver);
          break;
        case METHODID_AGREE_POLICY:
          serviceImpl.agreePolicy((com.personalbanking.user.grpc.AgreePolicyReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.AgreePolicyRes>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION_HISTORY:
          serviceImpl.getTransactionHistory((com.personalbanking.user.grpc.GetTransactionHistoryReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetTransactionHistoryRes>) responseObserver);
          break;
        case METHODID_GET_RECENT_TRANSFER_LIST:
          serviceImpl.getRecentTransferList((com.personalbanking.user.grpc.GetRecentTransferListReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetRecentTransferListRes>) responseObserver);
          break;
        case METHODID_GET_FROM_ACCOUNTS:
          serviceImpl.getFromAccounts((com.personalbanking.user.grpc.GetFromAccountReq) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.user.grpc.GetFromAccountRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.GetMeReq,
              com.personalbanking.user.grpc.GetMeRes>(
                service, METHODID_GET_ME)))
        .addMethod(
          getUpdateMeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.UpdateMeReq,
              com.personalbanking.user.grpc.UpdateMeRes>(
                service, METHODID_UPDATE_ME)))
        .addMethod(
          getUpdateAutoSaveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.AutoSaveReq,
              com.personalbanking.user.grpc.AutoSaveRes>(
                service, METHODID_UPDATE_AUTO_SAVE)))
        .addMethod(
          getVerifyPinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.VerifyPinReq,
              com.personalbanking.user.grpc.VerifyPinRes>(
                service, METHODID_VERIFY_PIN)))
        .addMethod(
          getSwitchAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.SwitchAccountReq,
              com.personalbanking.user.grpc.SwitchAccountRes>(
                service, METHODID_SWITCH_ACCOUNT)))
        .addMethod(
          getSetPinMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.SetPinReq,
              com.personalbanking.user.grpc.SetPinRes>(
                service, METHODID_SET_PIN)))
        .addMethod(
          getChangePasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.ChangePasswordReq,
              com.personalbanking.user.grpc.ChangePasswordRes>(
                service, METHODID_CHANGE_PASSWORD)))
        .addMethod(
          getAgreePolicyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.AgreePolicyReq,
              com.personalbanking.user.grpc.AgreePolicyRes>(
                service, METHODID_AGREE_POLICY)))
        .addMethod(
          getGetTransactionHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.GetTransactionHistoryReq,
              com.personalbanking.user.grpc.GetTransactionHistoryRes>(
                service, METHODID_GET_TRANSACTION_HISTORY)))
        .addMethod(
          getGetRecentTransferListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.GetRecentTransferListReq,
              com.personalbanking.user.grpc.GetRecentTransferListRes>(
                service, METHODID_GET_RECENT_TRANSFER_LIST)))
        .addMethod(
          getGetFromAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.user.grpc.GetFromAccountReq,
              com.personalbanking.user.grpc.GetFromAccountRes>(
                service, METHODID_GET_FROM_ACCOUNTS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.personalbanking.user.grpc.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetMeMethod())
              .addMethod(getUpdateMeMethod())
              .addMethod(getUpdateAutoSaveMethod())
              .addMethod(getVerifyPinMethod())
              .addMethod(getSwitchAccountMethod())
              .addMethod(getSetPinMethod())
              .addMethod(getChangePasswordMethod())
              .addMethod(getAgreePolicyMethod())
              .addMethod(getGetTransactionHistoryMethod())
              .addMethod(getGetRecentTransferListMethod())
              .addMethod(getGetFromAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
