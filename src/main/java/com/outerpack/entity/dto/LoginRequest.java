package com.outerpack.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: LoginRequest
 * @Description: TODO
 * @author: datealive
 * @date: 2021/4/2  10:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("登录用户实体")
public class LoginRequest implements Serializable {


    @ApiModelProperty(value = "用户账户",example = "admin")
    private String username;
    @ApiModelProperty(value = "用户密码",example = "admin")
    private String password;
    @ApiModelProperty(value = "用户身份",example = "0")
    private int role;

}
