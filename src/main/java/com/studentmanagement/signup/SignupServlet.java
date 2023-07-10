package com.studentmanagement.signup;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentmanagement.dao.ConnectionDb;

/**
 * Servlet implementation class SignupServlet
 */
@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studFirstName = request.getParameter("fname");
		String studLastName = request.getParameter("lname");
		String studGender = request.getParameter("gender");
		String studMobileNumber = request.getParameter("mobileno");
		String studAddress = request.getParameter("address");
		String studCourse = request.getParameter("courses");
		String studEmail = request.getParameter("email");
		String studPassword = request.getParameter("password");
		
		RequestDispatcher dispatcher = null;
		
		Connection connection = null;
		
		ConnectionDb connectionDb = new ConnectionDb();
		connection = connectionDb.getConnection();
		 try 
			{
			 	PreparedStatement preparedStatement = connection.prepareStatement("insert into studentmanage(fname,lname,gender,mobile,address,course,email,password) values(?,?,?,?,?,?,?,?);");
				preparedStatement.setString(1, studFirstName);
				preparedStatement.setString(2, studLastName);
				preparedStatement.setString(3, studGender);
				preparedStatement.setString(4, studMobileNumber);
				preparedStatement.setString(5, studAddress);
				preparedStatement.setString(6, studCourse);
				preparedStatement.setString(7, studEmail);
				preparedStatement.setString(8, studPassword);
				
				
				int rowCount  = preparedStatement.executeUpdate();
				
				dispatcher = request.getRequestDispatcher("signup.jsp");
				if(rowCount > 0)
				{
					request.setAttribute("status", "success");
				}
				else 
				{
					request.setAttribute("status", "failed");
				}
				dispatcher.forward(request, response);
			}
			catch (Exception e) 
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
