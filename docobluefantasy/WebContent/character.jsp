<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOCOBLE FANTASY(仮)キャラクターページ</title>
</head>
<body>
<header>
<center>
<input type="image" src="${pageContext.request.contextPath}/image/siteLogo/POPUTE.png" width="600" height="150">
</center>
</header>
<center><h2>キャラクター一覧</h2></center>
	<form action="/docobluefantasy/ContentsServlet" method="post">
		<center>
		<table border="1">
				<tr>
					<td width="230" height="230"><center><p>カタリナ</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=catalina"><input type="image" src="${pageContext.request.contextPath}/image/character/catalina.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>オイゲン</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=eugen"><input type="image" src="${pageContext.request.contextPath}/image/character/eugen.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>イオ</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName="io><input type="image" src="${pageContext.request.contextPath}/image/character/io&rosetta.png" width="180" height="150"></a></center></td>
</tr>
<tr>
					<td width="230" height="230"><center><p>ラカム</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=lakham"><input type="image" src="${pageContext.request.contextPath}/image/character/lakham.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>パーシヴァル</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=percival"><input type="image" src="${pageContext.request.contextPath}/image/character/percival.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>ナルメア</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=narumea"><input type="image" src="${pageContext.request.contextPath}/image/character/narumea.png" width="180" height="150"></a></center></td>
</tr>
					<td width="230" height="230"><center><p>ロゼッタ(リミテッド)</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName="limitedRosetta><input type="image" src="${pageContext.request.contextPath}/image/character/limitedrosetta.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>イオ(リミテッド)</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=limitedIo"><input type="image" src="${pageContext.request.contextPath}/image/character/limitedio.png" width="180" height="150"></a></center></td>
					<td width="230" height="230"><center><p>ランスロット</p> <hr><a href="/docobluefantasy/ContentsServlet?characterName=lancelot"><input type="image" src="${pageContext.request.contextPath}/image/character/lancelot.png" width="180" height="150"></a></center></td>
		</table>
		</center>
	</form>

</body>
</html>