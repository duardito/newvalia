package com.nva.service.users;

import com.nva.support.beans.user.UserVO;

/**
 * Created by edu on 14/12/2014.
 */
public interface UsersServiceInterface {

    public UserVO findByUser(final UserVO userVO);
    public UserVO saveUser(final UserVO userVO);
}
