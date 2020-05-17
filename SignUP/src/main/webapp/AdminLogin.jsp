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
    <div class="container-fluid">
    <%@include file="navbar.jsp" %>
<!--This is a form  -->

<form action="AdminLoginServlet">
  <div class="form-group">
    <label for="exampleInputEmail1">UserName</label>
    <input type="text" name="uname2" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
   </div>
   
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password3" class="form-control" id="exampleInputPassword1">
  </div>
  
  
  <button type="submit" class="btn btn-primary">SignIn</button>
</form>
   </div>
   




</div>
</body>
</html>