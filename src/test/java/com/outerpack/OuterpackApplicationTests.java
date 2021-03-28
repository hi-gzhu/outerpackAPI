package com.outerpack;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.service.MangerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OuterpackApplicationTests {

    @Autowired
    MangerService mangerService;

    @Test
    void contextLoads() {

        Manager managerById = mangerService.getManagerById(1);
        System.out.println(managerById);
    }

}
