package com.hzit.dao;

import com.hzit.entity.RoleSource;

import java.util.List;

/**
 * Created by wan on 2017/8/3.
 */
public interface RoleSourceDao {
    public List<RoleSource> findroleSource();

    public int addroleSource(RoleSource roleSource);

    public int updateroleSource(RoleSource roleSource);

    public int deleteroleSource(String roleid);
}
