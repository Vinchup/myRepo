<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Details</title>
<style>
body {background-color: coral;}
.content {
  max-width: 400px;
  margin: auto;
  border: 2px solid green;
}
</style>
</head>
<body>
<div class="content">
<form method="get" enctype="application/x-www-form-urlencoded" action="getBookingDetails">

<p>
<label>Please enter your phone number
<input type="text" name="phoneNo" required>
</label> 
</p>
<p><button>Get Details</button></p> 
</form>
</div>
</body>
</html>