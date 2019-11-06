package com.suncscsba.fsd.service;

import com.suncscsba.fsd.dto.TUser;
import com.suncscsba.fsd.dto.UserInfoDto;

public interface AuthService {
    void register(TUser registerUser);

    UserInfoDto checkToken(String token);
}
