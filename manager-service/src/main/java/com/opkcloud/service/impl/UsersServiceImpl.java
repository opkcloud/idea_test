package com.opkcloud.service.impl;

import com.opkcloud.mapper.UsersMapper;
import com.opkcloud.pojo.Users;
import com.opkcloud.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2019/1/3
 * @Description: com.opkcloud.service.impl
 * @version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
