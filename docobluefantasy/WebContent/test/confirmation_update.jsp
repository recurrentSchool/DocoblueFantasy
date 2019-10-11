<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Weapon"%>
<%@	page import="bean.BattleCharacter"%>
<%@ page import="bean.Boss"%>
<%
	String functionPage = (String) session.getAttribute("functionPage");

	Weapon weaponOriginal = (Weapon) request.getAttribute("weaponOriginal");
	BattleCharacter characterOriginal = (BattleCharacter) request.getAttribute("characterOriginal");
	Boss bossOriginal = (Boss) request.getAttribute("bossOriginal");

	Weapon weaponUpdate= (Weapon) request.getAttribute("weaponUpdate");
	BattleCharacter characterUpdate = (BattleCharacter) request.getAttribute("characterUpdate");
	Boss bossUpdate = (Boss) request.getAttribute("bossUpdate");
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

		<p>この内容で上書きしますか？</p>

		<!-- update武器情報 -->
		<% if(weaponOriginal != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<input type="hidden" name="functionPage" value="update">

			<h3>武器情報</h3>
			<table border="1">
				<tr>
					<th>武器名</th>
				<td><%=weaponOriginal.getName()%><input type="hidden" name="weaponOriginalName" value=<%=weaponOriginal.getName()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=weaponOriginal.getAttack()%></td>
				</tr>
				<tr>
					<th>スキル名</th>
					<td><%=weaponOriginal.getSkill()%></td>
				</tr>
			</table>

			<h3>上書き内容</h3>
			<table border="1">
				<tr>
					<th>武器名</th>
				<td><%=weaponUpdate.getName()%><input type="hidden" name="weaponUpdateName" value=<%=weaponUpdate.getName()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=weaponUpdate.getAttack()%><input type="hidden" name="weaponUpdateAttack" value=<%=weaponUpdate.getAttack()%>></td>
				</tr>
				<tr>
					<th>スキル名</th>
					<td><%=weaponUpdate.getSkill()%><input type="hidden" name="weaponUpdateSkill" value=<%=weaponUpdate.getSkill()%>></td>
				</tr>
			</table>
			<input type="submit" value="実行">
		</form>
		<% } %>

		<!-- updateキャラクター情報 -->
		<% if(characterOriginal != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<input type="hidden" name="functionPage" value="update">

			<h3>キャラクター情報</h3>
			<table border="1">
			<tr>
					<th>キャラクター名</th>
				<td><%=characterOriginal.getName()%><input type="hidden" name="characterOriginalName" value=<%=characterOriginal.getName()%>></td>
				</tr>
				<tr>
					<th>レアリティ</th>
					<td><%=characterOriginal.getRarity()%></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=characterOriginal.getAttack()%></td>
				</tr>
				<tr>
					<th>HP</th>
					<td><%=characterOriginal.getHp()%></td>
				</tr>
				<tr>
					<th>スキル</th>
					<td><%=characterOriginal.getSkill()%></td>
				</tr>
				<tr>
					<th>評価</th>
					<td><%=characterOriginal.getEvaluation()%></td>
				</tr>
			</table>

			<h3>上書き内容</h3>
			<table border="1">
				<tr>
					<th>キャラクター名</th>
				<td><%=characterUpdate.getName()%><input type="hidden" name="characterUpdateName" value=<%=characterUpdate.getName()%>></td>
				</tr>
				<tr>
					<th>レアリティ</th>
					<td><%=characterUpdate.getRarity()%><input type="hidden" name="characterUpdateRarity" value=<%=characterUpdate.getRarity()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=characterUpdate.getAttack()%><input type="hidden" name="characterUpdateAttack" value=<%=characterUpdate.getAttack()%>></td>
				</tr>
				<tr>
					<th>HP</th>
					<td><%=characterUpdate.getHp()%><input type="hidden" name="characterUpdateHp" value=<%=characterUpdate.getHp()%>></td>
				</tr>
				<tr>
					<th>スキル</th>
					<td><%=characterUpdate.getSkill()%><input type="hidden" name="characterUpdateSkill" value=<%=characterUpdate.getSkill()%>></td>
				</tr>
				<tr>
					<th>評価</th>
					<td><%=characterUpdate.getEvaluation()%><input type="hidden" name="characterUpdateEvaluation" value=<%=characterUpdate.getEvaluation()%>></td>
				</tr>
			</table>
			<input type="submit" value="実行">
		</form>
		<% } %>

		<!-- updateボス情報 -->
		<% if(bossOriginal != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<input type="hidden" name="functionPage" value="update">

			<h3>ボス情報</h3>
			<table border="1">
				<tr>
					<th>ボス名</th>
				<td><%=bossOriginal.getName()%><input type="hidden" name="bossOriginalName" value=<%=bossOriginal.getName()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=bossOriginal.getAttack()%></td>
				</tr>
				<tr>
					<th>HP</th>
					<td><%=bossOriginal.getHp()%></td>
				</tr>
				<tr>
					<th>必殺技</th>
					<td><%=bossOriginal.getSpecialAttack()%></td>
				</tr>
			</table>

			<h3>上書き内容</h3>
			<table border="1">
				<tr>
					<th>ボス名</th>
				<td><%=bossUpdate.getName()%><input type="hidden" name="bossUpdateName" value=<%=bossUpdate.getName()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=bossUpdate.getAttack()%><input type="hidden" name="bossUpdateAttack" value=<%=bossUpdate.getAttack()%>></td>
				</tr>
				<tr>
					<th>HP</th>
					<td><%=bossUpdate.getHp()%><input type="hidden" name="bossUpdateHp" value=<%=bossUpdate.getHp()%>></td>
				</tr>
				<tr>
					<th>必殺技</th>
					<td><%=bossUpdate.getSpecialAttack()%><input type="hidden" name="bossUpdateSpecialAttack" value=<%=bossUpdate.getSpecialAttack()%>></td>
				</tr>
			</table>
			<input type="submit" value="実行">
		</form>
		<% } %>

		<input type="button"
			onclick="location.href='/docobluefantasy/AdminFunctionServlet'"
			value="キャンセル">

		<hr>
		<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
	</div>

<input type="button" onclick="location.href='/docobluefantasy/AdminFunctionServlet'"value="戻る">

</body>
</html>