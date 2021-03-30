package com.outerpack.service;

import com.outerpack.entity.pojo.Manager;

public interface HrService {
    Manager getManagerByName(String username);
    Manager getManagerById(Integer id);
    void changePassword(String username,String password);
}
