package com.outerpack.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
//    id int primary key auto_increment,
//    username varchar(32),
//    password varchar(32),
//    permission_id int,
//    role int,
    private int id;
    private String username;
    private String password;
    private int permission_id;
    private int role;
}
