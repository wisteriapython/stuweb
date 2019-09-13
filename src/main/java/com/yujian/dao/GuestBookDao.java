package com.yujian.dao;

import com.yujian.model.GuestBook;
import com.yujian.util.DBHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuestBookDao {
    private DBHelper db=new DBHelper();

    public void insertGuestBook(GuestBook gb){
        String sql="insert into guestbook values(null,?)";
        try {
            java.sql.PreparedStatement pst = db.getConnection().prepareStatement(sql);
            pst.setString(1,gb.getContext());
            pst.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.closeConn();
        }
    }

    public List<GuestBook> findGuestBookAll(){
        String sql="select * from guestbook";
        List<GuestBook> list=new ArrayList<>();
        try {
            java.sql.PreparedStatement pst = db.getConnection().prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                GuestBook gb=new GuestBook();
                gb.setGuestId(rs.getInt("gusetId"));
                gb.setContext(rs.getString("context"));
                list.add(gb);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            db.closeConn();
        }
        return list;
    }
}
