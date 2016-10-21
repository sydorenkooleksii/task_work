<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students</title>
<style type="text/css">
body {
	float: left;
	background: rgba(102, 181, 255, 0.5);
	width: 100%;
	height: 100%;
}

#footer {
	height: 90%;
	width: 100%;
	text-align: center;
	align ="center";
}
.button1 {
margin-top:250px;
	font-size: 40px;
	background-color: white;
	color: blue;
	border: 3px solid yellow;
}




table, th, td {
   border: 3px solid blue;
   background-color: white;
   color: #4CAF50;
}

.t{
    margin-left:auto; 
    margin-right:auto;
    width: 50%;
    }

</style>
</head>

<body>

<div id="footer">
			
<B>Student</B>
<table class="t">
<tr>
<td>${find.idStudent}</td>
<td>${find.firstName}</td>
<td>${find.lastName}</td>
<td>${find.dateOfStart}</td>
</tr>
</table>
<div>
<form action="/Base/" method="get">
<input type="submit" value="Exit" class="button1">
</form>
</div>	
<div>

</body>
</html>
