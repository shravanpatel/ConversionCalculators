<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ASCII Text Converter</title>
</head>
<body>
	<h1>ASCII Text Converter</h1>
	<form action="convertAsciiTextServlet" method="post">
		<label for="asciiText">ASCII Text:</label><br>
		<textarea id="asciiText" name="asciiText"
			placeholder="Input some text..." rows="5" cols="50"
			style="resize: vertical;"></textarea>
		<br> <input type="submit" value="Convert">
	</form>
	<p><a href="binary.jsp">Binary converter</a></p>
	<p><a href="hexadecimal.jsp">Hexadecimal converter</a></p>
</body>
</html>