import com.hzit.dao.ResourcesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Resources;
import org.apache.ibatis.session.SqlSession;


import java.io.IOException;
import java.util.List;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年08月03日 - 19:01
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */

    public class Test {
        public static void main(String[] args) throws IOException {
           // Logger log = Logger.getLogger(Test.class);
            SqlSession session = SqlSessionHelper.getSqlSession();
            ResourcesDao dao = session.getMapper(ResourcesDao.class);
            List<Resources> list =dao.findAll();
            for (Resources r : list) {
                System.out.println(r);
            }
        }
    }
