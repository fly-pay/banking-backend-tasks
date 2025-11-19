package com.personalbanking.personalUser.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.0)",
    comments = "Source: getUsersFromAccounts.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetFromAccountsServiceGrpc {

  private GetFromAccountsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.personalbanking.personalUser.GetFromAccountsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.personalbanking.personalUser.grpc.GetFromAccountsRequest,
      com.personalbanking.personalUser.grpc.GetFromAccountsResponse> getGetFromAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFromAccounts",
      requestType = com.personalbanking.personalUser.grpc.GetFromAccountsRequest.class,
      responseType = com.personalbanking.personalUser.grpc.GetFromAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.personalbanking.personalUser.grpc.GetFromAccountsRequest,
      com.personalbanking.personalUser.grpc.GetFromAccountsResponse> getGetFromAccountsMethod() {
    io.grpc.MethodDescriptor<com.personalbanking.personalUser.grpc.GetFromAccountsRequest, com.personalbanking.personalUser.grpc.GetFromAccountsResponse> getGetFromAccountsMethod;
    if ((getGetFromAccountsMethod = GetFromAccountsServiceGrpc.getGetFromAccountsMethod) == null) {
      synchronized (GetFromAccountsServiceGrpc.class) {
        if ((getGetFromAccountsMethod = GetFromAccountsServiceGrpc.getGetFromAccountsMethod) == null) {
          GetFromAccountsServiceGrpc.getGetFromAccountsMethod = getGetFromAccountsMethod =
              io.grpc.MethodDescriptor.<com.personalbanking.personalUser.grpc.GetFromAccountsRequest, com.personalbanking.personalUser.grpc.GetFromAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFromAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.personalUser.grpc.GetFromAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.personalbanking.personalUser.grpc.GetFromAccountsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GetFromAccountsServiceMethodDescriptorSupplier("GetFromAccounts"))
              .build();
        }
      }
    }
    return getGetFromAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetFromAccountsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetFromAccountsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetFromAccountsServiceStub>() {
        @java.lang.Override
        public GetFromAccountsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetFromAccountsServiceStub(channel, callOptions);
        }
      };
    return GetFromAccountsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetFromAccountsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetFromAccountsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetFromAccountsServiceBlockingStub>() {
        @java.lang.Override
        public GetFromAccountsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetFromAccountsServiceBlockingStub(channel, callOptions);
        }
      };
    return GetFromAccountsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetFromAccountsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetFromAccountsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetFromAccountsServiceFutureStub>() {
        @java.lang.Override
        public GetFromAccountsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetFromAccountsServiceFutureStub(channel, callOptions);
        }
      };
    return GetFromAccountsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getFromAccounts(com.personalbanking.personalUser.grpc.GetFromAccountsRequest request,
        io.grpc.stub.StreamObserver<com.personalbanking.personalUser.grpc.GetFromAccountsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFromAccountsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GetFromAccountsService.
   */
  public static abstract class GetFromAccountsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GetFromAccountsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GetFromAccountsService.
   */
  public static final class GetFromAccountsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GetFromAccountsServiceStub> {
    private GetFromAccountsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetFromAccountsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetFromAccountsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFromAccounts(com.personalbanking.personalUser.grpc.GetFromAccountsRequest request,
        io.grpc.stub.StreamObserver<com.personalbanking.personalUser.grpc.GetFromAccountsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFromAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GetFromAccountsService.
   */
  public static final class GetFromAccountsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GetFromAccountsServiceBlockingStub> {
    private GetFromAccountsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetFromAccountsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetFromAccountsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.personalbanking.personalUser.grpc.GetFromAccountsResponse getFromAccounts(com.personalbanking.personalUser.grpc.GetFromAccountsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFromAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GetFromAccountsService.
   */
  public static final class GetFromAccountsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GetFromAccountsServiceFutureStub> {
    private GetFromAccountsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetFromAccountsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetFromAccountsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.personalbanking.personalUser.grpc.GetFromAccountsResponse> getFromAccounts(
        com.personalbanking.personalUser.grpc.GetFromAccountsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFromAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FROM_ACCOUNTS = 0;

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
        case METHODID_GET_FROM_ACCOUNTS:
          serviceImpl.getFromAccounts((com.personalbanking.personalUser.grpc.GetFromAccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.personalbanking.personalUser.grpc.GetFromAccountsResponse>) responseObserver);
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
          getGetFromAccountsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.personalbanking.personalUser.grpc.GetFromAccountsRequest,
              com.personalbanking.personalUser.grpc.GetFromAccountsResponse>(
                service, METHODID_GET_FROM_ACCOUNTS)))
        .build();
  }

  private static abstract class GetFromAccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetFromAccountsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.personalbanking.personalUser.grpc.GetUsersFromAccountsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetFromAccountsService");
    }
  }

  private static final class GetFromAccountsServiceFileDescriptorSupplier
      extends GetFromAccountsServiceBaseDescriptorSupplier {
    GetFromAccountsServiceFileDescriptorSupplier() {}
  }

  private static final class GetFromAccountsServiceMethodDescriptorSupplier
      extends GetFromAccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GetFromAccountsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GetFromAccountsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetFromAccountsServiceFileDescriptorSupplier())
              .addMethod(getGetFromAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
