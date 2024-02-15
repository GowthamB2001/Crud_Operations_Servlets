package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import dto.DTO;
@WebServlet("/update")
public class update extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	System.out.println(id+name);
	
	
	DTO e=new DTO();
	int cid=Integer.parseInt(id);
	e.setId(cid);
	e.setName(name);
	
	DAO dao=new DAO();
	dao.updateAll(e);
}
}
