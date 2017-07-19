package com.poo.testapp.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String title = "Display Current Date & Time";
		
		Date date = new Date();
		
		out.println(
				"<html>\n"+
				"<head><title>"				
				+  title + "</head></title>" + 
				"<body bgcolor=\"f0f0f0\">\n" 
				+ "<table>"
				+ "<tr> "
				+ "<td colspan=\"2\" style=\"font-weight:bold;\">Menu:</td> "       
				+ "</tr>"
			    + "<tr>" 
			    + "<td><a href=\" / \">Inicio</a></td>"
			    + "</tr>"
			    + "<tr>"
			    + " <td><a href=\"/hello\">The servlet</a></td>"
			    + "  </tr>"
			    + "  <tr>"
			    + "    <td><a href='/form.html'>Formulario</a></td>"
			    + "  </tr>"
			    + "</table>"
			    +"<img src=\"entity-lifecycle.png\">" + 
				"<h1 align=\" center \">"+ title +"</h1>" +	
				"<h1 align=\" center \">"+ date +"</h1>" +	
				"</body>" + 
				"</html>"
				);
		System.out.print("Ejecutando");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set response content type
	      response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Using GET Method to Read Form Data";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " +
	         "transitional//en\">\n";
	         
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n"            
					+ "<table> "
					+ "<tr>  "
					+ "<td colspan=\"2\" style=\"font-weight:bold;\">Menu:</td> "       
					+ "</tr>"
					+ "<tr>" 
					+ "<td><a href=\" / \">Inicio</a></td>"
					+ "</tr>"
					+ "<tr>"
					+ " <td><a href=\"/hello\">The servlet</a></td>"
					+ "  </tr>"
					+ "  <tr>"
					+ "    <td><a href='/form.html'>Formulario</a></td>"
					+ "  </tr>"
					+ "</table>"
					+"<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li><b>Nombre </b>: "
	                  + request.getParameter("first_name") + "\n" +
	                  "  <li><b>Apellido </b>: "
	                  + request.getParameter("last_name") + "\n" +
	               "</ul>\n" +
	            "</body>"+
	         "</html>"
	      );
		
	}

	
	
	
	
	
}
