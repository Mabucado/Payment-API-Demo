package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentPageController {

    @GetMapping("/payment")
    public String paymentPage() {
        System.out.println("paymentPage");
        return "payment";
    }
}
