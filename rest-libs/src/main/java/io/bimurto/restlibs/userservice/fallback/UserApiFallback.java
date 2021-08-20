package io.bimurto.restlibs.userservice.fallback;

import io.bimurto.restlibs.userservice.UserApi;
import org.springframework.stereotype.Component;

@Component
public class UserApiFallback implements UserApi {
    @Override
    public String test() {
        return "User APi Test Fallback";
    }
}
