package com.hzit;

import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RoleInfo;
import org.apache.ibatis.session.SqlSession;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月03日 - 18:25
 * |  @description   测试
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestRoleinfo {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        RoleInfoDao dao=session.getMapper(RoleInfoDao.class);
        RoleInfo r=new RoleInfo();
        r.setRid(3);
        r.setRname("测试人员");
        int num=0;
        num = dao.addRole(r);
        session.commit();
        System.out.println("添加成功，受影响的行数：" + num);
        System.out.println(r);
        session.close();
    }
}
