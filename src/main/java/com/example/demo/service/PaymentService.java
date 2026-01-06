package com.example.demo.service;

import com.example.demo.dto.PaymentRequest;
import com.example.demo.dto.PaymentRespose;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {
    private final RestTemplate restTemplate = new RestTemplate();

    public PaymentRespose processPayment(PaymentRequest request){
        String url = "http://localhost:8081/api/mock/pay";
        ResponseEntity<PaymentRespose> response = restTemplate.postForEntity(url,request, PaymentRespose.class);
    return response.getBody();
    }

}
