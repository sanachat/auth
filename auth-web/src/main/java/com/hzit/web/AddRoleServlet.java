package com.hzit.web;

import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RoleInfo;
import com.hzit.entity.UserInfo;
import org.apache.ibatis.session.SqlSession;

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
@WebServlet(name = "AddRoleServlet",value = "/addrole")
public class AddRoleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RoleInfoDao roleInfoDao= SqlSessionHelper.getSqlSession().getMapper(RoleInfoDao.class);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String rname =request.getParameter("rname");

        RoleInfo r=new RoleInfo();

        r.setRname(rname);
        int num=roleInfoDao.addRole(r);
        SqlSessionHelper.getSqlSession().commit();
        if(num==1){
            request.getRequestDispatcher("/list").forward(request,response);
        }else{
            response.getWriter().append("添加失败!");

        }

        request.getRequestDispatcher("addRole.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
