<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
</head>
<body>
<div class="header">
<div style="text-align:right"><a href="./top.jsp">Top</a></div>
</div>
<%
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
%>
<form method="POST" action="ResistryCheckServlet">
<span id="date"><%= formatter.format(date) %></span> : 
<input type="text" name="weight" /> kg
<input type="submit" name="submit" value="登録" />
</form>
</body>
</html>