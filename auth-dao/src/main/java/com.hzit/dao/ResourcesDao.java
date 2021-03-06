package com.hzit.dao;

import com.hzit.entity.Resources;

import java.util.List;


/**
 * Created by Administrator on 2017/8/3.
 */
public interface ResourcesDao {
    public Resources findByRid(int rid);

    public List<Resources> findRes(int uid);

    public List<Resources> findAll();

    public int insertResources(Resources resource);

    public int updateResources(Resources resource);

    public int deleteResources(int rid);

    public List<Resources> findFirst();

}
