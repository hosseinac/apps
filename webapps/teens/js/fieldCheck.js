function register() {

$('#sessStat1').text("");
$('#sessStat2').text("");
$('#sessStat3').text("");
$('#sessStat4').text("");
var sess1 = "";
var sess2 = "";
var sess3 = "";
var sess4 = "";

	if ( $('#session1').val() == "None" )
	{
		sess1 = "1 ";

	}
	if ( $('#session2').val() == "None" )
	{
		 sess2 += "2 ";
	
	}

	if ( $('#session3').val() == "None" )
	{
		sess3 = "3 ";

	}
	if ( $('#session4').val() == "None" )
	{
		 sess3 += "4 ";
	
	}
	
	if (sess1 != "" || sess2 != "")
	{
		alert("You must select a choice for each session before registeration will be accepted.");

		if ( sess1 != "") { $('#sessStat1').text("*"); }
		if ( sess2 != "") { $('#sessStat2').text("*"); }
		if ( sess3 != "") { $('#sessStat3').text("*"); }
		if ( sess4 != "") { $('#sessStat4').text("*"); }
	}
	else
	{  
		$.post('register', function($('#firstName').val(), $('#lastName').val(), $('#grade').val(), $('#age').val(), $('#school').val(), $('#homeAddress').val(), $('#homeCity').val(), $('#homeZIP').val(), $('#cellularPhone').val(), $('#homePhone').val(), $('#studentEmail').val(), $('#pgFirst').val(), $('#pgLast').val(), $('#pgPhone').val(), $('#pgEmail').val(), $('#session1').val(), $('#session2').val(), $('#session3').val(), $('#session4').val() ) { } );
		alert("Registration Submitted");

	}


}
