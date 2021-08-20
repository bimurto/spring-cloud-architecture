package io.bimurto.restlibs.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("payment-service")
public interface PaymentApi {
    @RequestMapping(value = "/test-payment", method = RequestMethod.GET)
    String test();
}
