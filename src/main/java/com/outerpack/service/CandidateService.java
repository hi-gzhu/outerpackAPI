package com.outerpack.service;

import com.outerpack.common.PageResult;
import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CandidateService {
    /**
     * 根据应聘者Id获得应聘者《详细的》个人信息
     * @param id
     * @return 返回应聘者详细的个人信息
     */
    Candidate getCandidateById(@Param("ID")int id);

    /**
     * 查询所有的应聘者列表，此时只包含少数的属性
     * @return
     */
    PageResult<CandidateBrief> getCandidateList(Integer pageNum);

    /**
     * 增加一个应聘者
     * @param candidate 应聘者
     */
    Boolean addCandidate(@Param("candidate") Candidate candidate);

    /**
     * 根据应聘者ID修改应聘者的面试等级
     * @param ID
     * @param grade
     */
    Boolean updateGradeById(@Param("candidateId")int ID,@Param("newGrade")int grade);

    /**
     * 根据应聘者ID删除应聘者记录
     * @param ID
     */
    Boolean deleteCandidateById(@Param("ID")int ID);


}
