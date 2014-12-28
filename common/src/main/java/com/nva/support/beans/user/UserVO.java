package com.nva.support.beans.user;

import com.nva.support.beans.AbstractVO;

/**
 * Created by edu on 14/12/2014.
 */
public class UserVO extends AbstractVO {

    private String password;
    private String username;

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
}
