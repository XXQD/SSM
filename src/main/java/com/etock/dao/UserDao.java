package com.etock.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.etock.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
