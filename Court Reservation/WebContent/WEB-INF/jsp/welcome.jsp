<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- <%@ taglib uri="www.springframework.org/tags" prefix="spring" %> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<title>Welcome</title>
<style type="text/css">

	a{color:Green;}

</style>

</head>
<body>
<h1>Welcome to Court Reservation System</h1>
<%-- <h2><spring:message code="welcome.message" text=":)"/></h2> --%>
<a href="reservationQuery">Get Courts</a><br/>
<a href="reservationForm">Reservestion NOW</a>

<spring:message code="hello" text="yo"/>
<a href="mailto:${mail}">${mail}</a>
<a href="#"><spring:message code="admin.email" text="mail To Admin"/> </a>

<%-- Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd"/> --%>

</body>
</html>