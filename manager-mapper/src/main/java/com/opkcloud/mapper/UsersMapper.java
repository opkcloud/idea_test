package com.opkcloud.mapper;

import com.opkcloud.pojo.Users;

import java.util.List;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2019/1/2
 * @Description: com.opkcloud.mapper
 * @version: 1.0
 */
public interface UsersMapper {

    void insertUser(Users users);

    List<Users> selectUserAll();

}
