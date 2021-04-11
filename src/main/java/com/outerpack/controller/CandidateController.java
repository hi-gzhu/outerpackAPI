package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import com.outerpack.mapper.CandidateMapper;
import com.outerpack.service.CandidateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Candidate")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @ApiOperation("根据应聘者ID获取应聘者信息")
    @GetMapping("/getCandidate/{ID}")
    public Result getCandidateById(@ApiParam(value = "应聘者ID",example = "1") @PathVariable("ID")int ID){
        Candidate candidateById = candidateService.getCandidateById(ID);
        return Result.success(candidateById.getCanId()+"号应聘者",candidateById);
    }

    @ApiOperation("获取所有应聘者的信息(不完整信息)")
    @PostMapping("/getAllCandidates")
    public Result getAllCandidates(){
        List<CandidateBrief> candidateList = candidateService.getCandidateList();
        if(candidateList!=null){
            return Result.success("应聘者清单",candidateList);
        }
        else return Result.error("服务器不存在应聘者清单");
    }

    @ApiOperation("添加一个应聘者")
    @PostMapping("/addCandidate")
    public Result addCandidate(@ApiParam(value = "应聘者实体",example = "json字符串")@RequestBody Candidate candidate){
        Boolean aBoolean = candidateService.addCandidate(candidate);
        if (aBoolean)return Result.success("添加成功");
        else return Result.error("添加失败");
    }

    @ApiOperation("根据应聘者ID修改对应的成绩")
    @PutMapping("/updateGrade/{ID}/{grade}")
    public Result updateGrade(@ApiParam(value = "应聘者ID",example = "1")@PathVariable("ID") int ID,@ApiParam(value = "应聘者成绩",example = "100")@PathVariable("grade") int grade){
        Boolean aBoolean = candidateService.updateGradeById(ID, grade);
        if(aBoolean)return Result.success("修改成功");
        else return Result.error("修改失败");
    }

    @ApiOperation("根据应聘者ID删除应聘者")
    @DeleteMapping("/delteCandidate/{ID}")
    public Result deleteCandidate(@ApiParam(value = "应聘者ID",example = "1")@PathVariable("ID")int ID){
        Boolean aBoolean = candidateService.deleteCandidateById(ID);
        if (aBoolean)return Result.success("删除成功");
        else return Result.error("删除失败");
    }
}
