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
}
