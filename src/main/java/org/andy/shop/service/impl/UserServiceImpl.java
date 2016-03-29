package org.andy.shop.service.impl;

/**
 * Created by xiaogangfan on 16/3/29.
 */
import org.andy.shop.dao.UserInfoMapper;
import org.andy.shop.service.UserService;
import java.util.List;

import org.andy.shop.model.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserById(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> getUsers() {
        return userInfoMapper.selectAll();
    }

    @Override
    public int insert(UserInfo userInfo) {

        int result = userInfoMapper.insert(userInfo);

        System.out.println(result);
        return result;
    }

}
