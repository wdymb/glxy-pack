package com.glsc.model.user.service;

import com.glsc.model.user.bean.pojo.User;
import org.springframework.stereotype.Service;

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
}
