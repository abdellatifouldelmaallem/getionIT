	package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoTrainer.DAOtrainer;
import daoTrainer.DAOtrainerImp;
import model.Trainer;


@WebServlet("/")
public class TrainerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DAOtrainer trainerDAO = new DAOtrainerImp();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String action = request.getServletPath();

	        try {
	            switch (action) {
	            
		            case "/new":
	                    showNewForm(request, response);
	                    break;
	                case "/insert":
	                    insertTrainer(request, response);
	                    break;
	                case "/delete":
	                    deleteTrainer(request, response);
	                    break;
	                case "/edit":
	                    showEditForm(request, response);
	                    break;
	                case "/update":
	                    updateTrainer(request, response);
	                    break;
	                default :
	                    listTrainer(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
		
	}

	
	
	
	   private void listTrainer(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException, ServletException {
			        List < Trainer > listTrainer = trainerDAO.getAllTrainer();
			        request.setAttribute("listTrainer", listTrainer);
			        for(Trainer s:listTrainer) {
			        	System.out.println(s);
			        }
			        RequestDispatcher dispatcher = request.getRequestDispatcher("trainers.jsp");
			        dispatcher.forward(request, response);
			    }
	   
	   private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        RequestDispatcher dispatcher = request.getRequestDispatcher("AddForm.jsp");
			        dispatcher.forward(request, response);
			    }
	   
	   private void insertTrainer(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
				   String Fname = request.getParameter("Fname");
			        String Lname = request.getParameter("Lname");
			        String email = request.getParameter("email");
			        Integer phone = Integer.parseInt(request.getParameter("phone"));
	        
			        Trainer trainer = new Trainer( Fname,Lname, email, phone);
			        trainerDAO.saveTrainer(trainer);
			        response.sendRedirect("list");
			    }
	   
	   private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, ServletException, IOException {
		           Long id = Long.parseLong(request.getParameter("id"));
			        Trainer existingTrainer = trainerDAO.getTrainer(id);
			        request.setAttribute("trainer", existingTrainer);
			        RequestDispatcher dispatcher = request.getRequestDispatcher("EditForm.jsp");
			        dispatcher.forward(request, response);

			    }
	   
	   private void updateTrainer(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
			        Long id = Long.parseLong(request.getParameter("id"));
			        String Fname = request.getParameter("Fname");
			        String Lname = request.getParameter("Lname");
			        String email = request.getParameter("email");
			        Integer phone = Integer.parseInt(request.getParameter("phone"));

			        Trainer trainer = new Trainer(id,Fname,Lname,email,phone);
			        trainerDAO.updateTrainer(trainer);
			        response.sendRedirect("list");
			    }
	   
	  
	   
	   private void deleteTrainer(HttpServletRequest request, HttpServletResponse response)
			    throws SQLException, IOException {
		            Long id = Long.parseLong(request.getParameter("id"));
			        trainerDAO.deleteTrainer(id);
			        response.sendRedirect("list");
			    }

}
