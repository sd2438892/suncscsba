package com.suncscsba.fsd.feign;

import com.suncscsba.fsd.dto.UserInfoDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthFeignFallback implements AuthFeign {
    @Override
    public ResponseEntity<UserInfoDto> checkToken(String token) {
        return null;
    }
}
