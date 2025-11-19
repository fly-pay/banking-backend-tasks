package com.corporatebanking.nickname.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: nickname.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NicknameServiceGrpc {

  private NicknameServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.corporatebanking.nickname.NicknameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.CreateNicknameRequest,
      com.corporatebanking.nickname.grpc.NicknameResponse> getCreateNicknameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNickname",
      requestType = com.corporatebanking.nickname.grpc.CreateNicknameRequest.class,
      responseType = com.corporatebanking.nickname.grpc.NicknameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.CreateNicknameRequest,
      com.corporatebanking.nickname.grpc.NicknameResponse> getCreateNicknameMethod() {
    io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.CreateNicknameRequest, com.corporatebanking.nickname.grpc.NicknameResponse> getCreateNicknameMethod;
    if ((getCreateNicknameMethod = NicknameServiceGrpc.getCreateNicknameMethod) == null) {
      synchronized (NicknameServiceGrpc.class) {
        if ((getCreateNicknameMethod = NicknameServiceGrpc.getCreateNicknameMethod) == null) {
          NicknameServiceGrpc.getCreateNicknameMethod = getCreateNicknameMethod =
              io.grpc.MethodDescriptor.<com.corporatebanking.nickname.grpc.CreateNicknameRequest, com.corporatebanking.nickname.grpc.NicknameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNickname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.CreateNicknameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.NicknameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NicknameServiceMethodDescriptorSupplier("CreateNickname"))
              .build();
        }
      }
    }
    return getCreateNicknameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.GetNicknameRequest,
      com.corporatebanking.nickname.grpc.NicknameResponse> getGetNicknameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNickname",
      requestType = com.corporatebanking.nickname.grpc.GetNicknameRequest.class,
      responseType = com.corporatebanking.nickname.grpc.NicknameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.GetNicknameRequest,
      com.corporatebanking.nickname.grpc.NicknameResponse> getGetNicknameMethod() {
    io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.GetNicknameRequest, com.corporatebanking.nickname.grpc.NicknameResponse> getGetNicknameMethod;
    if ((getGetNicknameMethod = NicknameServiceGrpc.getGetNicknameMethod) == null) {
      synchronized (NicknameServiceGrpc.class) {
        if ((getGetNicknameMethod = NicknameServiceGrpc.getGetNicknameMethod) == null) {
          NicknameServiceGrpc.getGetNicknameMethod = getGetNicknameMethod =
              io.grpc.MethodDescriptor.<com.corporatebanking.nickname.grpc.GetNicknameRequest, com.corporatebanking.nickname.grpc.NicknameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNickname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.GetNicknameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.NicknameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NicknameServiceMethodDescriptorSupplier("GetNickname"))
              .build();
        }
      }
    }
    return getGetNicknameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.GetAllNicknamesRequest,
      com.corporatebanking.nickname.grpc.NicknameListResponse> getGetAllNicknamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllNicknames",
      requestType = com.corporatebanking.nickname.grpc.GetAllNicknamesRequest.class,
      responseType = com.corporatebanking.nickname.grpc.NicknameListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.GetAllNicknamesRequest,
      com.corporatebanking.nickname.grpc.NicknameListResponse> getGetAllNicknamesMethod() {
    io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.GetAllNicknamesRequest, com.corporatebanking.nickname.grpc.NicknameListResponse> getGetAllNicknamesMethod;
    if ((getGetAllNicknamesMethod = NicknameServiceGrpc.getGetAllNicknamesMethod) == null) {
      synchronized (NicknameServiceGrpc.class) {
        if ((getGetAllNicknamesMethod = NicknameServiceGrpc.getGetAllNicknamesMethod) == null) {
          NicknameServiceGrpc.getGetAllNicknamesMethod = getGetAllNicknamesMethod =
              io.grpc.MethodDescriptor.<com.corporatebanking.nickname.grpc.GetAllNicknamesRequest, com.corporatebanking.nickname.grpc.NicknameListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllNicknames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.GetAllNicknamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.NicknameListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NicknameServiceMethodDescriptorSupplier("GetAllNicknames"))
              .build();
        }
      }
    }
    return getGetAllNicknamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.UpdateNicknameRequest,
      com.corporatebanking.nickname.grpc.NicknameResponse> getUpdateNicknameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNickname",
      requestType = com.corporatebanking.nickname.grpc.UpdateNicknameRequest.class,
      responseType = com.corporatebanking.nickname.grpc.NicknameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.UpdateNicknameRequest,
      com.corporatebanking.nickname.grpc.NicknameResponse> getUpdateNicknameMethod() {
    io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.UpdateNicknameRequest, com.corporatebanking.nickname.grpc.NicknameResponse> getUpdateNicknameMethod;
    if ((getUpdateNicknameMethod = NicknameServiceGrpc.getUpdateNicknameMethod) == null) {
      synchronized (NicknameServiceGrpc.class) {
        if ((getUpdateNicknameMethod = NicknameServiceGrpc.getUpdateNicknameMethod) == null) {
          NicknameServiceGrpc.getUpdateNicknameMethod = getUpdateNicknameMethod =
              io.grpc.MethodDescriptor.<com.corporatebanking.nickname.grpc.UpdateNicknameRequest, com.corporatebanking.nickname.grpc.NicknameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNickname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.UpdateNicknameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.NicknameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NicknameServiceMethodDescriptorSupplier("UpdateNickname"))
              .build();
        }
      }
    }
    return getUpdateNicknameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.DeleteNicknameRequest,
      com.corporatebanking.nickname.grpc.DeleteNicknameResponse> getDeleteNicknameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNickname",
      requestType = com.corporatebanking.nickname.grpc.DeleteNicknameRequest.class,
      responseType = com.corporatebanking.nickname.grpc.DeleteNicknameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.DeleteNicknameRequest,
      com.corporatebanking.nickname.grpc.DeleteNicknameResponse> getDeleteNicknameMethod() {
    io.grpc.MethodDescriptor<com.corporatebanking.nickname.grpc.DeleteNicknameRequest, com.corporatebanking.nickname.grpc.DeleteNicknameResponse> getDeleteNicknameMethod;
    if ((getDeleteNicknameMethod = NicknameServiceGrpc.getDeleteNicknameMethod) == null) {
      synchronized (NicknameServiceGrpc.class) {
        if ((getDeleteNicknameMethod = NicknameServiceGrpc.getDeleteNicknameMethod) == null) {
          NicknameServiceGrpc.getDeleteNicknameMethod = getDeleteNicknameMethod =
              io.grpc.MethodDescriptor.<com.corporatebanking.nickname.grpc.DeleteNicknameRequest, com.corporatebanking.nickname.grpc.DeleteNicknameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNickname"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.DeleteNicknameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.corporatebanking.nickname.grpc.DeleteNicknameResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NicknameServiceMethodDescriptorSupplier("DeleteNickname"))
              .build();
        }
      }
    }
    return getDeleteNicknameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NicknameServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NicknameServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NicknameServiceStub>() {
        @java.lang.Override
        public NicknameServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NicknameServiceStub(channel, callOptions);
        }
      };
    return NicknameServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NicknameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NicknameServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NicknameServiceBlockingStub>() {
        @java.lang.Override
        public NicknameServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NicknameServiceBlockingStub(channel, callOptions);
        }
      };
    return NicknameServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NicknameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NicknameServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NicknameServiceFutureStub>() {
        @java.lang.Override
        public NicknameServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NicknameServiceFutureStub(channel, callOptions);
        }
      };
    return NicknameServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createNickname(com.corporatebanking.nickname.grpc.CreateNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNicknameMethod(), responseObserver);
    }

    /**
     */
    default void getNickname(com.corporatebanking.nickname.grpc.GetNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNicknameMethod(), responseObserver);
    }

    /**
     */
    default void getAllNicknames(com.corporatebanking.nickname.grpc.GetAllNicknamesRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllNicknamesMethod(), responseObserver);
    }

    /**
     */
    default void updateNickname(com.corporatebanking.nickname.grpc.UpdateNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNicknameMethod(), responseObserver);
    }

    /**
     */
    default void deleteNickname(com.corporatebanking.nickname.grpc.DeleteNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.DeleteNicknameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNicknameMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NicknameService.
   */
  public static abstract class NicknameServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NicknameServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NicknameService.
   */
  public static final class NicknameServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NicknameServiceStub> {
    private NicknameServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NicknameServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NicknameServiceStub(channel, callOptions);
    }

    /**
     */
    public void createNickname(com.corporatebanking.nickname.grpc.CreateNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNicknameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNickname(com.corporatebanking.nickname.grpc.GetNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNicknameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllNicknames(com.corporatebanking.nickname.grpc.GetAllNicknamesRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllNicknamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNickname(com.corporatebanking.nickname.grpc.UpdateNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNicknameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNickname(com.corporatebanking.nickname.grpc.DeleteNicknameRequest request,
        io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.DeleteNicknameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNicknameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NicknameService.
   */
  public static final class NicknameServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NicknameServiceBlockingStub> {
    private NicknameServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NicknameServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NicknameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.corporatebanking.nickname.grpc.NicknameResponse createNickname(com.corporatebanking.nickname.grpc.CreateNicknameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNicknameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.corporatebanking.nickname.grpc.NicknameResponse getNickname(com.corporatebanking.nickname.grpc.GetNicknameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNicknameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.corporatebanking.nickname.grpc.NicknameListResponse getAllNicknames(com.corporatebanking.nickname.grpc.GetAllNicknamesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllNicknamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.corporatebanking.nickname.grpc.NicknameResponse updateNickname(com.corporatebanking.nickname.grpc.UpdateNicknameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNicknameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.corporatebanking.nickname.grpc.DeleteNicknameResponse deleteNickname(com.corporatebanking.nickname.grpc.DeleteNicknameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNicknameMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NicknameService.
   */
  public static final class NicknameServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NicknameServiceFutureStub> {
    private NicknameServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NicknameServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NicknameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.corporatebanking.nickname.grpc.NicknameResponse> createNickname(
        com.corporatebanking.nickname.grpc.CreateNicknameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNicknameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.corporatebanking.nickname.grpc.NicknameResponse> getNickname(
        com.corporatebanking.nickname.grpc.GetNicknameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNicknameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.corporatebanking.nickname.grpc.NicknameListResponse> getAllNicknames(
        com.corporatebanking.nickname.grpc.GetAllNicknamesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllNicknamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.corporatebanking.nickname.grpc.NicknameResponse> updateNickname(
        com.corporatebanking.nickname.grpc.UpdateNicknameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNicknameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.corporatebanking.nickname.grpc.DeleteNicknameResponse> deleteNickname(
        com.corporatebanking.nickname.grpc.DeleteNicknameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNicknameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NICKNAME = 0;
  private static final int METHODID_GET_NICKNAME = 1;
  private static final int METHODID_GET_ALL_NICKNAMES = 2;
  private static final int METHODID_UPDATE_NICKNAME = 3;
  private static final int METHODID_DELETE_NICKNAME = 4;

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
        case METHODID_CREATE_NICKNAME:
          serviceImpl.createNickname((com.corporatebanking.nickname.grpc.CreateNicknameRequest) request,
              (io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse>) responseObserver);
          break;
        case METHODID_GET_NICKNAME:
          serviceImpl.getNickname((com.corporatebanking.nickname.grpc.GetNicknameRequest) request,
              (io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_NICKNAMES:
          serviceImpl.getAllNicknames((com.corporatebanking.nickname.grpc.GetAllNicknamesRequest) request,
              (io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NICKNAME:
          serviceImpl.updateNickname((com.corporatebanking.nickname.grpc.UpdateNicknameRequest) request,
              (io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.NicknameResponse>) responseObserver);
          break;
        case METHODID_DELETE_NICKNAME:
          serviceImpl.deleteNickname((com.corporatebanking.nickname.grpc.DeleteNicknameRequest) request,
              (io.grpc.stub.StreamObserver<com.corporatebanking.nickname.grpc.DeleteNicknameResponse>) responseObserver);
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
          getCreateNicknameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.corporatebanking.nickname.grpc.CreateNicknameRequest,
              com.corporatebanking.nickname.grpc.NicknameResponse>(
                service, METHODID_CREATE_NICKNAME)))
        .addMethod(
          getGetNicknameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.corporatebanking.nickname.grpc.GetNicknameRequest,
              com.corporatebanking.nickname.grpc.NicknameResponse>(
                service, METHODID_GET_NICKNAME)))
        .addMethod(
          getGetAllNicknamesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.corporatebanking.nickname.grpc.GetAllNicknamesRequest,
              com.corporatebanking.nickname.grpc.NicknameListResponse>(
                service, METHODID_GET_ALL_NICKNAMES)))
        .addMethod(
          getUpdateNicknameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.corporatebanking.nickname.grpc.UpdateNicknameRequest,
              com.corporatebanking.nickname.grpc.NicknameResponse>(
                service, METHODID_UPDATE_NICKNAME)))
        .addMethod(
          getDeleteNicknameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.corporatebanking.nickname.grpc.DeleteNicknameRequest,
              com.corporatebanking.nickname.grpc.DeleteNicknameResponse>(
                service, METHODID_DELETE_NICKNAME)))
        .build();
  }

  private static abstract class NicknameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NicknameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.corporatebanking.nickname.grpc.NicknameProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NicknameService");
    }
  }

  private static final class NicknameServiceFileDescriptorSupplier
      extends NicknameServiceBaseDescriptorSupplier {
    NicknameServiceFileDescriptorSupplier() {}
  }

  private static final class NicknameServiceMethodDescriptorSupplier
      extends NicknameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NicknameServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NicknameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NicknameServiceFileDescriptorSupplier())
              .addMethod(getCreateNicknameMethod())
              .addMethod(getGetNicknameMethod())
              .addMethod(getGetAllNicknamesMethod())
              .addMethod(getUpdateNicknameMethod())
              .addMethod(getDeleteNicknameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
