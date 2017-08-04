package com.hzit.web;

import com.hzit.dao.ResourcesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.Resources;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tracy McGrady on 2017/8/4.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        UserInfoDao userInfoDao = SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        ResourcesDao resourcesDao = SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);

        UserInfo userInfo =new UserInfo();
        List<Resources> relist = resourcesDao.findRes(userInfo.getUid());
        List<UserInfo> list =userInfoDao.findUser();
        String name= request.getParameter("name");
        String pwd = request.getParameter("pwd");
        userInfo.setUname(name);
        userInfo.setUpass(pwd);
        UserInfo u = userInfoDao.UserLogin(userInfo);
        if(u!=null)
        {
            request.getSession().setAttribute("u",u);
            request.getSession().setAttribute("relist",relist);
            request.getSession().setAttribute("list",list);
            response.sendRedirect("index.jsp");
        }else
        {
            response.sendRedirect("login.html");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
