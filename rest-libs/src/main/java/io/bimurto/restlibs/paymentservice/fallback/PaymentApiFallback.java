package io.bimurto.restlibs.paymentservice.fallback;

import io.bimurto.restlibs.paymentservice.PaymentApi;
import org.springframework.stereotype.Component;

@Component
public class PaymentApiFallback implements PaymentApi {
    @Override
    public String test() {
        return "Payment Api Test Fallback";
    }
}
