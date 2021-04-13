package com.outerpack.entity.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(value = "应聘者ID",example = "1")
    private Integer canId;

    @ApiModelProperty(value = "应聘者姓名",example = "My-cong")
    private String canName;

    @ApiModelProperty(value = "应聘者年龄",example = "18")
    private Integer canAge;

    @ApiModelProperty(value = "应聘者工作经验",example = "3")
    private Integer canExperience;

    @ApiModelProperty(value = "应聘者应聘岗位",example = "后端开发")
    private String canWantPosition;

    @ApiModelProperty(value = "",example = "1")
    private String canIdentify;

    @ApiModelProperty(value = "应聘者应聘的岗位的部门",example = "1")
    private Integer canDep;

    @ApiModelProperty(value = "应聘者目前所处的面试等级",example = "2")
    private Integer canGrade;

    @ApiModelProperty(value = "应聘者的能力",example = "springboot")
    private String canPower;

    @ApiModelProperty(value = "应聘者性别",example = "1")
    private String canGender;


    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "应聘者投递简历的日期",example = "2021-10-10")
    private Date canDate;

    @ApiModelProperty(value = "应聘者期望薪资/k",example = "15")
    private Integer canSalary;

    @ApiModelProperty(value = "应聘者的电话",example = "19120533958")
    private String canPhone;

    @ApiModelProperty(value = "应聘者头像")
    private String canHead;
}
