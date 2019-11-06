package com.suncscsba.fsd.service;

import com.suncscsba.fsd.entity.TUser;

import java.util.List;

public interface UserService {
    List<TUser> findAll();

    TUser findByEmail(String email);

    void save(TUser tUser);
}
