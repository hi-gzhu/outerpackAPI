package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.pojo.Interview;
import com.outerpack.mapper.InterviewMapper;
import com.outerpack.service.InterviewService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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

    @ApiOperation("根据面试记录ID删除面试记录")
    @DeleteMapping("/deleteByID")
    public Result deleteInterview(@ApiParam(value = "面试记录ID",example = "1") @PathVariable("ID")int ID){
        Boolean aBoolean = interviewService.deleteInterviewById(ID);
        if(aBoolean)return Result.success("删除成功");
        else return Result.error("删除失败");
    }

    @ApiOperation("添加面试记录")
    @PostMapping("/addInterview")
    public Result addInterview(@ApiParam(value = "面试记录实体",example = "json字符串")@RequestBody Interview interview){
        Boolean aBoolean = interviewService.addInterview(interview);
        if(aBoolean)return Result.success("添加成功");
        else return Result.error("添加失败");
    }

    @ApiOperation("根据面试记录ID获取面试内容")
    @GetMapping("/getInterviewById/{ID}")
    public Result getInterview(@ApiParam(value = "面试记录ID",example = "1")@PathVariable("ID")int ID){
        Interview interviewByInterviewId = interviewService.getInterviewByInterviewId(ID);
        if(interviewByInterviewId!=null)return Result.success(ID+"号面试记录",interviewByInterviewId);
        else return Result.error("查询失败");
    }

    @ApiOperation("根据hr的ID获取所有的面试记录")
    @GetMapping("/getAllInterview/{ID}")
    public Result getInterviewByHRID(@ApiParam(value = "HR的ID",example = "1")@PathVariable("ID") int ID){
        List<Interview> interviewByHrId = interviewService.getInterviewByHrId(ID);
        if(interviewByHrId!=null)return Result.success("id号为"+ID+"的Hr经手的面试记录",interviewByHrId);
        else return Result.error("该ID号下无面试记录");
    }

    @ApiOperation("根据面试者的ID获取面试记录")
    @GetMapping("/getInterviewByCanId/{ID}")
    public Result get(@ApiParam(value = "面试者ID",example = "1")@PathVariable("ID")int ID){
        List<Interview> list = interviewService.getInterviewByCandidateId(ID);
        if(list!=null)return Result.success(ID+"号的面试者的面试记录",list);
        else return Result.error("查询失败");
    }

    @ApiOperation("获取所有面试记录")
    @GetMapping("/getAllInterview")
    public Result getAllInterview(){
        List<Interview> allInterview = interviewService.getAllInterview();
        if(allInterview==null)return Result.error("无面试记录");
        else return Result.success("面试记录列表",allInterview);
    }


}
