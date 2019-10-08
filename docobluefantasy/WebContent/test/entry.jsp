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

<h1>追加できる要素は、[武器]、[キャラクター]、[ボス]から1つのみです。</h1>

<form action="/docobluefantasy/AdminFunctionServlet" method="post">
<input type="hidden" name="functionPage" value="entry">
<input type="hidden" name="pageMove" value="confirmation">
<details>
<summary>武器</summary>
<br>
　　名前　：<input type="text" name="weaponName">
<br>
　攻撃力　：<input type="text" name="weaponAttack">
<br>
　スキル　：<input type="text" name="weaponSkill">
<br>
<input type="submit" name="entry" value="確定">
</details>

<details>
<summary>キャラクター</summary>
<br>
　　名前　：<input type="text" name="characterName">
<br>
レアリティ：<select name="characterRarity">
    <option value="N">N</option>
    <option value="R">R</option>
    <option value="SR">SR</option>
    <option value="SSR">SSR</option>
	</select>
<br>
　攻撃力　：<input type="text" name="characterAttack">
<br>
　　HP　：<input type="text" name="characterHp">
<br>
　スキル　：<input type="text" name="characterSkill">
<br>
　　評価　：<select name="characterEvaluation">
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
<input type="submit" name="entry" value="確定">
</details>

<details>
<summary>ボス</summary>
<br>
　　名前　：<input type="text" name="bossName">
<br>
　攻撃力　：<input type="text" name="bossAttack">
<br>
　　HP　：<input type="text" name="bossHp">
<br>
　必殺技　：<input type="text" name="bossSpecialAttack">
<br>
<input type="submit" name="entry" value="確定">
</details>
<br>
<br>
</form>

<input type="button" onclick="location.href='/docobluefantasy/AdminFunctionServlet'"value="戻る">

<hr>
<p>Copyright ドコウィズ攻略班 All Rights Reseved.</p>
</div>

</body>

</html>