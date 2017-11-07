package br.com.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioServlet
 */
@WebServlet("/FormularioServlet")
public class FormularioServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String matricula = request.getParameter("matricula");
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String sexo = request.getParameter("sexo");
		
		out.println("<html lang=\"pt\">\r\n" + 
				"<head>\r\n" + 
				"	<meta charset=\"UTF-8\">\r\n" + 
				"	<title>Servlet</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<h1>Resumo Cadastro</h1>\r\n" + 
				"\r\n" + 
				"	Matricula: "+ matricula +" <br/>\r\n" + 
				"	Nome: "+ nome +" <br/>\r\n" + 
				"	Idade: "+ idade +" <br/>\r\n" + 
				"	Sexo: "+ sexo +" <br/>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");

		
		if(Integer.parseInt(idade) >= 18 && sexo.equals("masculino")) {
			out.println("Você precisa servir ao exército");
		}else if (Integer.parseInt(idade) < 18 && sexo.equals("masculino")) {
			out.println("Você está ok com as obrigações militares");
		}else {
			out.println("Você não precisa servir ao exército");
		}
	}

}
