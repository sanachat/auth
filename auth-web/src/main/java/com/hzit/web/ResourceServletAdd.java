package com.hzit.web;

import com.hzit.dao.ResourcesDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/4.
 */
@WebServlet(name = "ResourceServletAdd",value = "/addResource")
public class ResourceServletAdd extends HttpServlet {
    ResourcesDao dao;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("处理模块的新增功能");
        request.setCharacterEncoding("UTF-8");
        String rname=request.getParameter("rname");
        String reurl=request.getParameter("reurl");
        String reurl=request.getParameter("reurl");
        String reurl=request.getParameter("reurl");
        String reurl=request.getParameter("reurl");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
