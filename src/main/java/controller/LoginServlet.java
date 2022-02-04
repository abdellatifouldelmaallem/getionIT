package controller;

import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import daoAdmin.iDaoAdmin;
import daoAdmin.implDaoAdmin;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 try {
			 String email = request.getParameter("email");
		        String password = request.getParameter("password");
		        
		        if(email.length()>0 && password.length()>0) {
		        	iDaoAdmin loginDao = new implDaoAdmin();
		        	boolean checked = loginDao.validate(email, password);
		        	if (checked) {
		        		  System.out.println("the admin has been logged successfully");
		        		 RequestDispatcher dispatcher = request.getRequestDispatcher("TrainerServlet.java");
		        	        dispatcher.forward(request, response);
		        	        
                 } else {
                	 String wrong =  "email or password  not correct , try again";
                     
                	 request.setAttribute("wrong", wrong);
                	 RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	        	        dispatcher.forward(request, response);
	        	        
                 	 throw new Exception("Login not successful..");
                 }
		        }else {
		        	
		        	String empty =  "please entre your email and password first :)";
		        	  request.setAttribute("empty",empty);
		        	  
		        	  RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	        	        dispatcher.forward(request, response);
	        	        
		        }
		        
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
		
	}
	
	
	
	

}
