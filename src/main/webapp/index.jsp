<html>
<head>
<title>simple web application</title>
<link rel="stylesheet type="text/css" href="style.css">
</head>
<body style="background-color:#FFF8F0;">
<center>
<div class="main">
<form action=addUser>
<h3>Enter Username and Password</h3>
<label>Enter UserName : </label><input type="text" name="Username"><br><br>
<label>Enter Password : </label><input type="text" name="Password"><br><br>
</label><input type="submit" value="  AddUser  "><br><br>
</form>

<form action=getUser>
<h3>Enter Username to get Password</h3>
<label>Enter UserName : </label><input type="text" name="Username"><br><br>
</label><input type="submit" value="  GetUser  "><br><br>
</form>

<form action=deleteUser>
<h3>Enter Username to delete from DB</h3>
<label>Enter UserName : </label><input type="text" name="Username"><br><br>
</label><input type="submit" value="  DeleteUser  "><br><br>
</form>

<form action=updateUser>
<h3>Enter Username to Update</h3>
<label>Enter UserName : </label><input type="text" name="Username"><br><br>
</label><input type="submit" value="  UpdateUser  "><br><br>
</form>
</div>
</center>
</body>
</html>