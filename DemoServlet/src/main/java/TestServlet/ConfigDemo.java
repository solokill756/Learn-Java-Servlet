package TestServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/test-config"} , initParams = {@WebInitParam(name = "name" , value = "trung tam java")})
public class ConfigDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nameString = super.getServletConfig().getInitParameter("name");
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("xin chao" + nameString);
	}
}
