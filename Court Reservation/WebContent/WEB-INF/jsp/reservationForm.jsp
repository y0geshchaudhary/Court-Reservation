<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservastion Form</title>
<style type="text/css">
	.error
	{
		color:red;
		font-weight:bold;
	}
</style>
</head>
<body>
<h1>Reservation From</h1>



<form:form method="post" modelAttribute="reservation">
<form:errors cssClass="error" path="*"/>
<table>
	<tr>
		<td>Court Name:</td>
		<td><form:input path="courtName"/></td>
		<td><form:errors cssClass="error" path="courtName"/></td>
	</tr>
	<tr>
		<td>Sport Type:</td>
		<td>
		<form:select path="sportType" ><%-- items="${sportTypes}" itemValue="id" itemLabel="name" /> --%>
		<form:option value="0">Select One</form:option>
		<form:options items="${sportTypes}" itemValue="id" itemLabel="name"/>
		</form:select>
		 </td>
		<td><form:errors path="sportType" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Player Name:</td>
		<td><form:input path="player.name"/></td>
		<td><form:errors path="player.name" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Phone no:</td>
		<td><form:input path="player.phone"/></td>
		<td><form:errors path="player.phone" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Date:</td>
		<td><form:input path="date"/></td>
		<td><form:errors path="date" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Hours:</td>
		<td><form:input path="hour"/></td>
		<td><form:errors path="hour" cssClass="error"/></td>
	</tr>
	<tr>
	<td colspan="3"><input type="Submit" value="Submit Form"/></td>
	</tr>

</table>
</form:form>
</body>
</html>