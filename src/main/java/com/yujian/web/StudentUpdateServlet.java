package com.yujian.web;

import com.yujian.dao.StudentDao;
import com.yujian.model.ClassInfo;
import com.yujian.model.Student;
import com.yujian.util.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "studentUpdateServlet",urlPatterns = {"/studentUpdateServlet"})
public class StudentUpdateServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();

        String stuId=request.getParameter("stuId");
        String stuName=request.getParameter("stuName");
        String stuSex=request.getParameter("stuSex");
        String birth=request.getParameter("birth");
        String classid=request.getParameter("classid");

        Student student=new Student();
        student.setStuId(Integer.parseInt(stuId));
        student.setStuName(stuName);
        student.setStuSex(Integer.parseInt(stuSex));
        ClassInfo classInfo=new ClassInfo();

        if(null==classid||"".equals(classid)){
            //如果发现没有选择有效班级，可以跳转其它连接去，给出错误提示
            //或者用javascript去处理
            out.print("<script>alert('亲，请选择班级');window.history.go(-1);</script>");
            return;
        }
        classInfo.setCid(Integer.parseInt(classid));
        student.setClassInfo(classInfo);
        student.setBirth(DateUtil.string2Date(birth,"yyyy-MM-dd"));

        new StudentDao().updateStudent(student);
        //跳转列表
        response.sendRedirect("studentListServlet");
    }
}
