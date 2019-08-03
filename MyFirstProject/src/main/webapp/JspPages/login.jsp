<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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

${SPRING_SECURITY_LAST_EXCEPTION.message}
<form method="post" enctype="application/x-www-form-urlencoded" action="login">

<p>
<label>Username :  
<input type="text" name="username">
</label>
</p>

<p>
<label>Password : 
<input type="text" name="password" required>
</label>
</p>

<p><button>Login</button></p>
</form>
</div>
</body>
</html>