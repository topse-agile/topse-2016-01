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
String error_message = (String) request.getAttribute("error_message");
Date date = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
%>

<span name="message">
<% if(error_message.equals("")) { %>
<span name="result">完了しました。</span><br>
<span id="date"><%= formatter.format(date) %></span> : 
<span name="weight"><%= request.getAttribute("weight") %></span> kg 
<% } else {%>
<span name="result"><%= error_message %></span>
<% } %>
</span>
<br>
<div><a href="./resistry.jsp">戻る</a></div>

</body>
</html>