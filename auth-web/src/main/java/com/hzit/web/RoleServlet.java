package com.hzit.web;

import com.hzit.dao.RoleInfoDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.RoleInfo;

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
@WebServlet(name="RoleServlet",value = "/list")
public class RoleServlet extends HttpServlet {

        RoleInfoDao dao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dao= SqlSessionHelper.getSqlSession().getMapper(RoleInfoDao.class);
        List<RoleInfo> r=dao.findAllRole();
        request.getSession().setAttribute("role", r);
        System.out.println("1");
        request.getRequestDispatcher("Role.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
