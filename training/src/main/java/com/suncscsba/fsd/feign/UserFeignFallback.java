package com.suncscsba.fsd.feign;

import com.suncscsba.fsd.dto.TUser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeign {
    @Override
    public ResponseEntity<TUser> findByEmail(String email) {
        return null;
    }
}
