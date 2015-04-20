<!DOCTYPE html>
<html ng-app="store" >
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
    <script> 
     var app = angular.module('store', [ ]);
      app.controller("SimpleController", function($http,$scope){
      $scope.submit = function(){
      $http({
              url: 'http://localhost:8080/SkillRating/loginForm',
              method: "POST",
              data: JSON.stringify({username:$scope.username, password:$scope.password}),
              headers: {'Content-Type': 'application/json'}
            }).success(function (data, status, headers, config) {

                 $scope.customer = data;
               console.log(data);
               console.log($scope.customer);

              });
           };
      });

    </script>
<title>Insert title here</title>
</head>
<body>
 <div ng-controller="SimpleController as simple" >
    <form ng-submit="submit()">
 		UserName : <input type="text" name="username" ng-model="username"/><br/>
         Password : <input type="password" name="password" ng-model="password"/><br/>
 		<input type="submit" value="Login" id="buttonClick"/>
 		<input type="reset" value="Reset" id="resetClick"/>
 	</form>

 	{{customer.username}}

    </div>
</body>
</html>   