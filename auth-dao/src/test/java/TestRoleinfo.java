import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RoleInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

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
        Logger log=Logger.getLogger("TestRoleinfo");
        RoleInfo r=new RoleInfo();
        r=dao.findRole(4);
        log.debug("查询结果为：");
        log.debug(r);
        session.close();

        /*RoleInfo r=new RoleInfo();
        r.setRid(5);
        r.setRname("测试人员");
        int num=0;
        num = dao.addRole(r);
        session.commit();
        log.debug("添加成功，受影响的行数：" + num);
        log.debug(r);
        session.close();
        //添加角色id及角色名字*/

        /*RoleInfo r=new RoleInfo();
        r=dao.findRole(5);
		r.setRname("技术人员");
		int num = 0;
		num = dao.updateRole(r);
		log.debug("修改成功，受影响的行数：" + num);
		session.commit();
		log.debug(r);
		session.close();// 更新角色id或角色名称*/

		/*int num = 0;
		num = dao.deleteRole(5);
		session.commit();
		log.debug("删除成功，受影响的行数：" + num);
		session.close();//删除角色*/

    }
}
