<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page%>
    <% String message =(String)session.getAttribute("message"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)結果表示画面ページ</title>
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
<p><font color="#FF0000"><%= message %></font></p>
<p>TOPに戻るには「TOPへ」</p>
<a href="/docobluefantasy/index.jsp">TOPへ</a>
<hr>
<h5><font color="#0000CC">Copyright ドコウィズ攻略班 All Rights Reseved.</font></h5>
</div>
</body>
</html>