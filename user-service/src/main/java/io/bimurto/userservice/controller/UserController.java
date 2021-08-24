package io.bimurto.userservice.controller;

import io.bimurto.restlibs.paymentservice.PaymentApi;
import io.bimurto.restlibs.userservice.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController implements UserApi {


    private final PaymentApi paymentApi;

    public UserController(PaymentApi paymentApi) {
        this.paymentApi = paymentApi;
    }

    @Override
    public String test() {
        log.info(paymentApi.test());
        return "Test User";
    }
}
