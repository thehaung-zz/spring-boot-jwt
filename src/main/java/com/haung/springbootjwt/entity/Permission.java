package com.haung.springbootjwt.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author : Hau Nguyen
 * @Created : 9/24/21, Friday
 **/

@Entity
@Table(name = "tbl_permission")
@Getter
@Setter
public class Permission extends BaseEntity {

    private String permissionName;

    private String permissionKey;

}