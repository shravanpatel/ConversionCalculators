<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
<h1>Conversion Calculators</h1>
	<p>
		<label>ASCII Text:</label><br>
		<textarea rows="5" cols="50" style="resize: vertical;" readonly>${conversionResult.getAsciiText()}</textarea>
		<br> <label>Binary:</label><br>
		<textarea rows="5" cols="50" style="resize: vertical;" readonly>${conversionResult.getBinary()}</textarea>
		<br> <label>Hexadecimal:</label><br>
		<textarea rows="5" cols="50" style="resize: vertical;" readonly>${conversionResult.getHexadecimal()}</textarea>
		<br> <label>Decimal:</label><br>
		<textarea rows="5" cols="50" style="resize: vertical;" readonly>${conversionResult.getDecimal()}</textarea>
		<br>
	</p>
	<a href="index.jsp">Try using other converters</a>
</body>
</html>