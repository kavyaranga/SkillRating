<html><head>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function() {
	$('#buttonClick').click(function() {

		$.ajax({

			type : 'POST',
			url :'${pageContext.request.contextPath}/loginForm',
			success : function(data){
				$('.result').html(data);

			}

		});
	});


});
</script></head>
<body>
	<h2>Hello World!</h2>
		<form>
		UserName : <input type="text" name="username"/><br/>
        Password : <input type="password" name="password"/><br/>
		<input type="button" value="Login" id="buttonClick"/>
		<input type="reset" value="Reset" id="resetClick"/>
	</form>
	<br/>
	<div class="result"></div>
</body>
</html>
