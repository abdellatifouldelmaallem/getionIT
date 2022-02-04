<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

 <div align="center">
 <h1>Login Form</h1>
  <% if(request.getAttribute("empty") != null) { %>
    <p style="color: red;">
     <%=request.getAttribute("empty") %>
    </p>
   <% } %>
   <% if(request.getAttribute("wrong") != null) { %>
    <p style="color: green;">
     <%=request.getAttribute("wrong") %>
    </p>
   <% } %>
   
   <div class="container">
   <form action="<%=request.getContextPath()%>/login" method="post">

    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" name="email" placeholder="entre your email here">
  
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" placeholder="entre your Password" name="password">
  
  <button type="submit" class="btn btn-primary mt-3">Submit</button>
</form>
</div>
  
 </div>
</body>
</html>