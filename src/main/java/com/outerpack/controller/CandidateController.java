package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import com.outerpack.mapper.CandidateMapper;
import com.outerpack.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Candidate")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping("/getCandidate/{ID}")
    public Result getCandidateById(@PathVariable("ID")int ID){
        Candidate candidateById = candidateService.getCandidateById(ID);
        return Result.success(candidateById.getCanId()+"号应聘者",candidateById);
    }

    @PostMapping("/getAllCandidates")
    public Result getAllCandidates(){
        List<CandidateBrief> candidateList = candidateService.getCandidateList();
        if(candidateList!=null){
            return Result.success("应聘者清单",candidateList);
        }
        else return Result.error("服务器不存在应聘者清单");
    }

    @PostMapping("/addCandidate")
    public Result addCandidate(@RequestBody Candidate candidate){
        Boolean aBoolean = candidateService.addCandidate(candidate);
        if (aBoolean)return Result.success("添加成功");
        else return Result.error("添加失败");
    }

    @GetMapping("/updateGrade/{ID}/{grade}")
    public Result updateGrade(@PathVariable("ID") int ID,@PathVariable("grade") int grade){
        Boolean aBoolean = candidateService.updateGradeById(ID, grade);
        if(aBoolean)return Result.success("修改成功");
        else return Result.error("修改失败");
    }
    @GetMapping("/delteCandidate/{ID}")
    public Result deleteCandidate(@PathVariable("ID")int ID){
        Boolean aBoolean = candidateService.deleteCandidateById(ID);
        if (aBoolean)return Result.success("删除成功");
        else return Result.error("删除失败");
    }
}
