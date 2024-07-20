package DemoSession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/Session2"})
public class Session2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		String nameString = "";
		
		HttpSession httpSession = req.getSession();
		
		Object object = httpSession.getAttribute("name");
		
		nameString = String.valueOf(object);
		
		int age = (Integer) httpSession.getAttribute("age");
		
		printWriter.print(nameString + " + " + age);
	}
}
