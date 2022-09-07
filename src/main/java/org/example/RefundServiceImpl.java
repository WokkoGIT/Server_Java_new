package org.example;

import RefundService.RefundServiceGrpc;
import RefundService.RefundServiceOuterClass;
import io.grpc.stub.StreamObserver;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class RefundServiceImpl extends RefundServiceGrpc.RefundServiceImplBase {

    final String access_key = "right_secret_key_access1";
    @Override
    public void refundRequest (RefundServiceOuterClass.RefundRequest request,
                          StreamObserver<RefundServiceOuterClass.RefundResponse> responseObserver){

        RefundServiceOuterClass.RefundResponse response = RefundServiceOuterClass.RefundResponse
                .newBuilder()
                .setRefundResponse(refundImplementation(request))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String refundImplementation (RefundServiceOuterClass.RefundRequest request) {
        String hashKey = getHash(request.getUnixTime());
        if (request.getAccessHash().equals(hashKey)) {
            System.out.println("Произведен возврат транзакции клиента "+request.getTxid()+"\n");
            return "Транзакция "+request.getTxid()+" успешно возвращена на указанный адрес "+request.getRefundAddress();
        } else  return "Нет соответствующего доступа для возврата транзакции.";
    }

    private String getHash (int unixTime) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        byte[] messageDigest = md.digest((access_key+unixTime).getBytes());
        BigInteger no = new BigInteger(1, messageDigest);
        String hashText = no.toString(16);
        while (hashText.length() < 32) {
            hashText = "0" + hashText;
        }
        return hashText;
    }
}