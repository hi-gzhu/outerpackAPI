package com.outerpack.service;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.vo.HR.HrResult;
import org.apache.ibatis.annotations.Param;

public interface HrService {
//    Manager getManagerByName(String username);
//    Manager getManagerById(Integer id);
//    void changePassword(String username,String password);

    /**
     * 根据HR账户名获取HR个人信息
     * @param username HR账户名
     * @return
     */
    HrResult getHrByName(@Param("username") String username);
    /**
     * 根据HR在HR表中的ID号获得HR的个人信息
     * @param id HR在HR表中的ID号
     * @return
     */
    HrResult getHrById(@Param("ID") Integer id);
    /**
     * 根据HR的账户名找到信息并且替换其密码
     * @param username HR的账户名
     * @param password HR的账户密码
     */
    void changePassword(@Param("username") String username,@Param("password") String password);
}
