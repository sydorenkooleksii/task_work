package ua.ep.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ua.ep.entities.Student;
import ua.ep.services.StudentsService;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private static final Logger log = Logger.getLogger(Servlet.class);
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text / html;charset=UTF-8");

		try{
			
			int id = Integer.parseInt((request.getParameter("id")));

					Student result = StudentsService.getInstance().find(id);
					request.setAttribute("find", result);
					getServletContext().getRequestDispatcher("/findId.jsp").forward(request, response);	       
			
		}catch(Exception ex){
            // logging
        	log.error("Something wrong in id", ex);
        	getServletContext().getRequestDispatcher("/wrongId.jsp").forward(request, response);
//            throw new RuntimeException( ex );  
        }	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
