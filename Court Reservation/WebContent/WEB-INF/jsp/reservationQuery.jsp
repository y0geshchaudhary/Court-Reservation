<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>

<title>Reservation Query</title>
</head>
<body>
<form method="post">
Court Name
<input type="text" name="courtName" >
<input type="Submit" value="Search">
</form>

<table>
<tr>
	<th>Court Name</th>
	<th>Date</th>
	<th>Hour</th>
	<th>Player</th>
</tr>
<c:forEach items="${reservations}" var="reservation">
<tr>
	<th>${reservation.courtName}</th>
	<th>${reservation.date}</th>
	<th>${reservation.hour}</th>
	<th>${reservation.player.name}</th>

</tr>
</c:forEach>

</table>

</body>
</html>