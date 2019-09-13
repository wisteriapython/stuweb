package com.yujian.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "studentSaveServlet",urlPatterns = "/studentSaveServlet")
public class StudentSaveServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String stuName=request.getParameter("stuName");
        System.out.println("stuName"+stuName);
        String stuSex=request.getParameter("stuSex");
        System.out.println("stuSex"+stuSex);
        String birth=request.getParameter("birth");
        System.out.println("birth"+birth);
        String classid=request.getParameter("classid");
        System.out.println("classid"+classid);
        String tel=request.getParameter("tel");
        System.out.println("tel"+tel);



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
