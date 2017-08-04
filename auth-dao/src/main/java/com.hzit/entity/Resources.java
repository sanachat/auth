package com.hzit.entity;

import java.sql.Timestamp;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年08月03日 - 16:49
 * |  @description   资源实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Resources {
    private int rid;
    private String rname;
    private String resurl;
    private int resorderno;
    private String redsdes;
    private Timestamp createTime;
    private Timestamp updatetime;
    private String createMan;
    private String updateMan;
    private int parentId;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    public int getResorderno() {
        return resorderno;
    }

    public void setResorderno(int resorderno) {
        this.resorderno = resorderno;
    }

    public String getRedsdes() {
        return redsdes;
    }

    public void setRedsdes(String redsdes) {
        this.redsdes = redsdes;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", resurl='" + resurl + '\'' +
                ", resorderno=" + resorderno +
                ", redsdes='" + redsdes + '\'' +
                ", createTime=" + createTime +
                ", updatetime=" + updatetime +
                ", createMan='" + createMan + '\'' +
                ", updateMan='" + updateMan + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}