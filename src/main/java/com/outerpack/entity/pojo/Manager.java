package com.outerpack.entity.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manager implements Serializable {
    //    man_id int primary key auto_increment
    @ApiModelProperty(value = "管理员ID号",example = "1")
    private Integer manId;

    //    man_name varchar(32)
    @ApiModelProperty(value = "管理员姓名",example = "My-cong")
    private String manName;
    //    man_gender int

    @ApiModelProperty(value = "管理员性别",example = "1")
    //1表示男，0表示女
    private Integer manGender;
    //    man_age int

    @ApiModelProperty(value = "管理员年龄",example = "28")
    private Integer manAge;
    //    man_dep int

    @ApiModelProperty(value = "管理员部门",example = "人力部")
    private Integer manDep;
    //    man_UID varchar(32)

    @ApiModelProperty(value = "管理员的UID",example = "adads12346894")
    private String manUID;
    //    man_mail varchar(32)

    @ApiModelProperty(value = "管理员的邮箱",example = "1111111@qq.com")
    private String manMail;
    //    man_address varchar(32)

    @ApiModelProperty(value = "管理员的住址",example = "广大")
    private String manAddress;
    //    man_phone varchar(32)

    @ApiModelProperty(value = "管理员的手机号",example = "11111111110")
    private String manPhone;
    //    man_position varchar(32)

    @ApiModelProperty(value = "管理员的岗位",example = "人力部")
    private String manPosition;
    //    man_username varchar(32)

    @ApiModelProperty(value = "管理员的用户账号",example = "admin")
    private String manUsername;
    //    man_password varchar(32)

    @ApiModelProperty(value = "管理员的密码",example = "123456")
    private String manPassword;
    //    man_workYear int

    @ApiModelProperty(value = "管理员的工作经验",example = "10")
    private Integer manWorkYear;
    //    man_head varchar(100)

    @ApiModelProperty(value = "管理员的头像")
    private String manHead;
}
