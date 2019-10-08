%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page%>
    <% String message =(String)session.getAttribute("message"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)結果表示画面ページ</title>
</head>
<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>
<p><font color="#FF0000"><%= message %></font></p>
<p>TOPに戻るには「TOPへ」</p>
<a href="/docobluefantasy/index.jsp">TOPへ</a>
<hr>
<h6><font color="#9999FF">Copyright ドコウィズ攻略班 All Rights Reseved.</font></h6>
</div>
</body>
</html>