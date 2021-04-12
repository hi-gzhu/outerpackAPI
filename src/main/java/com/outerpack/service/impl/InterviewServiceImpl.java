package com.outerpack.service.impl;

import com.github.pagehelper.PageHelper;
import com.outerpack.common.PageHelpStaticCode;
import com.outerpack.common.PageResult;
import com.outerpack.common.ResultCode;
import com.outerpack.entity.pojo.Interview;
import com.outerpack.mapper.InterviewMapper;
import com.outerpack.service.InterviewService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Data
@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewMapper mapper;

    @Override
    public PageResult<Interview> getAllInterview(Integer pageNum) {
        int interviewCounts = mapper.getInterviewCount();
        int totalPage=(int)Math.ceil(interviewCounts*1.0/ PageHelpStaticCode.pageSize);
        PageHelper.startPage(pageNum,PageHelpStaticCode.pageSize);
        List<Interview> allInterview = mapper.getAllInterview();
        if(!allInterview.isEmpty()){
            return new PageResult<Interview>(ResultCode.CREATED_SuccessCode,totalPage,pageNum,allInterview);
        }else{
            return new PageResult<Interview>(ResultCode.Not_Found,totalPage,pageNum,null);
        }
    }

    @Override
    public PageResult<Interview> getInterviewByCandidateId(int ID,int pageNum) {
        int interviewCounts = mapper.getInterviewCount();
        int totalPage=(int)Math.ceil(interviewCounts*1.0/ PageHelpStaticCode.pageSize);
        PageHelper.startPage(pageNum,PageHelpStaticCode.pageSize);
        List<Interview> allInterview = mapper.getInterviewByCandidateId(ID);
        if(!allInterview.isEmpty()){
            return new PageResult<Interview>(ResultCode.CREATED_SuccessCode,totalPage,pageNum,allInterview);
        }else{
            return new PageResult<Interview>(ResultCode.Not_Found,totalPage,pageNum,null);
        }
    }

    @Override
    public PageResult<Interview> getInterviewByHrId(int ID,int pageNum) {
        int interviewCounts = mapper.getInterviewCount();
        int totalPage=(int)Math.ceil(interviewCounts*1.0/ PageHelpStaticCode.pageSize);
        PageHelper.startPage(pageNum,PageHelpStaticCode.pageSize);
        List<Interview> allInterview = mapper.getInterviewByHrId(ID);
        if(!allInterview.isEmpty()){
            return new PageResult<Interview>(ResultCode.CREATED_SuccessCode,totalPage,pageNum,allInterview);
        }else{
            return new PageResult<Interview>(ResultCode.Not_Found,totalPage,pageNum,null);
        }
    }

    @Override
    public Interview getInterviewByInterviewId(int ID) {
        return mapper.getInterviewByInterviewId(ID);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean addInterview(Interview interview) {
        int result= mapper.addInterview(interview);
        return result>0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean deleteInterviewById(int ID) {
        int result=mapper.deleteInterviewById(ID);
        return result>0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean updateInterviewById(int ID, String detail) {
        int result= mapper.updateInterviewById(ID,detail);
        return result>0;
    }

    @Override
    public int getInterviewCount() {
        return mapper.getInterviewCount();
    }
}
