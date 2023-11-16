package com.etock.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.etock.dao.UserDao;
import com.etock.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements com.etock.service.UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User JudgeAccount() {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.select(User :: getUsername,User :: getPassword);
        return userDao.selectOne(lqw);
    }

    @Override
    public User IfIsNull(String username) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper();
        return null;
    }

    @Override
    public boolean AddAccount(User user) {
        return false;
    }

    @Override
    public boolean DeleteAccount() {
        return false;
    }

    @Override
    public User SelectOne(Long id) {
        return null;
    }

    @Override
    public List<User> SelectList() {
        return null;
    }
}
