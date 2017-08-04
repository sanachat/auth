package com.hzit;

import com.hzit.dao.RolereSourceDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RolereSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年08月03日 - 19:44
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestRoleSource {
    public static void main(String[] args) {
        SqlSession session= SqlSessionHelper.getSqlSession();
        RolereSourceDao dao=session.getMapper(RolereSourceDao.class);
        Logger log=Logger.getLogger("TestRoleSource");
       /* RolereSource ro=new RolereSource();
        ro=dao.findroleSource(1);
        log.debug("查询结果为：");
        log.debug(ro);
        session.close();//同过角色id查询*/

        /*RolereSource ro=new RolereSource();
        ro.setResourceid(1);
        ro.setRoleid(3);
        int num=0;
        num = dao.addroleSource(ro);
        session.commit();
        log.debug("添加成功，受影响的行数：" + num);
        log.debug(ro);
        session.close();
        //添加角色id及资源id*/

       /* RolereSource ro=new RolereSource();
        ro=dao.findroleSource(4);
		ro.setResourceid(2);
		int num = 0;
		num = dao.updateroleSource(ro);
		log.debug("修改成功，受影响的行数：" + num);
		session.commit();
		log.debug(ro);
		session.close();// 更新角色id或资源名称*/

		int num = 0;
		num = dao.deleteroleSource(3);
		session.commit();
		log.debug("删除成功，受影响的行数：" + num);
		session.close();//通过角色id删除角色

    }
}
