package io.bimurto.paymentservice.controller;

import io.bimurto.restlibs.productservice.ProductApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductApi {

    @Override
    public String test(){
        return "Test";
    }
}
