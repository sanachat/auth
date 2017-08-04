package com.hzit.web;

import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RoleInfo;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by wan on 2017/8/4.
 */
@WebServlet(name = "GetRolebyUidServlet",value = "/allrole")
public class GetRolebyUidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoleInfoDao roleInfoDao= SqlSessionHelper.getSqlSession().getMapper(RoleInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        UserInfo userInfo=(UserInfo)request.getSession().getAttribute("user");
        if(userInfo !=null){
            //获取当前登录用户所拥有的资源
            List<RoleInfo> rolelist= roleInfoDao.findRolebyuid(userInfo.getUid());
            request.setAttribute("rolelist",rolelist);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
