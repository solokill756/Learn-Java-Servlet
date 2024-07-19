package TestServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/Cookie2"})
public class CookieDemo2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Cookie[] cookies = req.getCookies();
		PrintWriter printWriter = resp.getWriter();
		for(Cookie cookie : cookies) {
			printWriter.println(cookie.getName() +  " + " + cookie.getValue());
		}
	}
}
