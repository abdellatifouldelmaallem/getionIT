<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@page import="model.Trainer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save trainer</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

 <center>
  <h1>Admin Management</h1>
        <h2>
         <a href="list">List of All Trainers</a>
         
        </h2>
 </center>
   <div align="center">
   
       <c:if test="${trainer == null}">
      <form action="insert" method="post">
       </c:if>
  
  <input type="hidden" id="fname" name="id" value=""><br>
  
  <label for="fname">First name:</label><br>
  <input type="text" id="lname" name="Fname" value=""><br>
  
   <label for="lname">Last name:</label><br>
  <input type="text" id="lname" name="Lname" value=""><br>
  
   <label for="email">Email:</label><br>
  <input type="text" id="lname" name="email" value=""><br>
  
   <label for="phone namber">phone namber:</label><br>
  <input type="text" id="lname" name="phone" value=""><br>
  
   <input type="submit" value="Save" class="btn btn-success mt-3"/>
  
</form>
</div>
</body>
</html>