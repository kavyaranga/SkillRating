
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" /
<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="//ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
<script src="js/<a href="http://www.jqueryscript.net/tags.php?/Validation/">Validation</a>FormScript.js"></script>
<script type="text/javascript">

$(document).ready(function() {
    $('#form1').validate({
            rules:{}
        });
	$('#buttonClick').click(function() {

		$.ajax({

			type : 'POST',
			url :'${pageContext.request.contextPath}/login.json',
			success : function(data){
				$('.result').html(data.id + '----' + data.firstName);

			}

		});
	});


});
</script>

<body>

<h1>Login to the Skill Rating Portal</h1>

    <form class="form-horizontal" id="form1" action="login">
      <fieldset>

        <!-- Form Name -->
        <legend>
        <center>
          Skill rating Login Form
        </center>
        </legend>

        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="UserName">UserName</label>
          <div class="col-md-3">
            <div class="input-group"> <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
              <input id="name" name="name" type="text" placeholder="Enter Your UserName" class="form-control input-md">
            </div>
          </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="Password">Password</label>
          <div class="col-md-3">
            <div class="input-group"> <span class="input-group-addon"><i class="fa fa-key fa-fw"></i></span>
              <input id="password" name="password" type="password" placeholder="Enter Your Password" class="form-control input-md">
            </div>
          </div>
        </div>

        <!-- Button -->
        <div class="form-group">
          <label class="col-md-4 control-label" for="Submit"></label>
          <div class="col-md-4">
            <button id="Submit" class="btn btn-success" type="Submit">Submit</button>
          </div>
        </div>
      </fieldset>
    </form>
    </body>
</html>
