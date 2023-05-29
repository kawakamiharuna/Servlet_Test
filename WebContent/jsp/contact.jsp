<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="../servlet/contact" method="post">
<p>氏名(必須)</p>
<input type="text" name="name">

<p>会社</p>
<input type="text" name="company">

<p>メールアドレス(必須)</p>
<input type="email" name="mail">

<p>お問い合わせ内容(必須)</p>
<input type="textarea" name="info">

<p>メルマガ種類</p>
<input type="checkbox" name="magazin" value="総合案内">総合案内
<input type="checkbox" name="magazin" value="セミナー案内">セミナー案内
<input type="checkbox" name="magazin" value="求人採用情報">求人採用情報

<p>資料請求希望</p>
<input type="radio" name="tool" value="1"checked>Yes
<input type="radio" name="tool" value="2">No

<p><input type="submit" value="送信"></p>

</form>

</body>
</html>