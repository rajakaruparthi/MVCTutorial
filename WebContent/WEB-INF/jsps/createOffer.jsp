<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post"
		action="${pageContext.request.contextPath}/doCreate">
		<h3>Create Offer:</h3>
		<hr>

			<label for="name">Name:</label> 
			<input name="name" type="text" id="name"><br> 
			
			<label for="email">Email: </label> 
			<input name="email" id="email" type="text"><br> 
			
			<label for="offer">Offer: </label> 
			<input name="offer" type="text" id="offer"><br> 
			
			<input type="submit" name="submit" />
	</form>
</body>
</html>