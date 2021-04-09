package com.outerpack.mapper;

import com.outerpack.entity.pojo.Candidate;
import com.outerpack.entity.vo.Candidate.CandidateBrief;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CandidateMapper {
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
    List<CandidateBrief> getCandidateList();



}
