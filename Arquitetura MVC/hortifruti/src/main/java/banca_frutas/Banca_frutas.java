package banca_frutas;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.*;
import java.io.*;

public class Banca_frutas extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
		String c = request.getParameter("color");
		Modelo_retorna_frutas f = new Modelo_retorna_frutas();
		List resultado = f.getFrutas(c);
		
		
		request.setAttribute("estilos", resultado);
		RequestDispatcher view = request.getRequestDispatcher("Resultado.jsp");
		view.forward(request, response);
			
	}
		
}
