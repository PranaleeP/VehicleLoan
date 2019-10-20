<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table,h1{
text-align:center;
padding :10px;
margin: auto;
}
th{
float:left;
}
</style>
</head>
<body>

	<h1>New Registration</h1>
<!-- 		<a href="home">Back</a>
 -->	
 <form action="register">
	<table>
	<tr>
			<th>User Name:</th>
			<td><input type="text" name="userName"></td>
		</tr>
		<tr>
			<th>First Name:</th>
			<td><input type="text" name="firstName"></td>
		</tr>
		<tr>
			<th>Last Name:</th>
			<td><input type="text" name="lastName"></td>
		</tr>
		<tr>
			<th>Phone Number:</th>
			<td><input type="text" name="phoneNo" pattern="[789]{1}[0-9]{9}"></td>
		</tr>
		<tr>
			<th>Email:</th>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<th>Password:</th>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<th>Security Question:</th>
			<td><select name="sq">
					  <option value="What is your pet's name?" name="sq">What is your pet's name?</option>
					  <option value="What is your favourite movie?"  name="sq">What is your favourite movie?</option>
					  <option value="What is your favourite restaurant?"  name="sq">What is your favourite restaurant?</option>
					  <option value="Who was your first crush?"  name="sq">Who was your first crush?</option>
			</select></td>
		</tr>
		<tr>
			<th>Security Answer:</th>
			<td><input type="text" name="answer"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
		
	</table>
	</form>
</body>
</html>