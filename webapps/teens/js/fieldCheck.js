function register() {

$('#sessStat1').text("");
$('#sessStat2').text("");
$('#sessStat3').text("");
$('#sessStat4').text("");
var sess1 = "";
var sess2 = "";
var sess3 = "";
var sess4 = "";
var regStatus ="";

var dataString = "firstName="+$('#firstName').val()+"&lastName="+$('#lastName').val()+"&grade="+$('#grade').val()+"&age="+$('#age').val()+"&school="+$('#school').val()+"&homeAddress="+$('#homeAddress').val()+"&homeCity="+$('#homeCity').val()+"&homeZIP="+$('#homeZIP').val()+"&cellularPhone="+$('#cellularPhone').val()+"&homePhone="+$('#homePhone').val()+"&studentEmail="+$('#studentEmail').val()+"&pgFirst="+$('#pgFirst').val()+"&pgLast="+$('#pgLast').val()+"&pgPhone="+$('#pgPhone').val()+"&pgEmail="+$('#pgEmail').val()+"&session1="+$('#session1').val()+"&session2="+$('#session2').val()+"&session3="+$('#session3').val()+"&session4="+$('#session4').val();

var dataArray = [ $('#sessStat1').val(), $('#sessStat2').val(), $('#sessStat3').val(), $('#sessStat4').val() ];
var duplicates = "";
var obj = {};
for (var i = 0, j = dataArray.length; i < j; i++) 
{
   if (obj[dataArray[i]]) 
   {
      obj[dataArray[i]]++;
   }
   else 
   {
      obj[dataArray[i]] = 1;
   } 
}

if ( obj['Financial Literacy'] > 1 || obj['Abstinence'] || obj['Substance Abuse'] || obj['Peer Pressure'] )
{
	if ( obj['Financial Literacy'] > 1 ) { duplicates += "Financial Literacy\n"; }
	if ( obj['Abstinence'] > 1 ) { duplicates += "Abstinence\n"; }
	if ( obj['Substance Abuse'] > 1 ) { duplicates += "Substance Abuse\n"; }
	if ( obj['Peer Pressure'] > 1 ) { duplicates += "Peer Pressure\n"; }
	
	alert("You have selected more than one of the following session(s):\n\n"+duplicates+"\nPlease choose a different session for one of the currently selected sessions.");

}


	if ( $('#session1').val() == "None" )
	{
		sess1 = "1 ";

	}
	if ( $('#session2').val() == "None" )
	{
		 sess2 = "2 ";
	
	}

	if ( $('#session3').val() == "None" )
	{
		sess3 = "3 ";

	}
	if ( $('#session4').val() == "None" )
	{
		 sess4 = "4 ";
	
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
		
		$.ajax({
				type:"post",
 				url: "/teens/register",
 				data:dataString,
 				success: function (msg) {

				regStatus = msg; 
				
					//if ( regStatus > 0 )
					//{
	
						//document.write("Hello "+$('#firstName').val()+" "+$('#lastName').val()+". Thank you for registering for the teen summit.");
						//window.location.replace("/teens/createRegistration.jsp?firstName="+$('#firstName').val()+"&lastName="+$('#lastName').val()+"&regId="+regStatus);
					//}
					//else
					//{
						alert(regStatus);
					//}

				}
			});


	}


}
