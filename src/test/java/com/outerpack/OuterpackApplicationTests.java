package com.outerpack;

import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.pojo.Interview;
import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.pojo.User;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.entity.vo.Manager.ManagerResult;
import com.outerpack.mapper.InterviewMapper;
import com.outerpack.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OuterpackApplicationTests {

    @Autowired
    InterviewService interviewService;

    @Test
    void contextLoads() {

    }

}
