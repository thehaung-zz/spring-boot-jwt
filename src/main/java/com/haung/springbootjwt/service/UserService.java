package com.haung.springbootjwt.service;

import com.haung.springbootjwt.authen.UserPrincipal;
import com.haung.springbootjwt.entity.User;


/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

public interface UserService {
    User createUser(User user);

    UserPrincipal findByUserName(String username);
}
