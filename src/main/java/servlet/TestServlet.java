package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.TemplatesHtml;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String title = "Data";
		
		Date date = new Date();
		
		out.println(TemplatesHtml.head(title)+	         
            	TemplatesHtml.menu()+
            	"<div class=\"container\">\r\n" + 
				"		<div class=\"row\">"+
			    "<img src=\"la-hora_.jpg\" class=\"img-responsive\">" + 
				"<h1 align=\" center \">Display Current Date & Time</h1>" +	
				"<h1 align=\" center \">"+ date +"</h1>" +	
				"</div>\r\n" + 
				"	</div>"+
	               TemplatesHtml.footer()
			);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      
	      response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String title = "Result";
	      
	      out.println(TemplatesHtml.head(title)+	         
	            	TemplatesHtml.menu()+
	            	"<div class=\"container\">\r\n" + 
					"		<div class=\"row\">"+
					"<h1 align = \"center\">Metodo POST para leer Datos</h1>\n" +
					"<h2>Hola Bienvenido: </h2>\n" +
					"<h2>Tus Datos son: </h2>\n" +
	                  "  <b>Nombre </b>: " + 
					request.getParameter("first_name") + "\n" +
	                  "  <li><b>Apellido </b>: "
	                  + request.getParameter("last_name") + "\n" +
	               "</ul>\n" +
	               "</div>\r\n" + 
					"	</div>"+
	               TemplatesHtml.footer()
	      );
		
	}
	
	
}
