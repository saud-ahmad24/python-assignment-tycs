/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.sql.DriverManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author srki-035
 */
public class auth extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                 
        try {
         String username, password;
            username = request.getParameter("username");
            password = request.getParameter("password");

        Connection con = null;
        String user="root";
        String password1 = "";
        String localhost = "jdbc:mysql://localhost:3310/Demo_95";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(localhost, user, password1);
        if(con != null){
           out.println("Database Connected Successfuly");
           PreparedStatement ps = con.prepareStatement("select username,password from userTable where username=? and password=?");
            ps.setString(1, username);
            ps.setString(2, password);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
                response.sendRedirect("index.html");
                return;
            }
              out.println("Some error");
//            response.sendRedirect("error.html");
              return;
        }else{
            out.println("Some error occured");
        }
        } catch (Exception ex) {
            out.print(ex.getMessage());
        }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
