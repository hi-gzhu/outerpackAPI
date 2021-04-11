package com.outerpack.controller;

import com.outerpack.common.Result;
import com.outerpack.entity.vo.HR.HrResult;
import com.outerpack.service.HrService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Data
@RequestMapping("/Hr")
@RestController
public class HrController {
    @Autowired
    private HrService hrService;

    @ApiOperation("根据HR的名称获取HR信息")
    @GetMapping("/getByName/{name}")
    public Result getByName(@ApiParam(value = "HR名称",example = "hr") @PathVariable("name") String username){
        HrResult hrByName = hrService.getHrByName(username);
        if(hrByName!=null)return Result.success("Hr",hrByName);
        else return Result.error("没有该Hr");
    }

    @ApiOperation("根据HR的ID获取HR信息")
    @GetMapping("/getByID/{ID}")
    public Result getByID(@ApiParam(value = "HR的ID",example = "1")@PathVariable("ID") int ID){
        HrResult hrById = hrService.getHrById(ID);
        if(hrById!=null)return Result.success("Hr",hrById);
        else return Result.error("没有该Hr");
    }

    @ApiOperation("根据HR的名称修改密码")
    @PutMapping("/changePassword/{name}/{password}")
    public Result change(@ApiParam(value = "HR的名称",example = "hr")@PathVariable("name") String username,@ApiParam(value = "密码",example = "123456789")@PathVariable("password") String password){
        Boolean aBoolean = hrService.changePassword(username, password);
        if(aBoolean)return Result.success("修改成功");
        else return Result.error("修改失败");
    }
}
