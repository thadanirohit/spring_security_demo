<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head></head>
<body>
	
	<!-- To display invalid login message -->
	
	<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
		<font color="red"> Your login attempt was not successful due to
			<br />
		<br /> <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />.
		</font>

	</c:if>

	<!-- To display logout success message -->

	<c:if test="${param.logout != null}">
		<p>
			<font color="green"> You have been logged out. </font>
		</p>
	</c:if>

	<h1>Login</h1>
	
	<form name='f' action="login" method='POST'>
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>