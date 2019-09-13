package com.yujian.dao;

import com.yujian.model.ClassInfo;
import com.yujian.model.Student;
import com.yujian.util.DBHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDao {

    private DBHelper db=new DBHelper();

    public void insertStudent(Student student){
        String sql="insert into student values(null,?,?,?,?)";
        try {
            PreparedStatement pst=db.getConnection().prepareStatement(sql);
            pst.setString(1,student.getStuName());
            pst.setInt(2,student.getStuSex());
            pst.setTimestamp(3,new Timestamp(student.getBirth().getTime()));
            pst.setInt(4,student.getClassInfo().getCid());
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.closeConn();
        }
    }

    public void updateStudent(Student student){
        String sql="update student set stu_name=?,stu_sex=?,stu_birth=?,cid=? where stu_id=?";
        try {
            PreparedStatement pst=db.getConnection().prepareStatement(sql);
            pst.setString(1,student.getStuName());
            pst.setInt(2,student.getStuSex());
            pst.setTimestamp(3,new Timestamp(student.getBirth().getTime()));
            pst.setInt(4,student.getClassInfo().getCid());
            pst.setInt(5,student.getStuId());
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.closeConn();
        }
    }

    public void deleteStudent(int stuId){
        String sql="delete from student where stu_id=?";
        try {
            PreparedStatement pst=db.getConnection().prepareStatement(sql);
            pst.setInt(1,stuId);
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.closeConn();
        }
    }

    public List<Student> findStudentAll(){
        //数据库后连接断开之后，是不能通过ResultSet去获得数据值得
        //所以要转换到list集合里面去，这样哪怕数据库连接关闭，我可以在内存里
        // 操作 list集合
        List<Student> list=new ArrayList<Student>();
        String sql="select s.stu_id,s.stu_name,s.stu_sex,s.stu_birth,s.cid,c.cname";
                sql+=" from student s INNER JOIN classinfo c on s.cid=c.cid;";
        try {
            PreparedStatement pst = db.getConnection().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            //获取记录集需要迭代
            while (rs.next()) {
                //循环一次就取一行
                int stuId = rs.getInt("stu_id");
                String stuName = rs.getString("stu_name");
                int stuSex=rs.getInt("stu_sex");
                Date stuBirth=rs.getDate("stu_birth");
                Student s=new Student();
                s.setStuId(stuId);
                s.setStuName(stuName);
                s.setStuSex(stuSex);
                s.setBirth(stuBirth);
                ClassInfo c=new ClassInfo();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                s.setClassInfo(c);
                list.add(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.closeConn();
        }
        return list;
    }

    public Student findStudentById(int paramStuId){
        Student student=null;
        String sql="select s.stu_id,s.stu_name,s.stu_sex,s.stu_birth,s.cid,c.cname";
        sql+=" from student s INNER JOIN classinfo c on s.cid=c.cid";
        sql+=" where s.stu_id=?";
        try {
            PreparedStatement pst = db.getConnection().prepareStatement(sql);
            pst.setInt(1,paramStuId);
            ResultSet rs = pst.executeQuery();
            //获取记录集需要迭代
            while (rs.next()) {
                //循环一次就取一行
                int stuId = rs.getInt("stu_id");
                String stuName = rs.getString("stu_name");
                int stuSex=rs.getInt("stu_sex");
                Date stuBirth=rs.getDate("stu_birth");
                student=new Student();
                student.setStuId(stuId);
                student.setStuName(stuName);
                student.setStuSex(stuSex);
                student.setBirth(stuBirth);
                ClassInfo c=new ClassInfo();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                student.setClassInfo(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.closeConn();
        }
        return student;
    }

}
