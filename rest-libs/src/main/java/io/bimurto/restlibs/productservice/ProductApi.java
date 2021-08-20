package io.bimurto.restlibs.productservice;

import io.bimurto.restlibs.productservice.fallback.ProductApiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "product-service", fallback = ProductApiFallback.class)
public interface ProductApi {
    @RequestMapping(value = "/test-product", method = RequestMethod.GET)
    String test();
}

