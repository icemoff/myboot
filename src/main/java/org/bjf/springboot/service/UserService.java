package org.bjf.springboot.service;

import org.bjf.springboot.dao.UserDao;
import org.bjf.springboot.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by binjinfeng on 2017/3/6.
 */
@Service
public class UserService {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private UserDao userDao;


    public List<User> list() {
        List<User> users = userDao.findAll();
        logger.info("users.size:" + users.size());

        return users;

    }

    public void add(User user) {
//        userDao.save(user);
    }

    public User get(int id) {

//        User user = userDao.findOne(id);
        User user = null;
        return user;
    }

}
