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
		var form = $('#form0');
		form.submit(function () {
 
		$.ajax({
				type: form.attr('method'),
				url: form.attr('action'),
				data: form.serialize(),
				success: function (data) {
				var result=data;
				$('#status').text(result);
 
				}
			});
 	
			return false;
		});



		//$.post('/teens/register', $('#firstName').serialize(), $('#lastName').serialize(), $('#grade').serialize(), $('#age').serialize(), $('#school').serialize(), $('#homeAddress').serialize(), $('#homeCity').serialize(), $('#homeZIP').serialize(), $('#cellularPhone').serialize(), $('#homePhone').serialize(), $('#studentEmail').serialize(), $('#pgFirst').serialize(), $('#pgLast').serialize(), $('#pgPhone').serialize(), $('#pgEmail').serialize(), $('#session1').serialize(), $('#session2').serialize(), $('#session3').serialize(), $('#session4').serialize(), function(responseData) { 
                  //$('#status').text(responseData) } );

		//alert("Submitted");
		

	}


}
