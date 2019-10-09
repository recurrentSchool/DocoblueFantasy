<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.Weapon"%>
<%@	page import="bean.BattleCharacter"%>
<%@ page import="bean.Boss"%>
<%
	String functionPage = (String) session.getAttribute("functionPage");

	Weapon weapon = (Weapon) request.getAttribute("weapon");
	BattleCharacter character = (BattleCharacter) request.getAttribute("character");
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
		<p>この内容で間違いありませんか？</p>

		<!-- delete武器情報 -->
		<% if(weapon != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<input type="hidden" name="functionPage" value="delete">
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

		<!-- deleteキャラクター情報 -->
		<% if(character != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<input type="hidden" name="functionPage" value="delete">
			<table border="1">
				<tr>
					<th>キャラクター名</th>
				<td><%=character.getName()%><input type="hidden" name="characterName" value=<%=character.getName()%>></td>
				</tr>
				<tr>
					<th>レアリティ</th>
					<td><%=character.getRarity()%><input type="hidden" name="characterRarity" value=<%=character.getRarity()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=character.getAttack()%><input type="hidden" name="characterAttack" value=<%=character.getAttack()%>></td>
				</tr>
				<tr>
					<th>HP</th>
					<td><%=character.getHp()%><input type="hidden" name="characterHp" value=<%=character.getHp()%>></td>
				</tr>
				<tr>
					<th>スキル</th>
					<td><%=character.getSkill()%><input type="hidden" name="characterSkill" value=<%=character.getSkill()%>></td>
				</tr>
				<tr>
					<th>評価</th>
					<td><%=character.getEvaluation()%><input type="hidden" name="characterEvaluation" value=<%=character.getEvaluation()%>></td>
				</tr>
			</table>
			<input type="submit" value="実行">
		</form>
		<% } %>

		<!-- deleteボス情報 -->
		<% if(boss != null) {%>
		<form action="/docobluefantasy/AdminFunctionServlet" method="post">
			<input type="hidden" name="pageMove" value="executeFunction">
			<input type="hidden" name="functionPage" value="delete">
			<table border="1">
				<tr>
					<th>ボス名</th>
				<td><%=boss.getName()%><input type="hidden" name="bossName" value=<%=boss.getName()%>></td>
				</tr>
				<tr>
					<th>攻撃力</th>
					<td><%=boss.getAttack()%><input type="hidden" name="bossAttack" value=<%=boss.getAttack()%>></td>
				</tr>
				<tr>
					<th>HP</th>
					<td><%=boss.getHp()%><input type="hidden" name="bossHp" value=<%=boss.getHp()%>></td>
				</tr>
				<tr>
					<th>必殺技</th>
					<td><%=boss.getSpecialAttack()%><input type="hidden" name="bossSkill" value=<%=boss.getSpecialAttack()%>></td>
				</tr>
			</table>
			<input type="submit" value="実行">
		</form>
		<% } %>

		<input type="button"
			onclick="location.href='/docobluefantasy/AdminFunctionServlet'"
			value="キャンセル">

<input type="button" onclick="location.href='/docobluefantasy/WebContent/test/admin.jsp'"value="戻る">
</div>
</body>
</html>