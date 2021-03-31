package com.outerpack.entity.vo.HR;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HrResult {
    Integer hr_id;
    String username;
    String password;
}
