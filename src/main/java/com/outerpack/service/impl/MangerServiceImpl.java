package com.outerpack.service.impl;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.vo.Manager.ManagerResult;
import com.outerpack.mapper.ManagerMapper;
import com.outerpack.service.MangerService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MangerServiceImpl
 * @Description: TODO
 * @author: datealive
 * @date: 2021/3/28  21:08
 */
@Data
@Service
public class MangerServiceImpl implements MangerService {


    @Autowired
    private ManagerMapper managerMapper;


    @Override
    public ManagerResult getManagerByName(String username) {
        return managerMapper.getManagerByName(username);
    }

    @Override
    public ManagerResult getManagerById(Integer id) {

        return managerMapper.getManagerById(id);
    }

    @Override
    public Boolean changePassword(String username, String password) {
        int result=managerMapper.changePassword(username,password);

        return result>0;
    }
}

