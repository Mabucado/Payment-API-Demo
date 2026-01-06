package com.example.demo.dto;

public class PaymentRequest {
    private String reference;
    private double amount;
    private String currency;

    public String getReference() {return reference;}
    public void setReference(String reference) {
        this.reference = reference;
    }
    public double getAmount() {return amount;}
    public void setAmount(double amount) {this.amount = amount;}

    public String getCurrency() {return currency;}
    public void setCurrency(String currency) {this.currency = currency;}
}
