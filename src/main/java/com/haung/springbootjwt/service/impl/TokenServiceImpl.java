package com.haung.springbootjwt.service.impl;

import com.haung.springbootjwt.entity.Token;
import com.haung.springbootjwt.repository.TokenRepository;
import com.haung.springbootjwt.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

@Slf4j
@Service
public class TokenServiceImpl implements TokenService {
    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }
}
