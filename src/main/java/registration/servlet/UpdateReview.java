package registration.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.updateReviewDao;
import registration.model.Customer;
import registration.model.Reviews;

@WebServlet("/UpdateReview")
public class UpdateReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateReview() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String id = request.getParameter("id1");
		String rate = request.getParameter("rate1");
		String feedback = request.getParameter("fdb1");
		
		int cusid = Customer.getCustomerID();
		
		try {
			boolean isSucess = updateReviewDao.updateReview(id, rate, feedback);
			
			List<Reviews> rev = updateReviewDao.getReviewData(cusid);
			request.setAttribute("reviewDetails", rev);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewReviews.jsp");
			dis.forward(request, response);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
