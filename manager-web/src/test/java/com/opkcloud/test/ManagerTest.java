package com.opkcloud.test;

import com.opkcloud.mapper.UsersMapper;
import com.opkcloud.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: http://www.bjsxt.com
 * @Date: 2019/1/2
 * @Description: com.opkcloud.test
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest() {
        Users users = new Users();
        users.setUserage(40);
        users.setUsername("administrator");
        this.usersMapper.insertUser(users);
    }

}
