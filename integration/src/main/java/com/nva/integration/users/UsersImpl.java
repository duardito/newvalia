package com.nva.integration.users;

import com.nva.service.users.UsersServiceInterface;
import com.nva.support.beans.user.UserVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edu on 14/12/2014.
 */
@RestController
public class UsersImpl implements UsersInterface{

    @Autowired
    private UsersServiceInterface usersServiceInterface;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @Override
    public UserVO findByUser(UserVO userVO) {

        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token =
                new UsernamePasswordToken(userVO.getUsername(), userVO.getPassword());

        currentUser.login(token);

        return usersServiceInterface.findByUser(userVO);
    }
}
