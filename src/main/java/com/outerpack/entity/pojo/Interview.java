package com.outerpack.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interview {
    private Integer interId;
    private Integer hrId;
    private Integer canId;
    private String interDetail;
}
