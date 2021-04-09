package com.outerpack.mapper;

import com.outerpack.entity.pojo.Interview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InterviewMapper {
    /**
     * 查询所有的面试记录
     * @return 返回一个Interview的链表
     */
    List<Interview> getAllInterview();

    /**
     * 根据应聘者的ID查询面试的场次的集合
     * @param ID CandidateId
     * @return
     */
    List<Interview> getInterviewByCandidateId(@Param("ID")int ID);

    /**
     * 根据HR的ID查询HR面试过的面试场次的记录的集合
     * @param ID hrId
     * @return
     */
    List<Interview> getInterviewByHrId(@Param("ID")int ID);


    /**
     * 根据面试场次记录的ID唯一查询面试场次的记录
     * @param ID InterviewId
     * @return
     */
    Interview getInterviewByInterviewId(@Param("ID")int ID);

}
