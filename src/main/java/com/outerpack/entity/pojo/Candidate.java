package com.outerpack.entity.pojo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * Id表示的是该对象在数据库中存储的ID号，索引号
 *
 * name表示的是应聘者的姓名，类型为String
 *
 * age表示的是应聘者自身的年龄，类型为int
 *
 * experience表示的是应聘者自身的工作经验，类型为int
 *
 * wantPosition表示的是应聘者投递的岗位
 *
 * indentify
 *
 * dep表示的是应聘者应聘的岗位所在的部门ID
 *
 * grade表示的是目前应聘者所处的面试级，一面二面这样
 *
 * power
 *
 * gender是应聘者的性别
 *
 * date是应聘者投递的日期
 *
 * salary表示的应聘者的期望薪资
 *
 * phone表示的是应聘者的手机号
 *
 * head表示的是应聘者的头像
 *
 *
 */
@ApiModel("应聘者实体")
public class Candidate implements Serializable {

    private Integer canId;
    private String canName;
    private Integer canAge;
    private Integer canExperience;
    private String canWantPosition;
    private String canIdentify;
    private Integer canDep;
    private Integer canGrade;
    private String canPower;
    private String canGender;
    private Date canDate;
    private Integer canSalary;
    private String canPhone;
    private String canHead;
}
