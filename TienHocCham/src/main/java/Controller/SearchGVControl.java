package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Database.JDBCUtil;

/**
 * Servlet implementation class SearchGVControl
 */
@WebServlet("/SearchGVControl")
public class SearchGVControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGVControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request, 
    		  HttpServletResponse response)
    		  throws ServletException,IOException{
    		  response.setContentType("text/html");
    		  PrintWriter out = response.getWriter();

    		  

    		  
    		  try {
    		  Connection conn = JDBCUtil.getConnection();
    		  System.out.println("Connected to the database");
    		  String  idGiangvien  = request.getParameter("IDGiangvien");

    		  ArrayList al=null;
    		  ArrayList emp_list =new ArrayList();
    		  String sql = "SELECT * FROM GIANGVIEN where IDGiangVien= ?";
    		  System.out.println("query " + sql);
    		  PreparedStatement pst = conn.prepareStatement(sql);
    		  pst.setString(1, idGiangvien);
    		  ResultSet  rs = pst.executeQuery();


    		  while(rs.next()){
    		  al  = new ArrayList();
    		  
    		  al.add(rs.getString(1));
    		  al.add(rs.getString(2));
    		  al.add(rs.getString(3));
    		  
    		  System.out.println("al :: "+al);
    		  emp_list.add(al);
    		  }

    		  request.setAttribute("empList",emp_list);
    		  
    		 System.out.println("empList " + emp_list);

    		  // out.println("emp_list " + emp_list);

    		  String nextJSP = "/viewSearch.jsp";
    		  RequestDispatcher dispatcher = 
    		   getServletContext().getRequestDispatcher(nextJSP);
    		  dispatcher.forward(request,response);
    		  conn.close();
    		  System.out.println("Disconnected from database");
    		  } catch (Exception e) {
    		  e.printStackTrace();
    		  }
    		  }
    		}