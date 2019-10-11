<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>docowith.jp</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<header>
<div align="center">
<input type="image" src="${pageContext.request.contextPath}/image/siteLogo/POPUTE.png" width="600" height="150" >
</div>

</header>
<hr>

<div align="center">
<div class="example">
<div class="example1">

<script type="text/javascript">


   var imglist = new Array(
      "/docobluefantasy/image/backGround/bg_18.jpg",
      "/docobluefantasy/image/backGround/bg_22.jpg",
      "/docobluefantasy/image/backGround/bg_24.jpg",
      "/docobluefantasy/image/backGround/bg_25.jpg",
      "/docobluefantasy/image/backGround/bg_4.jpg",
      "/docobluefantasy/image/backGround/bg_7.jpg",
      "/docobluefantasy/image/backGround/bg_9.jpg",
      "/docobluefantasy/image/backGround/bg_1.jpg",
      "/docobluefantasy/image/backGround/bg_13.jpg",
      "/docobluefantasy/image/backGround/bg_15.jpg",
      "/docobluefantasy/image/backGround/bg_16.jpg",
   	  "/docobluefantasy/image/backGround/bg_19.jpg",
   	  "/docobluefantasy/image/backGround/bg_2.jpg",
   	  "/docobluefantasy/image/backGround/bg_21.jpg",
   	  "/docobluefantasy/image/backGround/bg_23.jpg",
   	  "/docobluefantasy/image/backGround/bg_32.jpg",
   	  "/docobluefantasy/image/backGround/bg_34.jpg",
   	  "/docobluefantasy/image/backGround/bg_36.jpg",
   	  "/docobluefantasy/image/backGround/bg_38.jpg",
   	  "/docobluefantasy/image/backGround/bg_59.jpg",
   	  "/docobluefantasy/image/backGround/bg_61.jpg",
   	  "/docobluefantasy/image/backGround/bg_64.jpg",
   	  "/docobluefantasy/image/backGround/bg_65.jpg");

   var selectnum = Math.floor(Math.random() * imglist.length);
   var output = "<img src=" + imglist[selectnum] + " width='200'/>";
</script>

<table border="1" width="300">
<tr>
<td>
<script>
document.write(output);
</script>
</td>
</tr>
</table>

<a href="/docobluefantasy/registar.jsp">会員登録</a>
</div>
<a href="/docobluefantasy/login.jsp">ログイン</a>
</div>
	<hr>

<h5><font color="#0000CC">Copyright ドコウィズ攻略班 All Rights Reseved.</font></h5>
</div>
</body>
</html>