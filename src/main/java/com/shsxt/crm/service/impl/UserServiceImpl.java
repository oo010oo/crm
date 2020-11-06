package com.shsxt.crm.service.impl;

import com.shsxt.crm.dao.UserDao;
import com.shsxt.crm.exception.ParamsException;
import com.shsxt.crm.po.User;
import com.shsxt.crm.service.UserService;
import com.shsxt.crm.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    //Ctrl Alt L
    @Autowired
    private UserDao userDao;

    /**
     * 目的是校验用户名和密码是否正确
     * <p>
     * 空字符串
     * 用户不存在
     * 用户密码不符合
     *
     * @param userName
     * @param userPwd
     */
    @Override
    public User selectUserByUserNameAndPwd(String userName, String userPwd) throws ParamsException {
        if (userName == null || "".equals(userName.trim())) {
            throw new ParamsException(20001, "用户名不能为空");
        }
        if (userPwd == null || "".equals(userPwd.trim())) {
            throw new ParamsException(20001, "用户密码不能为空");
        }
        User user = userDao.selectUserByUserName(userName);
        return user;
    }
    @Override
    public void updatePwd(String id, String oldPwd, String newPwd, String repeatPwd) throws ParamsException{
        //认证新密码，确认密码不能为空
        if (oldPwd == null || "".equals(oldPwd.trim())) {
            System.out.println("旧密码不能为空");
            throw new ParamsException(20002, "旧密码不能为空");
        }
        if(!newPwd.equals(repeatPwd)){
            System.out.println("确认密码与新密码不同");

        }
        //根据id 查询用户，
        User u = userDao.selectUserInfoById(id);
        String encode = Md5Util.encode(oldPwd);
        System.out.println(encode);
        System.out.println(u.getUserPwd());
        if(!encode.trim().equals(u.getUserPwd().trim())){
            System.out.println("旧密码与数据库密码不同");

        }
        userDao.updateUserPwd(id,Md5Util.encode(newPwd));
    }

    @Override
    public User selectUserInfoById(String id) {
        return null;
    }

    @Override
    public Map<String, Object> selectList(User vo) {
        return null;
    }

    @Override
    public void inserUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(List<String> ids) {

    }
}

