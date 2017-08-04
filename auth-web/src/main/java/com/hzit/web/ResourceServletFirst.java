package com.hzit.web;

import com.hzit.dao.ResourcesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Resources;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "ResourceServletFirst",value = "/toAddResource")
public class ResourceServletFirst extends HttpServlet {
    ResourcesDao dao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        dao= SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);
        List<Resources> l=  dao.findFirst();
        request.getSession().setAttribute("FirstResource",l);
        response.sendRedirect("addResources.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
