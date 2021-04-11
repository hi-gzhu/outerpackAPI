package com.outerpack.service.impl;

import com.outerpack.entity.pojo.Manager;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.mapper.HrMapper;
import com.outerpack.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrMapper hrMapper;

    @Override
    public HrResult getHrByName(String username) {
        return hrMapper.getHrByName(username);

    }

    @Override
    public HrResult getHrById(Integer id) {
        return hrMapper.getHrById(id);
    }

    @Override
    public Boolean changePassword(String username, String password) {
        int result=hrMapper.changePassword(username, password);
        return result>0;
    }
}
