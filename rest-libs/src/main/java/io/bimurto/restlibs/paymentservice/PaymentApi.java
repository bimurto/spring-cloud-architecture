package io.bimurto.restlibs.paymentservice;

import io.bimurto.restlibs.paymentservice.fallback.PaymentApiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "payment-service", fallback = PaymentApiFallback.class)
public interface PaymentApi {
    @RequestMapping(value = "/test-payment", method = RequestMethod.GET)
    String test();
}
