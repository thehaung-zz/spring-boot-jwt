package com.haung.springbootjwt.repository;

import com.haung.springbootjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

public interface UserRepository extends JpaRepository<User, Long> {
}
