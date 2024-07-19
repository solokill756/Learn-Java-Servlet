package TestServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/getRep"})
public class getRequest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("test");
		
		String ten = req.getParameter("ten");
		String tuoi = req.getParameter("tuoi");
		
		printWriter.println("chao " + ten + " tuoi ban la : " + tuoi);
		
	}
}
