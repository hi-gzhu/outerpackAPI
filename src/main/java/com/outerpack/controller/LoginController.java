package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.dto.LoginRequest;
import com.outerpack.entity.pojo.User;
import com.outerpack.service.UserService;
import com.outerpack.utils.JwtUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: LoginController
 * @Description: TODO
 * @author: datealive
 * @date: 2021/4/2  10:48
 */
@RestController
public class LoginController {


    @Autowired
    UserService userService;


    @ApiOperation("用户登录接口")
    @PostMapping("/login")
    public Result UserLoginSys(@ApiParam(value = "用户登录实体",example = "json字符串") @RequestBody LoginRequest loginRequest, HttpServletResponse response){
        User user = userService.getUserByName(loginRequest.getUsername());
        String passwordMd5 = new Md5Hash(loginRequest.getPassword(), loginRequest.getUsername(), 1024).toHex();
        System.out.println("加密后的密码===>"+passwordMd5);
        if(!user.getPassword().equals(passwordMd5)){
            return Result.error("账户密码错误");
        }
        String token = JwtUtils.getToken(loginRequest.getUsername(), passwordMd5);
        response.setHeader("Authorization", token);
        response.setHeader("Access-control-Expose-Headers", "Authorization");
        return Result.success("登录成功",user);
    }






}
