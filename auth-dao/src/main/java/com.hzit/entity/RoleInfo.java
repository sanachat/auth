package com.hzit.entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月03日 - 16:46
 * |  @description   角色
 * +---------------------------------Oooo---------------------------------------+
 */
public class RoleInfo {
    private  int rid;
    private  String rname;
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                '}';
    }
}
