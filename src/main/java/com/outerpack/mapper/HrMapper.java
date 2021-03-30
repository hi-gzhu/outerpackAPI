package com.outerpack.mapper;

import com.outerpack.entity.pojo.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface HrMapper {
    Map getManagerByName(@Param("username") String username);

    Map getManagerById(@Param("ID") Integer id);

    void changePassword(@Param("username") String username,@Param("password") String password);
}
