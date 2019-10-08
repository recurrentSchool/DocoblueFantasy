<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bean.Weapon"%>
<%@	page import="bean.Character"%>
<%@ page import="bean.Boss"%>
<%
	String functionPage = (String) session.getAttribute("functionPage");

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

		<!-- entry武器情報 -->
		<% if(weapon.getName() != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<table border="1">
				<tr>
					<th>武器名</th>
				<td><%=weapon.getName()%><input type="hidden" name="weaponName" value=<%=weapon.getName()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=weapon.getAttack()%><input type="hidden" name="weaponAttack" value=<%=weapon.getAttack()%>></td>
				</tr>
				<tr>
					<th>スキル名</th>
					<td><%=weapon.getSkill()%><input type="hidden" name="weaponSkill" value=<%=weapon.getSkill()%>></td>
				</tr>
			</table>
			<input type="submit" value="実行">
		</form>
		<% } %>



		<input type="button"
			onclick="location.href='/docobluefantasy/WebContent/WEB-INF/admin.jsp'"
			value="キャンセル">

		<hr>
		<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
	</div>
</body>


</html>



<input type="button" onclick="location.href='/docobluefantasy/WebContent/test/admin.jsp'"value="戻る">
</body>
</html>