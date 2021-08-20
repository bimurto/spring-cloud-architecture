package io.bimurto.restlibs.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("product-service")
public interface ProductApi {
    @RequestMapping(value = "/test-product", method = RequestMethod.GET)
    String test();
}

