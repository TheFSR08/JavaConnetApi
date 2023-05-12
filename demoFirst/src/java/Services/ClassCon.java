/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Services;

import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author THE FSR
 */public class ClassCon{
 
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 String connectionURL = "jdbc:sqlserver://FSR\\MSSQLSERVER08;1433;databaseName=JavaApi;";
 Connection con = DriverManager.getConnection(connectionURL);
 System.out.println("Nos Conectamos");
 }
