package registration.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import registration.dao.CustomerRegisterDao;
import registration.model.Customer;

@WebServlet("/customerSignUP")
public class customerSignUP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String String = null;
       

    public customerSignUP() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String nic = request.getParameter("nic");
		String pnum = request.getParameter("pnum");
		String email = request.getParameter("email");
		String lnum = request.getParameter("lnum");
		String pass = request.getParameter("password");
		
		Customer cus = new Customer(fname,lname,nic,pnum,email,lnum,pass);
		
		CustomerRegisterDao.insert(cus);
		
		RequestDispatcher dis = request.getRequestDispatcher("/mainSignIn.jsp");
		dis.forward(request, response);
		
	}
		
	}

