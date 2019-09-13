package com.yujian.web;

import com.yujian.dao.StudentDao;
import com.yujian.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "studentListServlet",urlPatterns = {"/studentListServlet"})
public class StudentListServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setCharacterEncoding("UTF-8");//在电脑的浏览器里有效，但是手机上的浏览器会乱码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();

        StudentDao studentDao=new StudentDao();
        List<Student> students=studentDao.findStudentAll();

        out.println("<html>");
        out.println("<a href='studentPreAddServlet'>新增</a>");
        out.println("<table border='1' width='80%'>");
        out.println("<tr><td>编号</td><td>姓名</td><td>性别</td><td>生日</td><td>班级</td><td>操作</td></tr>");
        for(Student s:students){
            out.println("<tr><td>"+s.getStuId()+"</td><td><a href='studentPreUpdateServlet?stuId="+s.getStuId()+"'>"+s.getStuName()+"</a></td><td>"+(s.getStuSex()==1?'男':'女')+"</td><td>"+s.getBirth()+"</td><td>"+s.getClassInfo().getCname()+"</td><td><a href='javascript:del("+s.getStuId()+")'>删除</a></td></tr>");
        }
        out.println("</table>");
        out.println("</html>");
        out.println("<script>");
        out.println("function del(stuId){");
        out.println("if(window.confirm('你确定删除吗？')==1){");
        out.println("   window.location='studentDeleteServlet?stuId='+stuId");
        out.println("}}");
        out.println("</script>");
    }
}
