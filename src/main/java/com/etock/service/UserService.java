package com.etock.service;

import com.etock.pojo.User;

import java.util.List;

public interface UserService {
    public User JudgeAccount();

    public User IfIsNull(String username);

    public boolean AddAccount(User user);

    public boolean DeleteAccount();

    public User SelectOne(Long id);

    public List<User> SelectList();
}

