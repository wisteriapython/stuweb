package com.yujian.web;

import com.yujian.dao.ClassinfoDao;
import com.yujian.dao.StudentDao;
import com.yujian.model.ClassInfo;
import com.yujian.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "studentPreUpdateServlet",urlPatterns = "/studentPreUpdateServlet")
public class StudentPreUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        PrintWriter out=response.getWriter();

        StudentDao studentDao=new StudentDao();
        ClassinfoDao classinfoDao=new ClassinfoDao();
        List<ClassInfo> classinfos=classinfoDao.findClassinfoAll();

        //通过连接地址传参数，获得待修改的学生编号
        String stuId=request.getParameter("stuId");
        Student s=studentDao.findStudentById(Integer.parseInt(stuId));

        out.print("<html><form action='studentUpdateServlet'>");
        out.print("<input type='hidden' name='stuId' value='"+s.getStuId()+"'");
        out.print("<ul style='list-style:none;'>");
        out.print("<li>姓名<input type='text' name='stuName' value='"+s.getStuName()+"'/></li>");
        out.print("<li>性别<input type='radio' name='stuSex' value='1' ");
        if(s.getStuSex()==1){
            out.print(" checked");
        }
        out.print("/>男");
        out.print("<input type='radio' name='stuSex' value='0'");
        if(s.getStuSex()==0){
            out.print(" checked");
        }
        out.print("/>女</li>");
        out.print("<li>生日<input type='text' name='birth' value='"+s.getBirth()+"'/></li>");
        out.print("<li>班级<select name='classid'>");
        out.print("<option value=''>请选择</option>");
        for(ClassInfo c:classinfos) {
            if (c.getCid() == s.getClassInfo().getCid()){
                out.print("<option value='" + c.getCid() + "' selected>" + c.getCname() + "</option>");
            }else{
                out.print("<option value='" + c.getCid() + "'>" + c.getCname() + "</option>");
            }
        }
        out.print("</select></li>");
        out.print("<ul>");
        out.print("<input type='submit' value='保存'/>");
        out.print("</form></html>");
    }
}
