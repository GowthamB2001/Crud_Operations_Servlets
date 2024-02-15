<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
		<table>
			<div>
				<tr>Enter id:</tr>
				<input type="number" name="id"> value="<%=request.getParameter("id") %>" readonly="readonly"<br>
				<tr>
					Enter name:
					<input type="text" name="name"> value="<%=request.getParameter("name") %>" readonly="readonly"
				</tr>
                      <br>

			</div>
		</table>


<button type="submit">SUBMIT</button>


	</form>
</body>
</html>