package org.example;

import RefundService.RefundServiceGrpc;
import RefundService.RefundServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class RefundServiceImpl extends RefundServiceGrpc.RefundServiceImplBase {

    final String access_key = "right_secret_key_access1";
    @Override
    public void refundRequest (RefundServiceOuterClass.RefundRequest request,
                          StreamObserver<RefundServiceOuterClass.RefundResponse> responseObserver) {

        RefundServiceOuterClass.RefundResponse response = RefundServiceOuterClass.RefundResponse
                .newBuilder()
                .setRefundResponse(refundImplementation(request))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String refundImplementation (RefundServiceOuterClass.RefundRequest request) {
        if (request.getAccessKey().equals(access_key)) {
            System.out.println("Произведен возврат транзакции клиента "+request.getTxid()+"\n");
            return "Транзакция "+request.getTxid()+" успешно возвращена на указанный адрес "+request.getRefundAddress();
        } else  return "Нет соответствующего доступа для возврата транзакции.";
    }
}