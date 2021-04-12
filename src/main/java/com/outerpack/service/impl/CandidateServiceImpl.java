package com.outerpack.service.impl;

import com.github.pagehelper.PageHelper;
import com.outerpack.common.PageHelpStaticCode;
import com.outerpack.common.PageResult;
import com.outerpack.common.RedisFrontString;
import com.outerpack.common.ResultCode;
import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import com.outerpack.mapper.CandidateMapper;
import com.outerpack.service.CandidateService;
import com.outerpack.utils.RedisUtil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateMapper candidateMapper;

    @Autowired
    private RedisUtil redisUtil;


    @Override
    public Candidate getCandidateById(int id) {
        Candidate CanONRedis =(Candidate) redisUtil.
                hget(RedisFrontString.Redis_CandiDate,
                        RedisFrontString.Redis_CandiDate_ByCanId + id);
        if(CanONRedis==null){
            Candidate candidateBySql = candidateMapper.getCandidateById(id);
            redisUtil.hset(RedisFrontString.Redis_CandiDate,RedisFrontString.Redis_CandiDate_ByCanId+id,candidateBySql);
            return candidateBySql;
        }else{
            return CanONRedis;
        }

    }

    @Override
    public PageResult<CandidateBrief> getCandidateList(Integer pageNum) {
        int blog_count = candidateMapper.getAllCandidateCount();
        int totalPage = (int) Math.ceil(blog_count* 1.0 / PageHelpStaticCode.pageSize);
        PageHelper.startPage(pageNum,PageHelpStaticCode.pageSize);
        List<CandidateBrief> candidateList = candidateMapper.getCandidateList();
        if(candidateList.isEmpty()){
            return new PageResult<CandidateBrief>(ResultCode.Not_Found,totalPage,pageNum,null);
        }else{
            return new PageResult<CandidateBrief>(ResultCode.CREATED_SuccessCode,totalPage,pageNum,candidateList);
        }
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
