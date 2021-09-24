package com.haung.springbootjwt.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

@Entity
@Table(name = "tbl_user")
@Getter
@Setter
public class User extends BaseEntity {

    private String username;

    private String password;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_user_role", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})

    private Set<Role> roles = new HashSet<>();
}
