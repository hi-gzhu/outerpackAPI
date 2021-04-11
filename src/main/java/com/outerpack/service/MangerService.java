package com.outerpack.service;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.vo.Manager.ManagerResult;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: MangerService
 * @Description: TODO
 * @author: datealive
 * @date: 2021/3/28  21:08
 */
public interface MangerService {
    /**
     * 根据管理员账户名获取管理员信息
     * @param username 管理员账户名
     * @return
     */
    ManagerResult getManagerByName(@Param("username") String username);
    /**
     * 根据管理员id获取管理员信息
     * @param id 管理员在管理员表中的ID号
     * @return
     */
    ManagerResult getManagerById(@Param("ID") Integer id);
    /**
     * 根据管理员账户名和密码修改账户密码
     * @param username 管理员的账户名
     * @param password  管理员的账户密码
     * @return
     */
    Boolean changePassword(@Param("username") String username,@Param("password") String password);

}
