package ua.ep.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.ep.dao.DaoFactory;
import ua.ep.dao.StudentDao;
import ua.ep.entities.Student;

/**
 * Servlet implementation class FundByName
 */
public class FindByName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindByName() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text / html;charset=UTF-8");
	
		try(PrintWriter out = response.getWriter()){
			String name = request.getParameter("name");
	        List<Student> result = new OldController().doStudentsWithSameFirstNameAndLastName(name);
	        
	        if(result.isEmpty()){
	        	getServletContext().getRequestDispatcher("/wrongId.jsp").forward(request, response);
	        	
	        }else{
	        	request.setAttribute("findname", result);
				getServletContext().getRequestDispatcher("/findName.jsp").forward(request, response);
	        }
	        
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
