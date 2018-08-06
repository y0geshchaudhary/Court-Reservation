<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Main Page</title>
<style>

 .menuHeader > th {
	font-size:20px;
	font-weight:700;
	padding:2px 5px;
	background-color:#1C76BC;
	color:#000;
	cursor:pointer;
	width:15%;
	height:10%;
	display:inline-table;
}
a
{
	color: #000;
	text-decoration: none;
}
</style>
</head>

<body bgcolor="#CCFF99">
<div>
  <table width="100%" align="left">
    <tr>
      <th><h1 align="left"><strong>HOTEL MGMT SYSTEM</strong></h1></th>
    </tr>
    <tr class="menuHeader">
      <th><a href="javascript:guestSubMenu();">Guest</a></th>
      <th><a href="javascript:roomsSubMenu();">Rooms</a></th>
      <th><a href="javascript:employeeSubMenu();">Employee</a></th>
      <th><a href="javascript:inventorySubMenu();">Inventory</a></th>
    </tr>
    <tr>
      <th>
      		<div id="HeaderSubMenu"></div>
      </th>
      <th colspan="3">&nbsp;</th>
    </tr>
  </table>
</div>
</body>
</html>
