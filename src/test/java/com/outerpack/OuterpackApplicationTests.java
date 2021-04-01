package com.outerpack;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.pojo.User;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.entity.vo.Manager.ManagerResult;
import com.outerpack.service.HrService;
import com.outerpack.service.MangerService;
import com.outerpack.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OuterpackApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User userById = userService.getUserById(1);
        System.out.println(userById);
    }

}
