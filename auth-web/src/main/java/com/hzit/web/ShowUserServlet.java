package com.hzit.web;

import com.hzit.dao.SqlSessionHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Tracy McGrady on 2017/8/4.
 */
@WebServlet(name = "ShowUserServlet" ,value = "/ShowUserServlet")
public class ShowUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        UserInfoDao userInfoDao = SqlSessionHelper.getSqlSession().getMapper(UserInfoDao.class);
        List<UserInfo> list = userInfoDao.findUser();
        for (UserInfo userInfo:list )
            out.println(userInfo);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
