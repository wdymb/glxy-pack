package com.glsc.model.user.mapper;

import com.glsc.model.user.bean.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年06月27日 17:59
 */
@Mapper
public interface UserMapper {

    List<User> getUser();

    int addUser(User user);
}
