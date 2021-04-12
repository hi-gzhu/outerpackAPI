package com.outerpack.service;

import com.outerpack.common.PageResult;
import com.outerpack.entity.pojo.Interview;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InterviewService {
    /**
     * 查询所有的面试记录
     * @return 返回一个Interview的链表
     */
    PageResult<Interview> getAllInterview(Integer pageNum);

    /**
     * 根据应聘者的ID查询面试的场次的集合
     * @param ID CandidateId
     * @return
     */
    PageResult<Interview> getInterviewByCandidateId(int ID,int pageNum);

    /**
     * 根据HR的ID查询HR面试过的面试场次的记录的集合
     * @param ID hrId
     * @return
     */
    PageResult<Interview> getInterviewByHrId(@Param("ID")int ID,@Param("pageNum")int pageNum);


    /**
     * 根据面试场次记录的ID唯一查询面试场次的记录
     * @param ID InterviewId
     * @return
     */
    Interview getInterviewByInterviewId(@Param("ID")int ID);
    /**
     * 加入面试记录
     * @param interview 面试记录
     * @return
     */
    Boolean addInterview(@Param("interview") Interview interview);

    /**
     * 根据面试记录的ID删除面试记录
     * @param ID
     */
    Boolean deleteInterviewById(@Param("ID")int ID);

    /**
     * 修改面试记录的描述
     * @param ID 要修改对的面试记录的ID
     * @param detail 修改后面试记录的描述
     */
    Boolean updateInterviewById(@Param("ID")int ID,@Param("detail")String detail);

    /**
     * 查询所有的面试记录的个数
     * @return
     */
    int getInterviewCount();
}
