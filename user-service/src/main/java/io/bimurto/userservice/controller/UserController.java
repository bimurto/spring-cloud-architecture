package io.bimurto.userservice.controller;

import io.bimurto.restlibs.product.UserApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {
    @Override
    public String test() {
        return "Test User";
    }
}
