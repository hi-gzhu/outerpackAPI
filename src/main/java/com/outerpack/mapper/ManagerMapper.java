package com.outerpack.mapper;

import com.outerpack.entity.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManagerMapper {
//    Manager getManagerByName(String username);
//    Manager getManagerById(Integer id);
//    int changePassword(String username,String password);

    Manager getManagerByName(@Param("username") String username);

    Manager getManagerById(@Param("ID") Integer id);

    int changePassword(@Param("username") String username,@Param("password") String password);
}
