package com.outerpack.entity.vo.Manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerResult {
    Integer man_id;
    String username;
    String password;
}
