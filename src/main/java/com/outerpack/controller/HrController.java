package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.service.HrService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RequestMapping("/Hr")
@RestController
public class HrController {
    @Autowired
    private HrService hrService;

    @PostMapping("/getByName/{name}")
    public Result getByName(@PathVariable("name") String username){
        HrResult hrByName = hrService.getHrByName(username);
        if(hrByName!=null)return Result.success("Hr",hrByName);
        else return Result.error("没有该Hr");
    }

    @PostMapping("/getByID/{ID}")
    public Result getByID(@PathVariable("ID") int ID){
        HrResult hrById = hrService.getHrById(ID);
        if(hrById!=null)return Result.success("Hr",hrById);
        else return Result.error("没有该Hr");
    }

    @PostMapping("/changePassword/{name}/{password}")
    public Result change(@PathVariable("name") String username,@PathVariable("password") String password){
        Boolean aBoolean = hrService.changePassword(username, password);
        if(aBoolean)return Result.success("修改成功");
        else return Result.error("修改失败");
    }
}
