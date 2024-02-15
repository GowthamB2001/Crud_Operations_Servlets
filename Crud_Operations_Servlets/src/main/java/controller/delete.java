package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.DAO;
import dto.DTO;
@WebServlet("/delete")
public class delete extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("id");
	int cid=Integer.parseInt(id);
	
	
	DAO dao=new DAO();
//	String ddao=dao.delete(cid);
//	res.getWriter().print(ddao);
	dao.delete(cid);
	List<DTO> list=dao.fetchalls();
	req.setAttribute("objects", list);
	
	
	RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	rd.forward(req, res);
	}

}
