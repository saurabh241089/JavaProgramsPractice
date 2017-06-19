<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 Example</title>
</head>
<body>
<h3>Login Form</h3>
<FONT color="blue">
User Name="UserName" and password="password"
</FONT>
<form:form action="shapeform.html"  commandName="shapeForm" method="GET">
	<table>
		<tr>
			<td>Height:<FONT color="red"><form:errors
				path="height" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="height"/></td>
		</tr>	
		<tr>
			<td>Label:<FONT color="red"><form:errors
				path="label" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="label" type="text" name="label" value="HI"/></td>
		</tr>
		<tr>
			<td>Row:<FONT color="red"><form:errors
				path="row" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="row" type="number" name="row" min="1" max="50"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
		<!-- 
		
				<tr>
			<td>User Name:<FONT color="red"><form:errors
				path="userName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userName" /></td>
		</tr>

		<tr>
			<td>Password:<FONT color="red"><form:errors
				path="password" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="password" /></td>
		</tr>

		<tr>
			<td>Confirm Password:<FONT color="red"><form:errors
				path="confirmPassword" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="confirmPassword" /></td>
		</tr>

		<tr>
			<td>Email:<FONT color="red"><form:errors path="email" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
		
		 -->
		
		
	</table>
</form:form>
</body>
</html>