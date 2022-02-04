<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
    
<%@page import="model.Trainer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show all trainers</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
  <center>
  <h1>Admin Management</h1>
        <h2>
         <a href="new">Add New Trainer</a>
        </h2>
 </center>
    <div align="center">
        <table border="1" cellpadding="5">
            
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Phone Namber</th>
                <th>Action</th>
            </tr>
             <%ArrayList<Trainer> t = 
            (ArrayList<Trainer>)request.getAttribute("listTrainer");
        for(Trainer s:t){%>
       
                <tr>
                    <td><%=s.getId()%></td>
                    <td><%=s.getFname()%></td>
                    <td><%=s.getLname()%></td>
                    <td><%=s.getEmial()%></td>
                    <td><%=s.getPhone()%></td>
                    <td>
                     <a href="edit?id=<%=s.getId()%>" class="btn btn-success">Edit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?id=<%=s.getId()%>" class="btn btn-danger">Delete</a>                     
                    </td>
                </tr>
            <%}%>
        </table>
    </div> 
</body>
</html>