<%@page import="java.util.List" %>
<%@page import="org.hibernate.Session" %>
<%@page import="org.hibernate.Query" %>
<%@page import="com.entities.*" %>
<%@page import ="org.hibernate.Transaction"%>
<%@page import ="com.helper.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
 <%@include file="navbar.jsp" %>
<div class="container-fluid">

<!--This is a form  -->

<form action="loginservlet">
  <div class="form-group">
    <label for="exampleInputEmail1">UserName</label>
    <input type="text" name="uname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
   </div>
   
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
  </div>
  
  
  <button type="submit" class="btn btn-primary">SignIn</button>
</form>
   </div>
   
</body>
</html>