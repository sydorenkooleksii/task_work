<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find by Name</title>
<style type="text/css">
body {
	float: left;
	background: rgba(102, 181, 255, 0.5);
	width: 99%;
	height: 97%;
}
table, th, td {

   border: 3px solid #ADFF2F;
   background-color: black;
   color: white;
}
B{
color: #9400D3;
font-size:30px;
}
#footer {
	height: 90%;
	width: 100%;
	text-align: center;
	align ="center";
}

.t{
    margin-left:auto; 
    margin-right:auto;
    width: 80%;
    }
    
    .button1 {
margin-top: 450px;
	font-size: 40px;
	background-color: #00FF00;
	color: blue;
	border: 5px solid #9400D3;
	text-align: center;
	align="center";
}
    </style>
</head>
<body>


<div id="footer">
<B> Список студентів</B>
<table class="t">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Date of Start</th>
</tr>

 <c:forEach var="findByName" items="${findname}">
<tr>
<td><c:out value="${findByName.idStudent}"/></td>
<td><c:out value="${findByName.firstName}"/></td>
<td><c:out value="${findByName.lastName}"/></td>
<td><c:out value="${findByName.dateOfStart}"/></td>
</tr>
 </c:forEach>
</table>


	

		<form action="/Base/" method="get">
			<input type="submit" value="Exit" class="button1">
		</form>




</div>



</body>
</html>