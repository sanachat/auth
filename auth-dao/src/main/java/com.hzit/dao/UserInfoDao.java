package com.hzit.dao;

import com.hzit.entity.Resources;
import com.hzit.entity.UserInfo;

import java.util.List;

/**
 * Created by Tracy McGrady on 2017/8/3.
 */
public interface UserInfoDao
{
    public UserInfo UserLogin(UserInfo userInfo);

    public List<UserInfo> findUser();

    public int addUser(UserInfo userInfo);

    public int updateUser(UserInfo userInfo);

    public int deleteUser(String uid);
}
