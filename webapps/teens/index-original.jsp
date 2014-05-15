<!DOCTYPE html>
<html>
<head>
<style> 

#element0
{

width:1335px;
height:370px;
overflow:hidden;

background:gold;
border-top-right-radius:10px;
border-top-left-radius:10px;
border-bottom-right-radius:10px;
border-bottom-left-radius:10px;

}


#element1
{

width:1325px;
height:330px;
overflow:hidden;

background:navy;
border-top-right-radius:10em;
border-top-left-radius:10em;
border-bottom-right-radius:10em;
border-bottom-left-radius:10em;

}

#element2
{

width:1335px;
height:300px;
overflow:hidden;

border:2px solid gold;
background:navy;
border-top-right-radius:5em;
border-top-left-radius:5em;

}

#hdimg
{
border:6px solid gold;
}


</style>
</head>

<body bgcolor=navy>
<center>
<div id="element0">
<br>
<div id="element1">

	<br>
	<center>
	<table>
		<tr><td><center><img id="hdimg" src="image00.jpg" height=80% width=80%></td><td><center><font face=impact color=gold size=10>Teen Summit<br>October 17, 2014</font></center></td></tr>
		<tr><td><center><img id="hdimg" src="image00.jpg" height=80% width=80%></td><td><center><font face=impact color=gold size=10>Sponsored by the Weldon High School Class of 2004</font></center></td></tr>
	</table>
	<table width=80%>
		<tr><td><center><b><font face=arial color=gold> WCS Teen Summit Homepage<b></font face=arial color=gold></td><td><center><b><font face=arial color=gold>About WCS Teen Summit</b></font></td><td><center><b><font face=arial color=gold>Events</b></font></td><td><center><b><font face=arial color=gold>Contact Us</b></font></td></tr>
	</table>
	</center>
	
</div>
</div>
<br>
<div id="element2">
<form method="post" action="/wcsteens/register">
	<center>
	<font face=arial color=gold size=5><b>Student Registration</font>
	<table>
		<tr>	
			<td><input type=text size=30 name="firstName"></td>
			<td><input type=text size=30 name="lastName"></td>
			<td><input type=text size=30 name="age"></td>
			<td><input type=text size=30 name="grade"></td>	
			<td><input type=text size=30 name="school"></td>
		</tr>
		<tr>
			<td><font face=arial color=gold><b><center>First Name</font></td>
			<td><font face=arial color=gold><b><center>Last Name</font></td>
			<td><font face=arial color=gold><b><center>Age</font></td>
			<td><font face=arial color=gold><b><center>Grade</font></td>
			<td><font face=arial color=gold><b><center>School</font></td>
		</tr>
		<tr>	
			<td><input type=text size=30></td>
			<td><input type=text size=30></td>
			<td><input type=text size=30></td>
			<td><input type=text size=30></td>	
			<td><input type=text size=30></td>
		</tr>
		<tr>
			<td><font face=arial color=gold><b><center>Home Address</font></td>
			<td><font face=arial color=gold><b><center>City</font></td>
			<td><font face=arial color=gold><b><center>ZIP</font></td>
			<td><font face=arial color=gold><b><center>Cell Phone</font></td>
			<td><font face=arial color=gold><b><center>Home Phone</font></td>
		</tr>
		<tr>	
			<td><input type=text size=30></td>
			<td><input type=text size=30></td>
			<td><input type=text size=30></td>
			<td><input type=text size=30></td>	
			<td><input type=text size=30></td>
		</tr>
		<tr>
			<td><font face=arial color=gold><b><center>Student E-mail</font></td>
			<td><font face=arial color=gold><b><center>Parent/Guardian First Name</font></td>
			<td><font face=arial color=gold><b><center>Parent/Guardian Last Name</font></td>
			<td><font face=arial color=gold><b><center>Parent/Guardian Phone</font></td>
			<td><font face=arial color=gold><b><center>Parent/Guardian E-mail</font></td>
		</tr>
	</table>
	<br>
	<table>
		<tr>	
			<td><font face=arial color=gold><b><center>Breakout Session # 1:</font></td><td><select></select></td>
			<td><font face=arial color=gold><b><center>Breakout Session # 2:</font></td><td><select></select></td>
		</tr>
	</table>
	<br>
	<input type=submit value="Submit Registration">
	</center>
</form>
</div>

</body>
</html>