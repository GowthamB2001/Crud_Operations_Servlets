package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.DAO;
@WebServlet("/fetchall")
public class Fetchall extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("id");
	int fid=Integer.parseInt(id);
		
	DAO fdao=new DAO();
	Object f3=fdao.fetchall(fid);
	res.getWriter().print(f3);
			
	}

}
