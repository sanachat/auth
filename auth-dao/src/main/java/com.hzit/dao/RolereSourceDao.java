package com.hzit.dao;

import com.hzit.entity.RolereSource;

/**
 * Created by wan on 2017/8/3.
 */
public interface RolereSourceDao {
    public RolereSource findroleSource(int roleid);

    public int addroleSource(RolereSource roleSource);

    public int updateroleSource(RolereSource roleSource);

    public int deleteroleSource(int roleid);
}
