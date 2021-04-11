package com.outerpack.service.impl;

import com.outerpack.entity.pojo.Interview;
import com.outerpack.mapper.InterviewMapper;
import com.outerpack.service.InterviewService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper mapper;

    @Override
    public List<Interview> getAllInterview() {
        return mapper.getAllInterview();
    }

    @Override
    public List<Interview> getInterviewByCandidateId(int ID) {
        return mapper.getInterviewByCandidateId(ID);
    }

    @Override
    public List<Interview> getInterviewByHrId(int ID) {
        return mapper.getInterviewByHrId(ID);
    }

    @Override
    public Interview getInterviewByInterviewId(int ID) {
        return mapper.getInterviewByInterviewId(ID);
    }

    @Override
    public Boolean addInterview(Interview interview) {
        int result= mapper.addInterview(interview);
        return result>0;
    }

    @Override
    public Boolean deleteInterviewById(int ID) {
        int result=mapper.deleteInterviewById(ID);
        return result>0;
    }

    @Override
    public Boolean updateInterviewById(int ID, String detail) {
        int result= mapper.updateInterviewById(ID,detail);
        return result>0;
    }
}
