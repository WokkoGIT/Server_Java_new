package RefundService;

import java.security.NoSuchAlgorithmException;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: RefundService.proto")
public final class RefundServiceGrpc {

  private RefundServiceGrpc() {}

  public static final String SERVICE_NAME = "RefundService.RefundService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RefundService.RefundServiceOuterClass.RefundRequest,
      RefundService.RefundServiceOuterClass.RefundResponse> getRefundRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refundRequest",
      requestType = RefundService.RefundServiceOuterClass.RefundRequest.class,
      responseType = RefundService.RefundServiceOuterClass.RefundResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RefundService.RefundServiceOuterClass.RefundRequest,
      RefundService.RefundServiceOuterClass.RefundResponse> getRefundRequestMethod() {
    io.grpc.MethodDescriptor<RefundService.RefundServiceOuterClass.RefundRequest, RefundService.RefundServiceOuterClass.RefundResponse> getRefundRequestMethod;
    if ((getRefundRequestMethod = RefundServiceGrpc.getRefundRequestMethod) == null) {
      synchronized (RefundServiceGrpc.class) {
        if ((getRefundRequestMethod = RefundServiceGrpc.getRefundRequestMethod) == null) {
          RefundServiceGrpc.getRefundRequestMethod = getRefundRequestMethod =
              io.grpc.MethodDescriptor.<RefundService.RefundServiceOuterClass.RefundRequest, RefundService.RefundServiceOuterClass.RefundResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "refundRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RefundService.RefundServiceOuterClass.RefundRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RefundService.RefundServiceOuterClass.RefundResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RefundServiceMethodDescriptorSupplier("refundRequest"))
              .build();
        }
      }
    }
    return getRefundRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RefundServiceStub newStub(io.grpc.Channel channel) {
    return new RefundServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RefundServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RefundServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RefundServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RefundServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RefundServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void refundRequest(RefundService.RefundServiceOuterClass.RefundRequest request,
        io.grpc.stub.StreamObserver<RefundService.RefundServiceOuterClass.RefundResponse> responseObserver) throws NoSuchAlgorithmException {
      asyncUnimplementedUnaryCall(getRefundRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRefundRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                RefundService.RefundServiceOuterClass.RefundRequest,
                RefundService.RefundServiceOuterClass.RefundResponse>(
                  this, METHODID_REFUND_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class RefundServiceStub extends io.grpc.stub.AbstractStub<RefundServiceStub> {
    private RefundServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RefundServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefundServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RefundServiceStub(channel, callOptions);
    }

    /**
     */
    public void refundRequest(RefundService.RefundServiceOuterClass.RefundRequest request,
        io.grpc.stub.StreamObserver<RefundService.RefundServiceOuterClass.RefundResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRefundRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RefundServiceBlockingStub extends io.grpc.stub.AbstractStub<RefundServiceBlockingStub> {
    private RefundServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RefundServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefundServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RefundServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public RefundService.RefundServiceOuterClass.RefundResponse refundRequest(RefundService.RefundServiceOuterClass.RefundRequest request) {
      return blockingUnaryCall(
          getChannel(), getRefundRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RefundServiceFutureStub extends io.grpc.stub.AbstractStub<RefundServiceFutureStub> {
    private RefundServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RefundServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RefundServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RefundServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RefundService.RefundServiceOuterClass.RefundResponse> refundRequest(
        RefundService.RefundServiceOuterClass.RefundRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRefundRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REFUND_REQUEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RefundServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RefundServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REFUND_REQUEST:
          try {
            serviceImpl.refundRequest((RefundServiceOuterClass.RefundRequest) request,
                (io.grpc.stub.StreamObserver<RefundServiceOuterClass.RefundResponse>) responseObserver);
          } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
          }
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

  private static abstract class RefundServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RefundServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RefundService.RefundServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RefundService");
    }
  }

  private static final class RefundServiceFileDescriptorSupplier
      extends RefundServiceBaseDescriptorSupplier {
    RefundServiceFileDescriptorSupplier() {}
  }

  private static final class RefundServiceMethodDescriptorSupplier
      extends RefundServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RefundServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RefundServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RefundServiceFileDescriptorSupplier())
              .addMethod(getRefundRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
