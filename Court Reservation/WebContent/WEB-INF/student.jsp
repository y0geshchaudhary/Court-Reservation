<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

</head>
<body>

<form:form commandName="student" action="./validate">

Name: <form:input path="name"/> <form:errors path="name"/><br/><br/>
Age: <form:input path="age"/> <form:errors path="age"/><br/><br/>
Email: <form:input path="email"/> <form:errors path="email"/><br/><br/>

<input type="submit" value="Submit">


</form:form>


</body>
</html>