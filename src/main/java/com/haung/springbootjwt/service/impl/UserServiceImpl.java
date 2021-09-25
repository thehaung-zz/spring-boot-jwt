package com.haung.springbootjwt.service.impl;

import com.haung.springbootjwt.authen.UserPrincipal;
import com.haung.springbootjwt.entity.User;
import com.haung.springbootjwt.repository.UserRepository;
import com.haung.springbootjwt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public UserPrincipal findByUserName(String username) {
        User user = userRepository.findByUsername(username);
        UserPrincipal userPrincipal = new UserPrincipal();

        if (null != user) {
            Set<String> authorities = new HashSet<>();
            if (null != user.getRoles())

                user.getRoles().forEach(r -> {
                    authorities.add(r.getRoleKey());
                    r.getPermissions().forEach(
                            p -> authorities.add(p.getPermissionKey()));
                });

            userPrincipal.setUserId(user.getId());
            userPrincipal.setUsername(user.getUsername());
            userPrincipal.setPassword(user.getPassword());
            userPrincipal.setAuthorities(authorities);
        }

        return userPrincipal;
    }
}
