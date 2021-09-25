package com.haung.springbootjwt.service;

import com.haung.springbootjwt.entity.Token;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

public interface TokenService {
    Token createToken(Token token);
}
