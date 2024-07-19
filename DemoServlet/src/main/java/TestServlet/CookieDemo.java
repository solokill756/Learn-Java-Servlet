package TestServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Cookie1"})
public class CookieDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("Xin chao trung tam java");
		
		Cookie cookie = new Cookie("Name", "Thao");
		
		cookie.setMaxAge(5);
		
		resp.addCookie(cookie);
		
		Cookie cookie2 = new Cookie("Age", "18");
		
		cookie2.setMaxAge(5);
		
		resp.addCookie(cookie2);
		
	}
}
