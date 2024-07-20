package DemoSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/Session1"})
public class Session1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		httpSession.setAttribute("name", "thao");
		httpSession.setAttribute("age", 20);
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		
		printWriter.print("get session success");
		
		
		
	}
}
