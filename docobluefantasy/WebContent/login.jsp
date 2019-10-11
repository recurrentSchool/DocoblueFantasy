<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page%>
    <% String message =(String)request.getAttribute("message"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)ログインページ</title>
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
	<form action="/docobluefantasy/LoginServlet" method="POST">
		<table>
			<tr>
				<th>名前</th>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<th>パスワード</th>
				<td><input type="password" name="pass" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="ログイン"></td>
			</tr>
		</table>
	</form>
<hr>

<h5><font color="#0000CC">Copyright ドコウィズ攻略班 All Rights Reseved.</font></h5>
</div>
</body>
</html>