package com.outerpack.entity.vo.Manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerResult implements Serializable {
    Integer man_id;
    String username;
    String password;
}
