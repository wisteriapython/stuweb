package com.yujian.dao;

import com.yujian.model.ClassInfo;
import com.yujian.util.DBHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClassinfoDao {

    private DBHelper db=new DBHelper();

    public List<ClassInfo> findClassinfoAll(){
        String sql="select * from classinfo";
        List<ClassInfo> list=new ArrayList<ClassInfo>();
        try {
            java.sql.PreparedStatement pst=db.getConnection().prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                ClassInfo c=new ClassInfo();
                c.setCid(rs.getInt("cid"));
                c.setCname(rs.getString("cname"));
                list.add(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.closeConn();
        }
        return list;
    }

}
