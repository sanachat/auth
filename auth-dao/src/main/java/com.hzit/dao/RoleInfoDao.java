package com.hzit.dao;

import com.hzit.entity.RoleInfo;

import java.util.List;

/**
 * Created by wan on 2017/8/3.
 */
public interface RoleInfoDao {
    public List<RoleInfo> findRole(int rid);

    public int addRole(RoleInfo roleInfo);

    public int updateRole(RoleInfo roleInfo);

    public int deleteRole(int rid);
}
