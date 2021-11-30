<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>Id</th>
<th>City</th>
<th>Division</th>
<th>Office</th>
<th>Pincode</th>
<th>District</th>
<th>State</th>
</tr>
<c:forEach var="pincode" items="${pincode }">
<tr>
<td>${pincode.id }</td>
<td>${pincode.city }</td>
<td>${pincode.division }</td>
<td>${pincode.office }</td>
<td>${pincode.pincode }</td>
<td>${pincode.district }</td>
<td>${pincode.state }</td>
</tr>
</c:forEach>
</table>

</body>
</html>