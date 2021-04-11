package com.outerpack.entity.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("企业人员实体类")
public class User {
//    id int primary key auto_increment,
//    username varchar(32),
//    password varchar(32),
//    permission_id int,
//    role int,
    private int id;
    private String username;
    private String password;
    private int permissionId;
    private int role;
    private String power;
}
