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
import util.TemplatesHtml;

@SuppressWarnings("serial")
public class GetAdmins extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		String title = "Admin";

		Date date = new Date();

		DBAdmin dbhelper = new DBAdmin();
		Set<Admin> listAdmin = dbhelper.findAllAdmin();
		StringBuilder builder = new StringBuilder();

		for (Admin admin : listAdmin) {
			String rows = "<tr> " +
						"<td colspan=\"2\" style=\"font-weight:bold;\">" 
							+ admin.getName() +
						"</td>"	+ 
						"</tr>";
			builder.append(rows);
		}

		out.println(TemplatesHtml.head(title) + 
				TemplatesHtml.menu() + 
				"<div class=\"container\">\r\n" + 
				"		<div class=\"row\">"+
				"		<h1>" + title + "</h1>" + 
				"<h2>" + date +"</h2>" + 
				"<table class=\"table\"> " + 
				"<tr>  " + 
				"<th colspan=\"2\" style=\"font-weight:bold;\"></th> " + 
				"</tr>"+
				"</div>\r\n" + 
				"	</div>"+
				builder.toString() + "</table>" + TemplatesHtml.footer()
				
			);

	}

}
