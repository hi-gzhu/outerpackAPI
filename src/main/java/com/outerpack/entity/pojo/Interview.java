package com.outerpack.entity.pojo;

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
    private Integer interId;
    private Integer hrId;
    private Integer canId;
    private String interDetail;
}
