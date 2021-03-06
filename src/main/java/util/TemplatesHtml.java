package util;

public class TemplatesHtml {

	public static String head(String title) {
		
		String str =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " +
		         "transitional//en\">\n"
		        +"<html>\n" +
				        "<head><title>" + title + "</title></head>\n" +
				        "<!-- Bootstrap -->\r\n" + 
				        "<link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" >" +	            	      
				        "<body>\n";
		return str;
	}
	
	public static String menu() {		
		String strMenu= "<nav class=\"navbar navbar-default\">\r\n" + 
		"	<div class=\"container-fluid\">\r\n" + 
		"		<!-- Brand and toggle get grouped for better mobile display -->\r\n" + 
		"		<div class=\"navbar-header\">\r\n" + 
		"			<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n" + 
		"				data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\r\n" + 
		"				aria-expanded=\"false\">\r\n" + 
		"				<span class=\"sr-only\">Toggle navigation</span> <span\r\n" + 
		"					class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n" + 
		"					class=\"icon-bar\"></span>\r\n" + 
		"			</button>\r\n" + 
		"			<a class=\"navbar-brand\" href=\"/\">App Engine</a>\r\n" + 
		"		</div>\r\n" + 
		"\r\n" + 
		"		<!-- Collect the nav links, forms, and other content for toggling -->\r\n" + 
		"		<div class=\"collapse navbar-collapse\"\r\n" + 
		"			id=\"bs-example-navbar-collapse-1\">\r\n" + 
		"			<ul class=\"nav navbar-nav\">\r\n" + 
		"				<li><a href=\"/\">Home</a></li>\r\n" +
		"				<li><a href=\"/testservlet?test=1\">Get</a></li>\r\n" +
		"				<li><a href=\"/form.html\">Formulario</a></li>\r\n" + 
		"				<li><a href=\"/getadmins\">Admins</a></li>\r\n" + 
		"				<li><a href=\"/calculator.html\">Calculator</a></li>\r\n" +
		"			</ul>\r\n" + 
		"		</div>\r\n" + 
		"		<!-- /.navbar-collapse -->\r\n" + 
		"	</div>\r\n" + 
		"	<!-- /.container-fluid --> </nav>";		
		return strMenu;		
	}

	public static String footer() {
		String str = "<script type=\"text/javascript\" src=\"jquery/jquery-3.2.1.min.js\"></script>\r\n" + 
	               "	<script src=\"bootstrap/js/bootstrap.min.js\"></script>"   +               
	            "</body>"+
	         "</html>";
		return str;
	}
	
	
	
	
}
