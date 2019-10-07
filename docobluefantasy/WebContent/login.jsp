<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)ログインページ</title>
</head>
<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>
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

	<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>
</body>
</html>