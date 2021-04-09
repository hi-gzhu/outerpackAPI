package com.outerpack.entity.vo.Candidate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Brief表示应聘者本身的基础信息详细信息在Pojo中
 * 各个字段代表的含义在pojo内均有解释
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateBrief {
    private Integer canId;
    private String canName;
    private Integer canAge;
    private Integer canExperience;
    private String canWantPosition;

}
