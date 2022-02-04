<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Trainer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update trainer info</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
		
		<div align="center">
		
		<c:if test="${trainer != null}">
		<form action="update" method="post">
		</c:if>
  
  <input type="hidden"  name="id" value="<%= ((Trainer) request.getAttribute("trainer")).getId() %>"><br>
  
  <label for="lname" class="my-2 fw-bold">First name:</label><br>
  <input type="text"  name="Fname" value="<%= ((Trainer) request.getAttribute("trainer")).getFname() %>"><br>
  
   <label for="lname" class="my-2 fw-bold">Last name:</label><br>
  <input type="text"  name="Lname" value="<%= ((Trainer) request.getAttribute("trainer")).getLname() %>"><br>
  
   <label for="lname" class="my-2 fw-bold">Email:</label><br>
  <input type="text"  name="email"  value="<%= ((Trainer) request.getAttribute("trainer")).getEmial() %>" ><br>
  
   <label for="lname" class="my-2 fw-bold">phone namber:</label><br>
  <input type="text"  name="phone" value="<%= ((Trainer) request.getAttribute("trainer")).getPhone() %>"><br>
  
  <input type="submit" value="Save"  class="btn btn-success mt-3"/>
  
</form>

</div>

</body>
</html>