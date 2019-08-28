   function update(id){
     console.log("Id ");
     console.log(id);

   }
var app = angular.module('booksInventoryApp', ['$scope','$http', '$routeProvider']);

app.controller('booksCtrl', function($scope, $http, $routeProvider) {


  $http.get("http://localhost:2021/getEmps")
    .then(function(response) {
      $scope.data = response.data;
      console.log($scope.data)
    });

   $scope.update=function(idPassedFromNgClick){
    console.log(idPassedFromNgClick);
   }

     $routeProvider
  .when("/", {
    templateUrl : "main.htm"
  })
  .when("/update", {
    templateUrl : "update.html"
  })
  .when("/green", {
    templateUrl : "green.htm"
  })
  .when("/blue", {
    templateUrl : "blue.htm"
  });


});