package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.pojo.Interview;
import com.outerpack.mapper.InterviewMapper;
import com.outerpack.service.InterviewService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@RestController
@RequestMapping("/Interview")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;

    @PostMapping("/deleteByID")
    public Result deleteInterview(@PathVariable("ID")int ID){
        Boolean aBoolean = interviewService.deleteInterviewById(ID);
        if(aBoolean)return Result.success("删除成功");
        else return Result.error("删除失败");
    }

    @PostMapping("/addInterview")
    public Result addInterview(@RequestBody Interview interview){
        Boolean aBoolean = interviewService.addInterview(interview);
        if(aBoolean)return Result.success("添加成功");
        else return Result.error("添加失败");
    }

    @PostMapping("/getInterviewById/{ID}")
    public Result getInterview(@PathVariable("ID")int ID){
        Interview interviewByInterviewId = interviewService.getInterviewByInterviewId(ID);
        if(interviewByInterviewId!=null)return Result.success(ID+"号面试记录",interviewByInterviewId);
        else return Result.error("查询失败");
    }

    @PostMapping("/getAllInterview/{ID}")
    public Result getInterviewByHRID(@PathVariable("ID") int ID){
        List<Interview> interviewByHrId = interviewService.getInterviewByHrId(ID);
        if(interviewByHrId!=null)return Result.success("id号为"+ID+"的Hr经手的面试记录",interviewByHrId);
        else return Result.error("该ID号下无面试记录");
    }

    @PostMapping("/getInterviewByCanId/{ID}")
    public Result get(@PathVariable("ID")int ID){
        List<Interview> list = interviewService.getInterviewByCandidateId(ID);
        if(list!=null)return Result.success(ID+"号的面试者的面试记录",list);
        else return Result.error("查询失败");
    }

    @PostMapping("/getAllInterview")
    public Result getAllInterview(){
        List<Interview> allInterview = interviewService.getAllInterview();
        if(allInterview==null)return Result.error("无面试记录");
        else return Result.success("面试记录列表",allInterview);
    }


}
