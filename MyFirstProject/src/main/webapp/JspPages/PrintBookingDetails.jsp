<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Details</title>
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
Here are Your Details :
<p>Name : ${obj.name}</p>
<p>Phone : ${obj.phone}</p>
<p>Email : ${obj.email}</p>
<p>Preferred Taxi : ${obj.taxitype}</p>
<p>Extras : ${obj.extras}</p>
<p>Pickup Date : ${obj.pickupDateAndTime}</p>
<p>Pickup Place : ${obj.pickupPlace}</p>
<p>Drop Off Place : ${obj.dropPlace}</p>
<p>Special Instructions : ${obj.specialInstructions}</p>

</div>
</body>
</html>