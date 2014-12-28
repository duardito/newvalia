package com.nva.service.test;

import com.nva.service.users.UsersServiceInterface;
import com.nva.support.beans.user.UserVO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by edu on 15/12/2014.
 */
public class UsersTest extends AbstractIntegrationTest{

    @Autowired
    UsersServiceInterface usersServiceInterface;


    @Test
    public void addUserTest(){

        final UserVO userVO = new UserVO();
        userVO.setUsername("duardito");
        userVO.setPassword("Chascaman69");
        //usersServiceInterface.findByUser(userVO);
        Assert.assertNotNull(userVO);
        usersServiceInterface.saveUser(userVO);

    }

}
