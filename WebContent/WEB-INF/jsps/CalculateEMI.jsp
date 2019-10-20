<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <form action="emiCalculator">
	<table>
	
	<tr>
			<th>Loan Amount:</th>
			<td><input type="number" name="loanAmount"></td>
		</tr>
		<tr>
			<th>Loan Tenure:</th>
			<td><input type="number" name="loanTenure"  min="12" max="84"></td>
		</tr>
		<tr>
			<th>Rate of Interest:</th>
			<td><input type="number" name="rateOfInterest"  min="9" max="20"></td>
			</tr>
		
		
		<tr>
			<td colspan="2"><input type="submit" value="Register"></td>
		</tr>
		
	</table>
	</form>

</body>
</html>