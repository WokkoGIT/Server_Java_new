package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerRun {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 8083;
        Server server = ServerBuilder.forPort(port)
                .addService(new GreetingServiceImp())
                .addService(new RefundServiceImpl())
                .build();

        server.start();

        System.out.println("Server is running on port: "+port);

        server.awaitTermination();
    }
}
