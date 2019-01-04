package com.opkcloud.web.controller;

import com.opkcloud.pojo.Users;
import com.opkcloud.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2019/1/3
 * @Description: com.opkcloud.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        usersService.addUser(users);
        return "ok";
    }

}
