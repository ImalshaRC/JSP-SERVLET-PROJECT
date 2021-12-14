package registration.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.CLoginDao;
import registration.model.Customer;

@WebServlet("/CustomerLogin")
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CustomerLogin() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("pass");
	
		try{
			List<Customer> rev = CLoginDao.getCustDetails(email, password);
			
			request.setAttribute("CusDetails", rev);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("/customerAccount.jsp");
		dis.forward(request, response);
		
	}


}
