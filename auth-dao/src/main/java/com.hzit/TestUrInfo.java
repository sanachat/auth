package com.hzit;

import com.hzit.dao.UrInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.UrInfo;
import org.apache.ibatis.session.SqlSession;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月03日 - 19:13
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestUrInfo {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        UrInfoDao dao=session.getMapper(UrInfoDao.class);

       /* UrInfo u=new UrInfo();
        u=dao.findUrinfo(1);
        System.out.println("查询结果为：");
        System.out.println(u);
        session.close();//通过用户id查询角色id*/

        /*UrInfo u=new UrInfo();
        u.setUid(1);
        u.setRid(2);
        int num=0;
        num =dao.addUrInfo(u);
        session.commit();
        System.out.println("添加成功，受影响的行数：" + num);
        System.out.println(u);
        session.close();
        //添加用户id及角色id*/

        /*UrInfo u=new UrInfo();
        u=dao.findUrinfo(1);
		u.setRid(2);
		int num = 0;
		num = dao.updateUrInfo(u);
		System.out.println("修改成功，受影响的行数：" + num);
		session.commit();
		System.out.println(u);
		session.close();// 更新角色id或用户id*/


		int num = dao.deleteUrInfo(2);
		session.commit();
		System.out.println("删除成功，受影响的行数：" + num);
		session.close();//删除角色

    }
}
