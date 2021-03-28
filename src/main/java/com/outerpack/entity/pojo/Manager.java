package com.outerpack.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manager {
    //    man_id int primary key auto_increment
    private Integer manId;
    //    man_name varchar(32)
    private String manName;
    //    man_gender int
    private Integer manGender;
    //    man_age int
    private Integer manAge;
    //    man_dep int
    private Integer manDep;
    //    man_UID varchar(32)
    private String manUID;
    //    man_mail varchar(32)
    private String manMail;
    //    man_address varchar(32)
    private String manAddress;
    //    man_phone varchar(32)
    private String manPhone;
    //    man_position varchar(32)
    private String manPosition;
    //    man_username varchar(32)
    private String manUsername;
    //    man_password varchar(32)
    private String manPassword;
    //    man_workYear int
    private Integer manWorkYear;
    //    man_head varchar(100)
    private String manHead;
}
