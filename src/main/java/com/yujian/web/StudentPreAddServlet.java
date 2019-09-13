package com.yujian.web;

import com.yujian.dao.ClassinfoDao;
import com.yujian.dao.StudentDao;
import com.yujian.model.ClassInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "studentPreAddServlet",urlPatterns = {"/studentPreAddServlet"})
public class StudentPreAddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();

        ClassinfoDao classinfoDao=new ClassinfoDao();
        List<ClassInfo> classinfos=classinfoDao.findClassinfoAll();

        out.print("<html><form action='studentAddServlet'>");
        out.print("<ul style='list-style:none;'>");
        out.print("<li>姓名<input type='text' name='stuName'/></li>");
        out.print("<li>性别<input type='radio' name='stuSex' value='1'/>男<input type='radio' name='stuSex' value='0'/>女</li>");
        out.print("<li>生日<input type='text' name='birth'/></li>");
        out.print("<li>班级<select name='classid'>");
        out.print("<option value=''>请选择</option>");
        for(ClassInfo c:classinfos) {
            out.print("<option value='"+c.getCid()+"'>"+c.getCname()+"</option>");
        }
        out.print("</select></li>");
        out.print("<ul>");
        out.print("<input type='submit' value='保存'/>");
        out.print("</form></html>");
    }
}
