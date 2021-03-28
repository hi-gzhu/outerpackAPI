package com.outerpack.service;

import com.outerpack.entity.pojo.Manager;

/**
 * @ClassName: MangerService
 * @Description: TODO
 * @author: datealive
 * @date: 2021/3/28  21:08
 */
public interface MangerService {
    Manager getManagerByName(String username);
    Manager getManagerById(Integer id);
    void changePassword(String username,String password);

}
