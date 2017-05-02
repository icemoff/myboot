package org.bjf.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.bjf.springboot.domain.User;

import java.util.List;

/**
 * Created by binjinfeng on 2017/3/9.
 */

@Mapper
public interface UserDao {

    List<User> findAll();
}
