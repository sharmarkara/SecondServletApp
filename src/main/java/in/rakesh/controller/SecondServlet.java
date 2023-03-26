package in.rakesh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/test")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("Servlet loading......");
	}

	public SecondServlet() {
		System.out.println("Servlet instatiation.....");
	}
	
	

	@Override
	public void init() throws ServletException {
		//super.init();
		ServletConfig config=getServletConfig();
		System.out.println("Config object available:: "+config);
	}



	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. Set the response type
		response.setContentType("text/html");

		// 2. Getting the PrintWriter object to send the response
		PrintWriter out = response.getWriter();

		// 3. Stting the html page to write the response
		out.println("<html><head><title>Output</title></head>");
		out.println("<body");
		out.println("<h1>Getting the response for GET request type</h1>");
		out.println("</body");
		out.println("</html>");

		// 4. close the rsponse object
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. Set the response type
		response.setContentType("text/html");

		// 2. Getting the PrintWriter object to send the response
		PrintWriter out = response.getWriter();

		// 3. Stting the html page to write the response
		out.println("<html><head><title>Output</title></head>");
		out.println("<body");
		out.println("<h1>Getting the response for GET request type</h1>");
		out.println("</body");
		out.println("</html>");

		// 4. close the rsponse object
		out.close();
	}

}
