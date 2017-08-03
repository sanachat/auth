package com.hzit.entity;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月03日 - 16:53
 * |  @description   角色资源关联啊
 * +---------------------------------Oooo---------------------------------------+
 */
public class RoleSource {
    private  int roleid;
    private  int resourceid;

    public int getResourceid() {
        return resourceid;
    }

    public void setResourceid(int resourceid) {
        this.resourceid = resourceid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public String toString() {
        return "RoleSource{" +
                "roleid=" + roleid +
                ", resourceid=" + resourceid +
                '}';
    }
}
