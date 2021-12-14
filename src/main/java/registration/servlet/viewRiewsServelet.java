package registration.servlet;

import java.util.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.retriewReviewDao;
import registration.model.Customer;
import registration.model.Reviews;

@WebServlet("/viewRiewsServelet")
public class viewRiewsServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection conn = null;
	private static Statement stmt =null;
       
    public viewRiewsServelet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String cusid = request.getParameter("cusid");
		
		try{
			List<Reviews> rev = retriewReviewDao.getReviewDetails(cusid);
			
			request.setAttribute("reviewDetails", rev);
			//request.setAttribute("custID", cusid);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("/viewReviews.jsp");
		dis.forward(request, response);
		
	}

}
