package io.bimurto.restlibs.productservice.fallback;

import io.bimurto.restlibs.productservice.ProductApi;
import org.springframework.stereotype.Component;

@Component
public class ProductApiFallback implements ProductApi {
    @Override
    public String test() {
        return "Product Api Test Fallback";
    }
}
