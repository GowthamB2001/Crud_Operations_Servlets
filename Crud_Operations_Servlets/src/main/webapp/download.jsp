<%@page import="dto.DTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<DTO> emps=(List<DTO>)request.getAttribute("objects"); %>
<table border="">
<tr>
<th>id</th>
<th>name</th>
</tr>
<%for(DTO uv:emps){ %>
<tr>
<td><%=uv.getId() %></td>
<td><%=uv.getName() %></td>
<td><a href="delete?id=<%=uv.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=uv.getId()%>&&name=<%=uv.getName()%>">edit</a>
</td>
</tr>
<%} %>
</table>
</body>
</html>