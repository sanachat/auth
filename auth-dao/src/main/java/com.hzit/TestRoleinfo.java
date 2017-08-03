package com.hzit;

import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RoleInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

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
        r=dao.findRole(4);
        System.out.println("查询结果为：");
        System.out.println(r);
        session.close();

        /*RoleInfo r=new RoleInfo();
        r.setRid(5);
        r.setRname("测试人员");
        int num=0;
        num = dao.addRole(r);
        session.commit();
        System.out.println("添加成功，受影响的行数：" + num);
        System.out.println(r);
        session.close();
        //添加角色id及角色名字*/

        /*RoleInfo r=new RoleInfo();
        r=dao.findRole(5);
		r.setRname("技术人员");
		int num = 0;
		num = dao.updateRole(r);
		System.out.println("修改成功，受影响的行数：" + num);
		session.commit();
		System.out.println(r);
		session.close();// 更新角色id或角色名称*/

		/*int num = 0;
		num = dao.deleteRole(5);
		session.commit();
		System.out.println("删除成功，受影响的行数：" + num);
		session.close();//删除角色*/

    }
}
