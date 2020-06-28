package com.glsc.model.user.service;


import com.glsc.model.user.bean.pojo.User;

import java.util.List;

public interface IUserService {

    List<User> getUser();

    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    boolean addUser(User user);

    User updateUser(User user);
}
