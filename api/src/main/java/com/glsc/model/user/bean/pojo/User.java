package com.glsc.model.user.bean.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年06月27日 17:50
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
