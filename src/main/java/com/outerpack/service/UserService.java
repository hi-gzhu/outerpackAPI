package com.outerpack.service;

import com.outerpack.entity.pojo.User;
import com.outerpack.entity.vo.Manager.ManagerResult;
import org.apache.ibatis.annotations.Param;

/**
 * 登录的业务
 */
public interface UserService {
    /**
     *
     * @param username 用户名
     * @return
     */
    User getUserByName(@Param("username")String username);

    /**
     *
     * @param id 用户在用户表中ID
     * @return
     */
    User getUserById(@Param("ID") Integer id);

    /**
     *
     * @param username 用户名
     * @param password 用户密码
     */
    void changePassword(@Param("username")String username,@Param("password")String password);

}
