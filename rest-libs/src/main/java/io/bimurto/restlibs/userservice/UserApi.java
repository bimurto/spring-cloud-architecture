package io.bimurto.restlibs.userservice;

import io.bimurto.restlibs.userservice.fallback.UserApiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service", fallback = UserApiFallback.class)
public interface UserApi {
    @RequestMapping(value = "/test-user", method = RequestMethod.GET)
    String test();
}
