<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KOSAVAC</title>
</head>
<body>
<h1>접종자 정보 조회</h1>
<form action= "./Info/${name}" method="post">
<table border="1">
<tr>
	<th>접종자 이름</th>
	<td><input type="text" name="name"/></td>
</tr>
<tr>
	<th>생년월일</th>
	<td><input type="date" name="birthDate"/></td>
</tr>
</table>
	<input type="submit" value="조회"/>	
</form>	
</body>
</html>