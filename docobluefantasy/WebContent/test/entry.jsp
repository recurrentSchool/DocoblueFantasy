<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">
<title>情報登録画面</title>
</head>

<body>
<div align="center">
<h1>DOCOBLUEFANTASY攻略</h1>
<hr>

	<form action="/docobluefantasy/AdminFunctionServlet" method="post">
<p>
武器
<br>
　　名前　：<input type="text" name="wapon_name">
<br>
　攻撃力　：<input type="text" name="wapon_attack">
<br>
　スキル　：<input type="text" name="wapon_skill">
<br>
<input type="submit" value="確定">
</p>

<p>
キャラクター
<br>
　　名前　：<input type="text" name="character_name">
<br>
レアリティ：<select name="character_rarity">
    <option value="N">N</option>
    <option value="R">R</option>
    <option value="SR">SR</option>
    <option value="SSR">SSR</option>
	</select>
<br>
　攻撃力　：<input type="text" name="character_attack">
<br>
　　HP　：<input type="text" name="character_hp">
<br>
　スキル　：<input type="text" name="character_skill">
<br>
　　評価　：<select name="character_evaluation">
    <option value="0">0</option>
    <option value="10">10</option>
    <option value="20">20</option>
    <option value="30">30</option>
    <option value="40">40</option>
    <option value="50">50</option>
    <option value="60">60</option>
    <option value="70">70</option>
    <option value="80">80</option>
    <option value="90">90</option>
    <option value="100">100</option>
    </select>
<br>
<input type="submit" value="確定">
</p>

<p>
ボス
<br>
　　名前　：<input type="text" name="boss_name">
<br>
　攻撃力　：<input type="text" name="boss_attack">
<br>
　　HP　：<input type="text" name="boss_hp">
<br>
　必殺技　：<input type="text" name="boss_specialattack">
<br>
<input type="submit" value="確定">
</p>

</form>

<hr>
<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>

</body>

</html>