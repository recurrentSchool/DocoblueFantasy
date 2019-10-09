<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.User"%>
<% User user = (User) session.getAttribute("user");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)確認ページ</title>
</head>
<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>

<p>名前は<%= user.getName()%>でよろしいですか？</p>

<form action="/docobluefantasy/RegisterServlet" method="GET">
<input type="submit" value="はい">

<p>
<div align="right">
<p>
	<a href="/docobluefantasy/registar.jsp" >戻る</a>
</p>
</div>
</form>
<hr>

	<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>

</body>
</html>