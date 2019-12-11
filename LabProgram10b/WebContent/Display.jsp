<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Student Information</title>
</head>
<body bgcolor = "cyan">
<jsp:useBean id="student" scope = "request" class="beans.Student"></jsp:useBean>
<b>
		Student Name: <jsp:getProperty  name= "student" property = "name"/></br>
		USN : <jsp:getProperty  name= "student" property = "usn"/></br>
		Total Marks : <jsp:getProperty  name= "student" property = "marks"/></br>
	</b>
</body>
</html>