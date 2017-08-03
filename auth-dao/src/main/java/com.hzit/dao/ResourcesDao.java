package com.hzit.dao;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface ResourcesDao {
    public Resource findByRid(String rid);
    public int insertResources(Resource resource);
    public int updateResources(Resource resource);
    public int deleteResources(String rid);

}
