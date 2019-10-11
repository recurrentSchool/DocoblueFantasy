<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.User"%>
<% User user = (User)session.getAttribute("user");%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)確認ページ</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<header>
<div align="center">
<input type="image" src="${pageContext.request.contextPath}/image/siteLogo/POPUTE.png" width="600" height="150">
</div>
</header>
<hr>
<div align="center">
<table>
<tr>
<th>名前は</th>
<td><%= user.getName()%></td>
</tr>
<tr>
	<th>パスワード</th>
	<td><%= user.getPass()%></td>
</tr>
<tr>
	<th>課金額</th>
	<td><%= user.getBilling()%></td>
</tr>
</table>
<form action="/docobluefantasy/RegisterServlet" method="GET">
<input type="submit" value="はい">

<p>
<div align="right">
<p>
	<a href="/docobluefantasy/register.jsp" >戻る</a>
</p>
</div>
</form>
<hr>


<h5><font color="#0000CC">Copyright ドコウィズ攻略班 All Rights Reseved.</font></h5>
</div>
</body>
</html>