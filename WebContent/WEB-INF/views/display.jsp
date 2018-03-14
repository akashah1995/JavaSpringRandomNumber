<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Great Number Game</title>
<style>
	.red{
	background-color:red;
	width:120px;
	height:120px;
	text-align:center;
	padding-top:25px;
	}
	
	.green{
	background-color:green;
	width:120px;
	height:120px;
	text-align:center;
	vertical-align:middle;
	padding-top:25px;
	}

</style>
</head>
<body>
	<h1> Welcome to the Great Number Game! </h1>
	<h2>I am thinking of a number between 1 and 100</h2>
	<h2>Take a guess!</h2>
	<div class = "${sessionScope.Color}">
		<h2> ${sessionScope.Closeness} </h2>
	</div>
	<form action = '/GreatNumberGame/Submit' method = 'POST'>
		<input type = "text" name = "guess">
		<input type = "submit"  value = "submit">
	</form>
	<form action = '/GreatNumberGame/Reset' method = 'POST'>
		<input type = "submit" value = "reset">
	</form>
</body>
</html>