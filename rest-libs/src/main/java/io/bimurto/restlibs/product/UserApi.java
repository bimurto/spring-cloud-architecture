package io.bimurto.restlibs.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("user-service")
public interface UserApi {
    @RequestMapping(value = "/test-user", method = RequestMethod.GET)
    String test();
}
