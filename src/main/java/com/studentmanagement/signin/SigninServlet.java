package com.studentmanagement.signin;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.studentmanagement.dao.ConnectionDb;

/**
 * Servlet implementation class SigninServlet
 */
@WebServlet("/signin")
public class SigninServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentEmailString = request.getParameter("email");
		String studentPasswordString = request.getParameter("password");
		HttpSession session = request.getSession();
		RequestDispatcher requestDispatcher = null;
		
		Connection connection = null;
		ResultSet rs = null;
		ConnectionDb connectionDb = new ConnectionDb();
		connection = connectionDb.getConnection();
		
		try 
		{
			PreparedStatement preparedStatement = connection.prepareStatement("select * from studentmanage where email = ? and password = ?");
			preparedStatement.setString(1, studentEmailString);
			preparedStatement.setString(2, studentPasswordString);
			
			rs =  preparedStatement.executeQuery();
			if(rs.next())
			{
				session.setAttribute("name", rs.getString("fname"));
				requestDispatcher = request.getRequestDispatcher("result.jsp");
			}
			else {
				request.setAttribute("status", "failed");
				requestDispatcher = request.getRequestDispatcher("signin.jsp");
			}
			requestDispatcher.forward(request, response);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		finally {
			try 
			{
				if(connection!=null)
				{
					connection.close();
				}
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}	
		}
	}

}
