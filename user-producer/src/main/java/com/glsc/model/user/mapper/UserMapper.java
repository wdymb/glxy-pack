package com.glsc.model.user.mapper;

import com.glsc.model.user.bean.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年06月27日 17:59
 */
@Mapper
public interface UserMapper {

    List<User> getUser();

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(@Param("id") Integer id);

    int addUser(User user);

    void updateUser(User user);

    User getUserById(@Param("id") Integer id);
}
