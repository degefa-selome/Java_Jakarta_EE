<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Horloge</title>
</head>
<body>
  <h1>Bienvenue il est <%= request.getAttribute("hour") %> heure </h1>
</body>
</html>