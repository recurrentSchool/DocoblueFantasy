<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Weapon"%>
<%@	page import="bean.Character"%>
<%@ page import="bean.Boss"%>
<%
	Weapon weapon = (Weapon) request.getAttribute("weapon");
	Character character = (Character) request.getAttribute("character");
	Boss boss = (Boss) request.getAttribute("boss");
%>
<!DOCTYPE html>
<html>


<head>


<meta charset="UTF-8">
<title>確認画面</title>


</head>


<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>



この内容で間違いありませんか？

<input type="button" onclick="location.href='/docobluefantasy/WebContent/WEB-INF/admin.jsp'"value="キャンセル">

<hr>
<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>
</body>


</html>