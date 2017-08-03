package com.hzit.dao;

import com.hzit.entity.RoleInfo;

/**
 * Created by wan on 2017/8/3.
 */
public interface RoleInfoDao {
    public RoleInfo find(String rid);//同过角色id返回角色表的所有信息
}
