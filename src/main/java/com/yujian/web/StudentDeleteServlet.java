package com.yujian.web;

import com.yujian.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "studentDeleteServlet" ,urlPatterns = {"/studentDeleteServlet"})
public class StudentDeleteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String stuId=request.getParameter("stuId");

        StudentDao studentDao=new StudentDao();
        studentDao.deleteStudent(Integer.parseInt(stuId));

        response.sendRedirect("studentListServlet");
    }
}
