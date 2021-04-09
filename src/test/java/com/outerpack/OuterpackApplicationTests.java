package com.outerpack;

import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.pojo.User;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.entity.vo.Manager.ManagerResult;
import com.outerpack.service.CandidateService;
import com.outerpack.service.HrService;
import com.outerpack.service.MangerService;
import com.outerpack.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OuterpackApplicationTests {

    @Autowired
    CandidateService candidateService;

    @Test
    void contextLoads() {
        List<CandidateBrief> candidateList = candidateService.getCandidateList();
        for (CandidateBrief candidateBrief : candidateList) {

            System.out.println(candidateBrief);
        }
    }

}
