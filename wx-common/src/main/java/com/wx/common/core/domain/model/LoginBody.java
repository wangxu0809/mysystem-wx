package com.wx.common.core.domain.model;
/**
 * 用户登录对象
* */
public class LoginBody {
    /**
     * 用户名
    * */
    public String username;
    /**
    * 密码
    * */
    public String password;
    /**
    * 验证码
    * */
    public String code;
    /**
     * 唯一标识
     * */
    public String uuid = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }



}
