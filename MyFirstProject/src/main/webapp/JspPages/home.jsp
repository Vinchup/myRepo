<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Your Cab</title>
<style>
body {background-color: grey;}
.content {
  max-width: 400px;
  margin: auto;
  border: 2px solid green;
}
</style>
</head>
<body>
<div class="content">
<header><b>Please Enter Your Details : </b></header>
<form method="get" enctype="application/x-www-form-urlencoded" action="addCabBookinDetails">

<p>
<label>Name
<input type="text" name="name" required>
</label> 
</p>

<p>
<label>Phone 
<input type="text" name="phone">
</label>
</p>

<p>
<label>Email 
<input type="text" name="email">
</label>
</p>

<p>
<label>Which Taxi Do You Require
<input type="text" name="taxitype">
</label>
</p>
<p>

<label>Extras 
<input type="text" name="extras">
</label>
</p>

<p>
<label>Pickup Date
<input type="text" name="pickupDateAndTime" required>
</label>
</p>
	
<p>
<label>Pickup Place 
<input type="text" name="pickupPlace">
</label>
</p>

<p>
<label>Drop Off Place 
<input type="text" name="dropPlace">
</label>
</p>


<p>
<label>Special Instructions
<input type="text" name="specialInstructions">
</label>
</p>

<p><button>Submit Booking</button></p>
</form>
<form method="get" enctype="application/x-www-form-urlencoded" action="getCabBookinDetails">
 <p><button>Click here for your booking details</button></p>
</form>

<form method="get" enctype="application/x-www-form-urlencoded" action="logout">
 <p><button>Logout</button></p>
</form>
</div>
</body>
</html>