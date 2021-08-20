package io.bimurto.paymentservice.controller;

import io.bimurto.restlibs.paymentservice.PaymentApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class PaymentController implements PaymentApi {
    @Override
    public String test() {
        log.info("Test method");
        return "Test Payment";
    }
}
