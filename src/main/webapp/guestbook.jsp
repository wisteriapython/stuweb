<%--
  Created by IntelliJ IDEA.
  User: 预见
  Date: 2018-11-21
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.yujian.dao.GuestBookDao" %>
<%@ page import="com.yujian.model.GuestBook" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="processGuestBook.jsp">
    <textarea name="context" cols="70" rows="6"></textarea>
    <br>
    <input type="submit" value="发言">
</form>
<hr>

<%
    GuestBookDao guestBookDao=new GuestBookDao();
    List<GuestBook> guestBookList=guestBookDao.findGuestBookAll();
    for(GuestBook gb:guestBookList){
%>
<div style="height: 50px;border-bottom: 1px solid red;">
    <%=gb.getContext()%>
    </div>
<%
    }

%>

<%!
    public void fun1(){
        System.out.println("成员方法，比如日期转换，数据类型转型");
    }
%>
<%--<jsp:include page=""/>--%>
</body>
</html>