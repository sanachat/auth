package com.hzit.web;

import com.hzit.dao.ResourcesDao;
import com.hzit.dao.SqlSessionHelper;
import com.hzit.entity.Resources;
import com.hzit.entity.UserInfo;

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
        String rname = request.getParameter("rname");
        String reurl = request.getParameter("reurl");
        String resource = request.getParameter("resource");
        String roid = request.getParameter("roid");
        String resc = request.getParameter("resc");


        Resources r=new Resources();
        r.setRname(rname);
        r.setRedsdes(resource);
        r.setRedsdes(resc);
        r.setResurl(reurl);
        dao=SqlSessionHelper.getSqlSession().getMapper(ResourcesDao.class);
        int num =dao.insertResources(r);
        SqlSessionHelper.getSqlSession().commit();
        if(num==1){
            response.sendRedirect("resource");
        }else{
            response.getWriter().append("sorry!");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
