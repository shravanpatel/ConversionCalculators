<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hexadecimal Converter</title>
</head>
<body>
	<h1>Hexadecimal Converter</h1>
	<form action="convertHexadecimalServlet" method="post">
		<label for="hexadecimalCode">Hexadecimal code(include space):</label><br>
		<textarea id="hexadecimalCode" name="hexadecimalCode"
			placeholder="Input hexadecimal code..." rows="5" cols="50"
			style="resize: vertical;"></textarea>
		<br> <input type="submit" value="Convert Hexadecimal">
	</form>
	<p><a href="ascii.jsp">ASCII Text converter</a></p>
	<p><a href="binary.jsp">Binary converter</a></p>
</body>
</html>