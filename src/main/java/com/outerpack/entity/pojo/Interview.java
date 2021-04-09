package com.outerpack.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interview {
    private Integer inter_id;
    private Integer hr_id;
    private Integer can_id;
    private String inter_detail;
}
