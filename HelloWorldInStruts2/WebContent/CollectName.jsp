<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>take the name from user</title>
</head>
<body>
	<h3>Enter your name</h3>
	<s:form action="Hello">
		<s:textfield name="name" label="userName" />
		<s:submit />
	</s:form>
</body>
</html>