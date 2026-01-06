package com.example.demo.dto;

public class PaymentRespose {
    private String status;
    private String message;

    public PaymentRespose(String status, String message) {
        this.status=status;
        this.message=message;
    }
    public String getStatus(){return status;}
    public String getMessage(){return message;}
}
