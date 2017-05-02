package org.bjf.springboot.web;

import org.bjf.springboot.domain.User;
import org.bjf.springboot.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

/**
 * Created by binjinfeng on 2017/1/19.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }

    @RequestMapping(value = "add")
    public String add(User user) {
        userService.add(user);
        return "success";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User get(@PathVariable Integer id) {
        return userService.get(id);
    }


}
