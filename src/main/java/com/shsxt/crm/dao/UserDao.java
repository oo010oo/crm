package com.shsxt.crm.dao;


import com.shsxt.crm.po.User;

import java.util.List;


public interface UserDao {
    User selectUserByUserName(String userName);

    User selectUserInfoById(String id);

    void updateUserPwd(String id,String userPwd);

    List<User>selectList(User vo);

    void insertUser (User user);

    void updateUser(User user);

    void deleteUser(List<String>ids);
}
