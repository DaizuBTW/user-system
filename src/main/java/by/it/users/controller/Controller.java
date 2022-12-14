package by.it.users.controller;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import by.it.users.Account;
import by.it.users.bean.User;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		RequestDispatcher requestDispatcher = null;
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if(request.getParameter("command").equals("authorization")) {
			if (Account.checkUser(login)) {
				if (Account.getPassword(login).equals(password)) {
					Account.currentUser = Account.userList.get(login);
					requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
				} else {
					requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
				}
			} else {
				requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			}
		} else {
			if (!Account.checkUser(login)) {
				String name = request.getParameter("name");
				User user = new User(login, password, name);
				Account.userList.put(login, user);
				requestDispatcher = request.getRequestDispatcher("/index.jsp");
			} else {
				requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			}
		}
		
		
		
		request.setAttribute("user", Account.currentUser);
		requestDispatcher.forward(request, response);
		

	}

}
