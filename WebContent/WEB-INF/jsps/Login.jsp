<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="rlogin">
		<table>
			<tr>
						<th>User Name:</th>
						<td><input type="text" name="userName" required></td>
					</tr>
					<tr>
						<th>Password:</th>
					<td><input type="text" name="password" requied></td>
				</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Login"></td>
		</tr>
		</table>
</form>
</body>
</html>