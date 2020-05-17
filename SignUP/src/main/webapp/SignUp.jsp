<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp page</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
 <%@include file="navbar.jsp" %>
<div class="container-fluid">
    
    
    <!--This is a form  -->
    <form action="SaveSignUpServlet" method="post">
  <div class="form-group">
  <h1>Register Here</h1>
    <label for="title">Enter your Full Name:</label>
    <input required type="text"
    name="firstname" 
    class="form-control" 
    id="exampleInputEmail1" 
    aria-describedby="emailHelp"/>
  </div>
  <div class="form-group">
    <label for="title1">Enter your user Name:</label>
    <input required type="text" 
    name="username"
    class="form-control" 
    id="exampleInputEmail1" 
    aria-describedby="emailHelp"/>
  </div>
  
  <div class="form-group">
    <label for="exampleInputPassword1">Create Password</label>
    <input required  type="password"
    name="password" 
    class="form-control" 
    id="exampleInputPassword1">
  </div>
  
  

  <button type="submit" class="btn btn-primary">Register</button>
</form>
    
    </div>
    
    
    <a href="SignIn.jsp">Click if already registered</a>
</body>
</html>