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
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
                hget(RedisFrontString.Redis_CandiDateDetail,
                        RedisFrontString.Redis_CandiDate_ByCanId + id);
        if(CanONRedis==null){
            Candidate candidateBySql = candidateMapper.getCandidateById(id);
            System.out.println("从数据库中拿");
            redisUtil.hset(RedisFrontString.Redis_CandiDateDetail,RedisFrontString.Redis_CandiDate_ByCanId+id,candidateBySql);
            return candidateBySql;
        }else{
            System.out.println("从redis中拿");
            return CanONRedis;
        }

    }

    @Override
    public PageResult<CandidateBrief> getCandidateList(Integer pageNum) {
        int blog_count = candidateMapper.getAllCandidateCount();
        int totalPage = (int) Math.ceil(blog_count* 1.0 / PageHelpStaticCode.pageSize);
        //总页数
        PageHelper.startPage(pageNum,PageHelpStaticCode.pageSize);

        List<CandidateBrief> candidateList = candidateMapper.getCandidateList();


        if(!candidateList.isEmpty()){
            return new PageResult<CandidateBrief>(ResultCode.CREATED_SuccessCode,totalPage,pageNum,candidateList);
        }
        return new PageResult<CandidateBrief>(ResultCode.Not_Found,totalPage,pageNum,null);

    }

    @Override
    public PageResult<CandidateBrief> getCandidateByPowerString(String power,Integer pageNum) {
        int blog_count = candidateMapper.getAllCandidateCount();
        int totalPage = (int) Math.ceil(blog_count* 1.0 / PageHelpStaticCode.pageSize);
        //总页数
        PageHelper.startPage(pageNum,PageHelpStaticCode.pageSize);

        List<CandidateBrief> candidateList = candidateMapper.getCandidateByPowerString(power);


        if(!candidateList.isEmpty()){
            return new PageResult<CandidateBrief>(ResultCode.CREATED_SuccessCode,totalPage,pageNum,candidateList);
        }
        return new PageResult<CandidateBrief>(ResultCode.Not_Found,totalPage,pageNum,null);

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean addCandidate(Candidate candidate) {
        int result=candidateMapper.addCandidate(candidate);
        return result>0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean updateGradeById(int ID, int grade) {
        int result=candidateMapper.updateGradeById(ID,grade);
        if(result>0){
            delRedisCanByID(ID);
        }
        return result>0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean deleteCandidateById(int ID) {
        int result= candidateMapper.deleteCandidateById(ID);
        if(result>0){
            delRedisCanByID(ID);
        }
        return result>0;
    }




    private void delRedisCanByID(Integer ID){
        boolean hasKey = redisUtil.hHasKey(RedisFrontString.Redis_CandiDateDetail,
                RedisFrontString.Redis_CandiDate_ByCanId + ID);
        if(hasKey){
            redisUtil.hdel(RedisFrontString.Redis_CandiDateDetail,
                    RedisFrontString.Redis_CandiDate_ByCanId + ID);
        }

    }


}
