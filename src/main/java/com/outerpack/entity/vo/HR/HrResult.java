package com.outerpack.entity.vo.HR;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HrResult implements Serializable {
    @ApiModelProperty(value = "Hr的ID号",example = "1")
    Integer hr_id;

    @ApiModelProperty(value = "Hr的用户名",example = "1")
    String username;

    @ApiModelProperty(value = "Hr的密码",example = "1")
    String password;
}
