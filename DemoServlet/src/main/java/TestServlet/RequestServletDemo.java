package TestServlet;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/test-request"})
public class RequestServletDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Phuong thuc cua request" + req.getMethod());
		req.getContentType();
		req.getContextPath();
		System.out.println(req.getServerName());
		System.out.println(req.getServletPath());
		
		Enumeration<String> keys = req.getHeaderNames();
		while(keys.hasMoreElements()) {
			String keyString = keys.nextElement();
			System.out.println(keyString + " : " + req.getHeader(keyString));
		}
	}
}
