package com.outerpack.service.impl;

import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import com.outerpack.mapper.CandidateMapper;
import com.outerpack.service.CandidateService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateMapper candidateMapper;

    @Override
    public Candidate getCandidateById(int id) {
        return candidateMapper.getCandidateById(id);
    }

    @Override
    public List<CandidateBrief> getCandidateList() {
        return candidateMapper.getCandidateList();
    }

    @Override
    public Boolean addCandidate(Candidate candidate) {
        int result=candidateMapper.addCandidate(candidate);
        return result>0;
    }

    @Override
    public Boolean updateGradeById(int ID, int grade) {
        int result=candidateMapper.updateGradeById(ID,grade);
        return result>0;
    }

    @Override
    public Boolean deleteCandidateById(int ID) {
        int result= candidateMapper.deleteCandidateById(ID);
        return result>0;
    }
}
