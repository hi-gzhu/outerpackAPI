package com.outerpack.entity.vo.HR;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HrResult implements Serializable {
    Integer hr_id;
    String username;
    String password;
}
