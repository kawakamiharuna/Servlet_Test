<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% 
String name = request.getParameter("name");
String company = request.getParameter("company");
String mail = request.getParameter("mail");
String info = request.getParameter("info");
String mag = request.getParameter("magazin");
String tool = request.getParameter("tool");

%>

<p>お名前「<%=name %>」様</p>
<p>会社名「<%=company %>」
<p>メールアドレス「<%=mail %>」
<p>お問い合わせ内容「<%=info %>」
<p>メルマガの種類
    	「<%= mag %>」</p>
<p>資料請求「しない」
<p>上記の内容で受けつけました。</p>




</body>
</html>