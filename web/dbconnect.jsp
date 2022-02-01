<%@ page import="java.io.*" %>
<%@ page import="java.sql.*" %>
<%
Statement stmt = null;
Connection con=null;
try
{
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/deduplication1","root","root");
	stmt=con.createStatement();
}
catch(Exception ex)
{
	out.println("there's a problem "+ex);
}	
%>