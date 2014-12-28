package com.nva.service.users;

import com.nva.persistence.mongodb.entities.users.User;
import com.nva.persistence.mongodb.repositories.users.UsersRepository;
import com.nva.support.beans.user.UserVO;
import com.nva.support.dozer.DozerConversionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by edu on 14/12/2014.
 */
@Service
public class UsersServiceImpl implements UsersServiceInterface {

    @Autowired
    private DozerConversionInterface<?> dozerConversion;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserVO findByUser(UserVO userVO) {

        final User user = dozerConversion.map(userVO, User.class);
        
        final User userFromDb = usersRepository.findByUser(user);

        return dozerConversion.map(userFromDb, UserVO.class);
    }

    @Override
    public UserVO saveUser(UserVO userVO) {
        final User user = dozerConversion.map(userVO, User.class);
        usersRepository.save(user);
        return null;
    }
}
