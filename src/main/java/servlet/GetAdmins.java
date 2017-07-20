package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Admin;
import model.DBAdmin;

@SuppressWarnings("serial")
public class GetAdmins extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String title = "Admin";
		
		Date date = new Date();
		
		 String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " +
		         "transitional//en\">\n";
		 
		 DBAdmin dbhelper = new DBAdmin();
		 Set<Admin> listAdmin = dbhelper.findAllAdmin();
		 StringBuilder builder = new StringBuilder();
		 		 
		 for(Admin admin: listAdmin){			 
			 String rows = "<tr> "
						+ "<td colspan=\"2\" style=\"font-weight:bold;\">" 
						+ admin.getName()
						+ "</td>"
						+ "</tr>";
			 builder.append(rows);			 
		 }
		 
		 out.println(docType +
		         "<html>\n" +
		            "<head><title>" + title + "</title></head>\n" +
		            "<body bgcolor = \"#f0f0f0\">\n"            
					+"<h1>" + title +"</h1>"           
		            + "<table> "
					+ "<tr>  "
					+ "<th colspan=\"2\" style=\"font-weight:bold;\"></th> "       
					+ "</tr>"
					+ builder.toString()
					+ "</table>"
		         + "</body>"+
		         "</html>"
		      );
		 
	}

	
	
}
