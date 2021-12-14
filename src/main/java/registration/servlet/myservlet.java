package registration.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.ReviewDao;
import registration.model.Reviews;

@WebServlet("/myservlet")
public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String String = null;
	
	private ReviewDao dao = new ReviewDao();
       
    public myservlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher Dispatcher = getServletContext().getRequestDispatcher("/reviews.jsp");
		Dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("review");
		int val = Integer.parseInt(request.getParameter("rating"));
		
		RequestDispatcher Dispatcher = getServletContext().getRequestDispatcher("/reviews.jsp");
		
		request.setAttribute("idea", a);
		request.setAttribute("value", val);
		Dispatcher.forward(request, response);
		
		Reviews re = new Reviews(val, a);
		re.setRating(val);
		re.setMessage(a);
		
		try {
			ReviewDao.register(re);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
