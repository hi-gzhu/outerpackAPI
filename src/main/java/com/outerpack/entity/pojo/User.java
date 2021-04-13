package com.outerpack.entity.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("企业人员实体类")
public class User implements Serializable {
//    id int primary key auto_increment,
//    username varchar(32),
//    password varchar(32),
//    permission_id int,
//    role int,
    @ApiModelProperty(value = "用户ID",example = "1")
    private int id;

    @ApiModelProperty(value = "用户账号",example = "admin")
    private String username;

    @ApiModelProperty(value = "用户密码",example = "123456")
    private String password;

    @ApiModelProperty(value = "用户权限等级",example = "1")
    private int permissionId;

    @ApiModelProperty(value = "用户角色",example = "1")
    private int role;

    @ApiModelProperty(value = "该用户的权限描述",example = "CRUD")
    private String power;
}
