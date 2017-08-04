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
@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        UserInfoDao userInfoDao = SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        ResourcesDao resourcesDao = SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);

        UserInfo userInfo =new UserInfo();
        List<UserInfo> list =userInfoDao.findUser();
        String name= request.getParameter("username");
        String pwd = request.getParameter("password");
        userInfo.setUname(name);
        userInfo.setUpass(pwd);
        UserInfo u = userInfoDao.UserLogin(userInfo);
        List<Resources> relist = resourcesDao.findRes(u.getUid());
        for(Resources resources:relist){
            System.out.println(resources.toString());
        }
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

        doPost(request,response);
    }
}
