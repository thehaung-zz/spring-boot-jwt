package com.haung.springbootjwt.repository;

import com.haung.springbootjwt.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

public interface TokenRepository extends JpaRepository<Token, Long> {
}
