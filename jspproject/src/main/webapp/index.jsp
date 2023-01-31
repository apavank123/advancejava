<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Send Details of Fav Persion</h1>

	<form action="form" method="post">
		<pre>
First Name : <input type="text" name="fName" />
Last Name : <input type="text" name="lName" />
Gender :
	Female<input type="radio" name="gender" value="female"
				required="required" />
	Male<input type="radio" name="gender" value="male" required="required" />
	Other<input type="radio" name="gender" value="other" />
				
Reason : <textarea rows="5" cols="20" name="reason"></textarea>
Address : <textarea rows="5" cols="20" name="address"></textarea>

	<input type="submit" name="send" />
	
</pre>
	</form>

</body>
</html>