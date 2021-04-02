package com.outerpack.entity.dto;

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
public class LoginRequest implements Serializable {


    private String username;
    private String password;
    private int role;

}
