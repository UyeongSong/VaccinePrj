<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>KOSAVAC</title>
</head>
	<body>
			<table border="1">
		<tr>
			<th>�̸�</th>
			<td>${patient.name}</td>
		</tr>
		<tr>
			<th>�������</th>
			<td>${patient.birthDate}</td>
		</tr>	
		<tr>
			<th>��ȭ��ȣ</th>
			<td>${patient.phoneNum}</td>
		</tr>	
		<tr>
			<th>����</th>
			<td>${patient.gender}</td>
		</tr>	
		<tr>
			<th>��Ʈ�ѹ�</th>
			<td>${patient.rotNum}</td>
		</tr>	
		<tr>
			<th>1�� ����</th>
			<td>${patient.firstDose}</td>
		</tr>	
		<tr>
			<th>2�� ����</th>
			<td>${patient.secondDose}</td>
		</tr>	
	</table>
</body>
</html>