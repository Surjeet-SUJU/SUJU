<%@ page import = "com.studentmanagement.dao.*" %>
<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result Page</title>
 <link rel="stylesheet" href="css/resultcss.css" />
</head>
<body>

<div class="filter">
	<h1>Student Info</h1>
</div>
<table>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Gender</th>
		<th>Mobile Number</th>
		<th>Address</th>
		<th>Course</th>
	</tr>

	<%
	Connection connection = null;
	Statement st = null;
	ResultSet rs = null;
		try
	{
			ConnectionDb connectionDb = new ConnectionDb();
			connection = connectionDb.getConnection();
			st = connection.createStatement();
			
			String query = "select fname,lname,gender,mobile,address,course from studentmanage";
			rs = st.executeQuery(query);
			while(rs.next())
			{
				%>
				<tr>
					<td><%= rs.getString(1) %></td>
					<td><%= rs.getString(2) %></td>
					<td><%= rs.getString(3) %></td>
					<td><%= rs.getInt(4) %></td>
					<td><%= rs.getString(5) %></td>
					<td><%= rs.getString(6) %></td>
				</tr>
			<%}
	}
		catch(Exception e)
	{
			e.printStackTrace();
	}
		finally {
			try 
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(st!=null)
				{
					st.close();
				}
				if(connection!=null)
				{
					connection.close();
				}
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}	
		}
	%>
	</table>
</body>
</html>