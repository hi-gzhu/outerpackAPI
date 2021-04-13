package com.outerpack.entity.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Lenovo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interview implements Serializable {
    @ApiModelProperty(value = "面试记录ID号",example = "1")
    private Integer interId;

    @ApiModelProperty(value = "该面试记录中的Hr的ID号",example = "1")
    private Integer hrId;

    @ApiModelProperty(value = "该面试记录中应聘者ID",example = "1")
    private Integer canId;

    @ApiModelProperty(value = "该面试中Hr对面试者的评价",example = "1")
    private String interDetail;
}
