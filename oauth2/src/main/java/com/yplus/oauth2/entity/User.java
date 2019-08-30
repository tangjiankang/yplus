package com.yplus.oauth2.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Date;
import java.util.List;

/**
 * 对应数据库密码，需要安装 lombok 插件
 */
@Data
public class User{

    private Long id;

    private Long clubId;

    private Long postId;

    private String code;

    private String name;

    private String nickName;

    private String weixinName;

    private String weixinPicture;

    private Byte gender;

    private Date birthday;

    private String loginName;

    private String password;

    private String address;

    private String postcode;

    private String email;

    private String phone;

    private String tel;

    private String weixinNo;

    private String picture;

    private String loginIp;

    private Date lastLoginTime;

    private Byte loginFlag;

    private Byte status;

    private Byte isConsultant;

    private String createdBy;

    private Date createdDt;

    private String updatedBy;

    private Date updatedDt;

    private String remarks;

    private Byte delFlag;

    private List<GrantedAuthority> authorities;
}
