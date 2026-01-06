package com.example.demo.controller;

import com.example.demo.dto.PaymentRequest;
import com.example.demo.dto.PaymentRespose;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.PaymentService;

@RestController
@RequestMapping("/api/payments")

public class PaymentController {
    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping
    public PaymentRespose makePayment(@RequestBody PaymentRequest request){
        return paymentService.processPayment(request);
  }
}
