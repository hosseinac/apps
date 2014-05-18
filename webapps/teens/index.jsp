<!DOCTYPE html>
<html>
<head>
<script src="/teens/js/jquery-2.1.1.min.js"></script>

<script src="/teens/js/fieldCheck.js"></script>

<style> 

#element0
{

width:1335px;
height:600px;
overflow:hidden;

background:gold;
border-top-right-radius:10px;
border-top-left-radius:10px;
border-bottom-right-radius:10px;
border-bottom-left-radius:10px;

}


#element1
{

width:1305px;
height:570px;
overflow:hidden;

background:navy;
border-top-right-radius:12em;
border-top-left-radius:12em;
border-bottom-right-radius:12em;
border-bottom-left-radius:12em;

}

#element2
{

width:1335px;
height:600px;
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
		<tr><td><center><font face=impact color=gold size=10>Teen Summit<br>October 17, 2014</font><br><font face=impact color=gold size=6>Sponsored by the Weldon High School Class of 2004</font></center></td></tr>
	</table>
	</center>
	<br>

	<center>
	<font face=arial color=gold size=6><b>Student Registration</font>
	<table>
		<tr>	
			<td><input type=text size=30 id="firstName"></td>
			<td><input type=text size=30 id="lastName"></td>
			<td><input type=text size=30 id="age"></td>
			<td><input type=text size=30 id="grade"></td>	
			<td><input type=text size=30 id="school"></td>
		</tr>
		<tr>
			<td><font face=arial color=gold><b><center>First Name</font></td>
			<td><font face=arial color=gold><b><center>Last Name</font></td>
			<td><font face=arial color=gold><b><center>Age</font></td>
			<td><font face=arial color=gold><b><center>Grade</font></td>
			<td><font face=arial color=gold><b><center>School</font></td>
		</tr>
		<tr>	
			<td><input type=text size=30 id="homeAddress"></td>
			<td><input type=text size=30 id="homeCity"></td>
			<td><input type=text size=30 id="homeZIP"></td>
			<td><input type=text size=30 id="cellularPhone"></td>	
			<td><input type=text size=30 id="homePhone"></td>
		</tr>
		<tr>
			<td><font face=arial color=gold><b><center>Home Address</font></td>
			<td><font face=arial color=gold><b><center>City</font></td>
			<td><font face=arial color=gold><b><center>ZIP</font></td>
			<td><font face=arial color=gold><b><center>Cell Phone</font></td>
			<td><font face=arial color=gold><b><center>Home Phone</font></td>
		</tr>
		<tr>	
			<td><input type=text size=30 id="studentEmail"></td>
			<td><input type=text size=30 id="pgFirst"></td>
			<td><input type=text size=30 id="pgLast"></td>
			<td><input type=text size=30 id="pgPhone"></td>	
			<td><input type=text size=30 id="pgEmail"></td>
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
	<table width=80%>
		<tr>	
			<td colspan=2><font face=arial color=gold><b><center>Breakout Session # 1:</font></td>
			<td colspan=2><font face=arial color=gold><b><center>Breakout Session # 2:</font></td>
			<td colspan=2><font face=arial color=gold><b><center>Breakout Session # 3:</font></td>
			<td colspan=2><font face=arial color=gold><b><center>Breakout Session # 4:</font></td>
		</tr>
		<tr>
			<td><center><font color=gold><div id="sessStat1"></div></font></td>
			<td><center>
				<select id="session1">
					<option value="None">Select ...</option>
					<option value="Financial Literacy">Financial Literacy</option>
				</select>
			</td>
			
			<td><center><font color=gold><div id="sessStat2"></div></font></td>
			<td><center>
				
				<select id="session2">
					<option value="None">Select ...</option>
					<option value="Financial Literacy">Financial Literacy</option>
				</select>
			</td>
			<td><center><font color=gold><div id="sessStat3"></div></font></td>
			<td><center>
				
				<select id="session3">
					<option value="None">Select ...</option>
					<option value="Financial Literacy">Financial Literacy</option>
				</select>
			</td>
			<td><center><font color=gold><div id="sessStat4"></div></font></td>
			<td><center>
				
				<select id="session4">
					<option value="None">Select ...</option>
					<option value="Financial Literacy">Financial Literacy</option>
				</select>
			</td>
		</tr>
		
	</table>
	<br>
	<input type=button onclick="register()" value="Submit Registration">
	</center>

</div>
</div>


</body>
</html>