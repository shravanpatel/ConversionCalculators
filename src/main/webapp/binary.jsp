<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Binary Converter</title>
</head>
<body>
	<h1>Binary Converter</h1>
	<form action="convertBinaryServlet" method="post">
		<label for="binaryCode">Binary code(include space):</label><br>
		<textarea id="binaryCode" name="binaryCode"
			placeholder="Input binary code..." rows="5" cols="50"
			style="resize: vertical;"></textarea>
		<br> <input type="submit" value="Convert Binary">
	</form>
	<p><a href="ascii.jsp">ASCII Text converter</a></p>
	<p><a href="hexadecimal.jsp">Hexadecimal converter</a></p>
</body>
</html>