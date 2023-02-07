<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>X-workz</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80">
			</a>
		</div>
		<div class="col-1">
			<a href="index.jsp">Home_Page</a>
		</div>
	</nav>
	<div>
		<form action="email" method="get">
			Click here to get your Mail id : <input type="submit"
				value="click for email" />
			<h6>${email}</h6>
		</form>
	</div>
	<div>
		<form action="adhar" method="get">
			Click here to get your Adhar number : <input type="submit"
				value="click for adhar" />
			<h6>${adhar}</h6>
		</form>
	</div>
	<div>
		<form action="number" method="get">
			Click here to get your number : <input type="submit"
				value="click for number" />
			<h6>${number}</h6>
		</form>
	</div>
	<div>
		<form action="age" method="get">
			Click here to get your Age : <input type="submit"
				value="click for age" />
			<h6>${age}</h6>
		</form>
	</div>
	<div>
		<form action="dateofbirth">
			Click here to get your dateOfBirth : <input type="submit"
				value="click for dateOfBirth" />
			<h6>${dateOfBirth}</h6>
		</form>
	</div>

	<div>
		<form action="salary">
			Click here to get your Salary : <input type="submit"
				value="click for salary" />
			<h6>${salary}</h6>
		</form>
	</div>

	<div>
		<form action="friend">
			FriendsNames : <input type="submit"
				value="click for Best_friendNames" />
			<ol>
				<c:forEach items="${B_friends}" var="item">
					<li>${item}</li>
				</c:forEach>
			</ol>
		</form>
	</div>

	<div>
		<form action="place">
			Most Visted Places... <input type="submit"
				value="click for most_visitedPlace" />
			<ol>
				<c:forEach items="${visitedPlace}" var="item">
					<li>${item}</li>
				</c:forEach>
			</ol>
		</form>
	</div>
	<div>
		<form action="skill">
			Skill_Set : <input type="submit" value="click for skillSet" />
			<ol>
				<c:forEach items="${skills}" var="item">
					<li>${item}</li>
				</c:forEach>
			</ol>
		</form>
	</div>

	<div>
		<form action="educationdto">
			<h6>Display the EducationDTO :</h6>
			<input type="submit" value="click for educationDTO" /> <br> <label>schoolName
				: ${educationdto.schoolName}</label><br> <label>schoolLocation
				: ${educationdto.schoolLocation}</label><br> <label>schoolTaluk
				: ${educationdto.schoolTaluk}</label><br> <label>puClgName :
				${educationdto.puClgName}</label><br> <label>puClgLocation :
				${educationdto.puClgLocation}</label><br> <label>puClgTaluk :
				${educationdto.puClgTaluk}</label><br> <label>engineeringClgName
				: ${educationdto.engineeringClgName}</label><br> <label>engineeringBranch
				: ${educationdto.engineeringBranch}</label><br> <label>engineeringClgLocation
				: ${educationdto.engineeringClgLocation}</label><br> <label>engineeringTaluk
				: ${educationdto.engineeringTaluk}</label><br>
		</form>
		<br>

		<form action="family">
			<h6>Display the FamilyDTO :</h6>
			<input type="submit" value="click for FamilyDTO" /> <br> <label>FatherName
				:${family.fatherName}</label> <br> <label>MotherName
				:${family.motherName}</label> <br> <label>BrotherName
				:${family.brotherName}</label> <br> <label>DistName
				:${family.distName}</label> <br> <label>TalukName
				:${family.talukName}</label> <br> <label>VillageName
				:${family.villageName}</label> <br> <label>PincodeNum:${family.pincodeNum}</label>
			<br> <label>Reigion :${family.religion}</label> <br> <label>YearlyIncome
				:${family.yearlyIncome}</label> <br> <label>FatherOccupation
				:${family.fatherOccupation}</label> <br>
		</form>
		<br>

		<form action="mobile">
			<h6>Display the Mobile :</h6>
			<input type="submit" value="click for Mobile" /> <br> <label>Mobile
				Model : ${mobile.model}</label> <br>
			<label>Mobile CompanyName : ${mobile.companyName}</label> <br>
			<label>Mobile RAM : ${mobile.ram}</label> <br>
			<label>Mobile ROM : ${mobile.rom}</label> <br>
			<label>Mobile Cost : ${mobile.cost}</label>

		</form>
		<br>

		<form action="drink">
			<h6>Display the Beverge :</h6>
			<input type="submit" value="click for Beverge" /> <br> <label>Beverage
				Name :${drink.name}</label> <br>
			<label>Beverage cold :${drink.cold}</label> <br>
			<label>Beverage hot :${drink.hot}</label> <br>
			<label>Beverage price : ${drink.price}</label> <br>
			<label>Beverage location : ${drink.location}</label> <br>
			<label>Beverage dist : ${drink.dist}</label> <br>
			<label>Beverage taluk : ${drink.taluk}</label> <br>
			<label>Beverage place : ${drink.place}</label>

		</form>
		<br>

		<form action="chat">
			<h6>Display the Chat :</h6>
			<input type="submit" value="click for Chat" /> <br> <label>
				ChatId : ${chat.id} </label> <br> <label> ChatName :
				${chat.name} </label> <br> <label> ChatPrice : ${chat.price} </label> <br>
			<label> ShopName : ${chat.centerName} </label> <br> <label>
				MadeBy : ${chat.madeBy} </label> <br> <label> Location :
				${chat.location} </label> <br> <label> CoolDrink :
				${chat.coolDrinkName} </label> <br> <label> Location :
				${chat.location} </label> <br> <label> Quantity :
				${chat.quantity} </label> <br> <label> TasteOrNot :
				${chat.taste} </label> <br> <label> Type : ${chat.type} </label>
		</form>


	</div>



















</body>
</html>