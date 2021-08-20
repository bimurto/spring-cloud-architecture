package io.bimurto.paymentservice.controller;

import io.bimurto.restlibs.product.PaymentApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController implements PaymentApi {
    @Override
    public String test() {
        return "Test Payment";
    }
}
