package controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.DAO;
import dto.DTO;
@WebServlet("/fetch")
public class Controller implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String id=arg0.getParameter("id");
		String name=arg0.getParameter("name");
		
		DTO f=new DTO();
		int cid=Integer.parseInt(id);
		f.setId(cid);
		f.setName(name);
		System.out.println(f);
		arg1.getWriter().print(cid);
		arg1.getWriter().print(name);
		
		
		DAO dao=new DAO();
		dao.insert(f);
		
	
	}

}
