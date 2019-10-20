<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="email-validation.js"></script>
</head>
<body>
<h1>Application Form</h1>
<h3>Personal Details</h3>
<!-- 		<a href="home">Back</a>
 -->	
	 <form name="form" action="appform1">
			<table>
			<tr>
						<th>User Name:</th>
						<td><input type="text" name="user_name"></td>
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
						<th>Date of Birth:</th>
						<td><input type="date" name="dob"></td>
					</tr>
					<tr>
						<th>Gender:</th>
						<td>male<input type="radio" name="gender" value="male" required>female<input type="radio" name="gender" value="female"></td>
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
						<th>Address:</th>
						<td><textarea rows="4" cols="22" name="address"></textarea></td>
					</tr>
					<tr>
						<th>State:</th>
						<td><input type="text" name="state"></td>
					</tr>
					<tr>
						<th>City:</th>
						<td><input type="text" name="city"></td>
					</tr>
					<tr>
						<th>Pin Code:</th>
						<td><input type="text" name="pincode" pattern="[1-9]{1}[0-9]{5}"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Register" onclick="ValidateEmail(document.form.email)"></td>
					</tr>
				</table>
		</form>

</body>
</html>