package com.outerpack;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.entity.vo.Manager.ManagerResult;
import com.outerpack.service.HrService;
import com.outerpack.service.MangerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OuterpackApplicationTests {

    @Autowired
    HrService hrService;

    @Test
    void contextLoads() {
        HrResult hrById = hrService.getHrById(1);
        System.out.println(hrById);
        HrResult congcongcong = hrService.getHrByName("congcongcong");
        System.out.println(congcongcong);
    }

}
