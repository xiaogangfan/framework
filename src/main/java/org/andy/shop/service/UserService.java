package org.andy.shop.service;

/**
 * Created by xiaogangfan on 16/3/29.
 */

import java.util.List;

import org.andy.shop.model.UserInfo;

public interface UserService {

    UserInfo getUserById(int id);

    List<UserInfo> getUsers();

    int insert(UserInfo userInfo);
}
