<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Student Information</title>
</head>
<body>
	<jsp:useBean id= "student" scope = "request" class = "beans.Student"/>
	<jsp:setProperty name = "student" property = "*"/>
	<jsp:forward page="Display.jsp"></jsp:forward>
</body>
</html>