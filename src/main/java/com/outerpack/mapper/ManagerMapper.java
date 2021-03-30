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

    /**
     * 根据管理员账户名获取管理员信息
     * @param username 管理员账户名
     * @return
     */
    Manager getManagerByName(@Param("username") String username);

    /**
     * 根据管理员id获取管理员信息
     * @param id
     * @return
     */
    Manager getManagerById(@Param("ID") Integer id);

    /**
     * 根据管理员账户名和密码修改账户密码
     * @param username
     * @param password
     * @return
     */
    int changePassword(@Param("username") String username,@Param("password") String password);
}
