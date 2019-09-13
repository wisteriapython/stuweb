<%--
  Created by IntelliJ IDEA.
  User: 预见
  Date: 2018-11-21
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.yujian.dao.GuestBookDao" %>
<%@ page import="com.yujian.model.GuestBook" %>
<%
    String context=request.getParameter("context");
    GuestBook gb=new GuestBook();
    gb.setContext(context);

    GuestBookDao guestBookDao=new GuestBookDao();
    guestBookDao.insertGuestBook(gb);

    response.sendRedirect("guestbook.jsp");
%>