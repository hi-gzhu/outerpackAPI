package com.outerpack.mapper;

import com.outerpack.entity.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
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

    /**
     *
     * @param id 没有被赋予权限等级的用户
     * @return  已经被赋值的权限用户
     */
    User getUserPowerByID(@Param("id")Integer id);

    /**
     *
     * @param id
     * @return
     */
    String getUserPowerDetailByID(@Param("id")Integer id);
}
