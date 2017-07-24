package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CalculatorComputo;
import util.TemplatesHtml;

@SuppressWarnings("serial")
public class Calculator extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		double num1 = Double.valueOf(request.getParameter("numero1"));
		
		double num2 = Double.valueOf(request.getParameter("numero2"));
		
		String opc = request.getParameter("opcion");
		
		PrintWriter out = response.getWriter();
		String title = "Result";
		
		
		StringBuilder res = new StringBuilder();
		
		if(opc.equals("add")) {
			res.append(String.valueOf(CalculatorComputo.add(num1, num2)));
		}else if(opc.equals("res")){
			res.append(String.valueOf(CalculatorComputo.rem(num1, num2)));
		}else if(opc.equals("mul")) {
			res.append(String.valueOf(CalculatorComputo.mul(num1, num2)));
		}else if(opc.equals("div")) {
			if(num2==0) {
				res.append("No se puede dividir entre 0");
			}else{
				res.append(String.valueOf(CalculatorComputo.div(num1, num2)));
			}
		}else if(opc.equals("fib")) {
			int[] resFib=CalculatorComputo.fibonacci((int) num1);
			for(int i=0; i<=resFib.length;i++)
				res.append(" " + resFib[i]);			
		}
		
		
		out.print(TemplatesHtml.head(title)+	         
            	TemplatesHtml.menu());
        out.println("<div class=\"container\">\r\n" + 
				"		<div class=\"row\">"+
				"<h1 align = \"center\">Resultado de calculo</h1>\n" +
				"<h3>El resultado es: "+
				res+
				"</h3>"+
				"</div>\r\n" + 
				"	</div>");
		out.println(TemplatesHtml.footer());
        
	}
	
	
}
