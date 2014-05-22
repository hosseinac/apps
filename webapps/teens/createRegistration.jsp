<html>
<head>
<link href="layout.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor=navy>
<center>
<div id="element0">
<br>
<div id="element1">
<font face=calibri color=gold size=5><b>
<br><br>
Thank you <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %> for registering for the Teen Summit.<br>
Your registration # is <%= request.getParameter("regid") %> .
We look forward to seeing you on October 17, 2014.  
</font></b>
</center>
</div>
</div>
</body>
</html>