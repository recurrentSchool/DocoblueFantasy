<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)管理者ページ</title>
</head>
<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>

	<%
		if (message != null) {
	%>
		<p> <%= message %> </p>
	<%
		}
	%>
<!-- 本番用
<input type="button" onclick="location.href='/docobluefantasy/WEB-INF/entry.jsp'"value="情報登録">
<br>
<input type="button" onclick="location.href='/docobluefantasy/WEB-INF/delete.jsp'"value="情報削除">
<br>
<input type="button" onclick="location.href='/docobluefantasy/WEB-INF/update.jsp'"value="情報更新">
 -->

<input type="button" onclick="location.href='/docobluefantasy/test/entry.jsp'"value="情報登録">
<br>
<input type="button" onclick="location.href='/docobluefantasy/test/delete.jsp'"value="情報削除">
<br>
<input type="button" onclick="location.href='/docobluefantasy/test/update.jsp'"value="情報更新">

<br>
<a href="/docobluefantasy/login.jsp">戻る</a>

<hr>
	<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>
</body>
</html>