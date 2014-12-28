package com.nva.integration.users;

import com.nva.support.beans.user.UserVO;

/**
 * Created by edu on 14/12/2014.
 */
public interface UsersInterface {

    public UserVO findByUser(final UserVO userVO);
}
