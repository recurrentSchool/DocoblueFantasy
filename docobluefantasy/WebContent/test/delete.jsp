<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>


<head>

<meta charset="UTF-8">
<title>情報削除画面</title>

</head>


<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>
<form action="/docobluefantasy/AdminFunctionServlet" method="post">

削除する項目名を入力してください
<br>
<input type="text" name="delete_name">
<br>
<input type="submit"  name="delete" value="確定">
<br>
<br>
<br>
<input type="button" onclick="location.href='/docobluefantasy/WebContent/WEB-INF/admin.jsp'"value="戻る">

</form>
<hr>
<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>
</body>


</html>