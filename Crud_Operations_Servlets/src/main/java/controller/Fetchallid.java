package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import dto.DTO;
@WebServlet("/fetchalls")
public class Fetchallid  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		DAO h=new DAO();
		List<DTO> k=h.fetchalls();
		resp.getWriter().print(k);
		
		
		req.setAttribute("objects", k);
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
		
	}

}
