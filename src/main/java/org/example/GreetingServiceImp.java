package org.example;

import RefundService.GreetingServiceGrpc;
import RefundService.RefundServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImp extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting (RefundServiceOuterClass.HelloRequest request,
                          StreamObserver<RefundServiceOuterClass.HelloResponse> responseObserver) {
        System.out.println("--------------------\nПодключен новый клиент");
        System.out.print(request);
        System.out.println("--------------------");
        RefundServiceOuterClass.HelloResponse response = RefundServiceOuterClass.HelloResponse
                .newBuilder().setGreeting("Response from server to client: "+request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
