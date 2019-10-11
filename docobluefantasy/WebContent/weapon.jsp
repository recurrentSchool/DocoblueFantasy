<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)武器ページ</title>
</head>
<body>
<header>
<center>
<input type="image" src="${pageContext.request.contextPath}/image/siteLogo/POPUTE.png" width="600" height="150">
</center>
</header>
<center><h2>武器一覧</h2></center>
	<form action="/docobluefantasy/ContentsServlet" method="post">
		<center>
		<table border="1">
				<tr>
					<td width="230" height="230"><center><p>ブルースフィア</p> <hr><a href="/docobluefantasy/ContentsServlet?weaponName=blueSphere"><input type="image" src="${pageContext.request.contextPath}/image/weapon/BlueSphere.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>D.ビィ</p> <hr><a href="/docobluefantasy/ContentsServlet?weaponName=dragonBarV"><input type="image" src="${pageContext.request.contextPath}/image/weapon/DragonBarV.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>イクサバ</p> <hr><a href="/docobluefantasy/ContentsServlet?weaponName=Ixaba"><input type="image" src="${pageContext.request.contextPath}/image/weapon/Ixaba.png" width="180" height="150"></a></center></td>
</tr>
					<td width="230" height="230"><center><p>エターナル・ラヴ</p> <hr><a href="/docobluefantasy/ContentsServlet?weaponName=loveEternal"><input type="image" src="${pageContext.request.contextPath}/image/weapon/LoveEternal.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>シュバリエソード・マグナ</p> <hr><a href="/docobluefantasy/ContentsServlet?weaponName=luminieraSwordOmega"><input type="image" src="${pageContext.request.contextPath}/image/weapon/LuminieraSwordOmega.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>ニーベルン・ホルン</p> <hr><a href="/docobluefantasy/ContentsServlet?weaponName=nibelnHorn"><input type="image" src="${pageContext.request.contextPath}/image/weapon/NibelungHorn.png" width="180" height="150"></a></center></td>
		</table>
		</center>
	</form>

</body>
</html>