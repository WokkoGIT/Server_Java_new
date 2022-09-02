package org.example;

import GeneratedSources.GreetingServiceGrpc;
import GeneratedSources.GreetingServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImp extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public void greeting (GreetingServiceOuterClass.HelloRequest request,
                          StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
        System.out.println(request);
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse
                .newBuilder().setGreeting("Response from server to client: "+request.getName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
