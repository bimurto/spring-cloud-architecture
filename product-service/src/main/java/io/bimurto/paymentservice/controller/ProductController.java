package io.bimurto.paymentservice.controller;

import io.bimurto.restlibs.product.ProductApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductApi {

    @Override
    public String test(){
        return "Test";
    }
}
