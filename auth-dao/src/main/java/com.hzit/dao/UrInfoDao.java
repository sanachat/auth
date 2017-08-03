package com.hzit.dao;

import com.hzit.entity.UrInfo;

import java.util.List;

/**
 * Created by wan on 2017/8/3.
 */
public interface UrInfoDao {
    public List<UrInfo> findUrinfo();
    public int addUrInfo(UrInfo urInfo);

    public int updateUrInfo(UrInfo urInfo);

    public int deleteUrInfo(String uid);
}
