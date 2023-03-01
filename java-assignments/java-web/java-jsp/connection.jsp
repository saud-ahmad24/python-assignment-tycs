<%-- 
    Document   : connection
    Created on : 9 Feb, 2023, 9:41:16 AM
    Author     : srki-035
--%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%--<%@page import="com.mysql.jdbc.Connection"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table {
                broder: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
    <%
    try {
        Connection con = null;
        String user="root";
        String password = "";
        String localhost = "jdbc:mysql://localhost:3310/Demo_95";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(localhost, user, password);
        if(con != null){
           out.println("Database Connected Successfuly");
           Statement st=con.createStatement();
           ResultSet rs = st.executeQuery("select * from dataTable");
           out.print("<table border='4'>");
           while(rs.next()){
                out.print("<tr><td>");
                out.print(rs.getInt(1));
                out.print("</td>");
                out.print("<td>");
                out.print(rs.getString(2));
                out.print("</td></tr>");
        }
           out.print("</table>");
          
            con.close();
        }else{
            out.println("Some error occured");
        }
    } catch (Exception ex) {
        // handle the error
    }
    %>
</html>
