<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Weapon"%>
<%@ page import="java.util.List"%>
<%
	Weapon weapon = (Weapon) session.getAttribute("weapon");
	List<Weapon> listWeapon = (List<Weapon>) request.getAttribute("listWeapon");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ガチャ結果</title>
</head>
<body>

<p><%= listWeapon.get(0).getName() %></p>
<p><%= listWeapon.get(0).getAttack() %></p>
<p><%= listWeapon.get(0).getSkill() %></p>

</body>
</html>