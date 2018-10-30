angular.module('app.controllers', [])

.controller('pageCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
  $scope.mdl={};

}])

.controller('page2Ctrl', ['$scope', '$stateParams', '$http', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams, $http) {

appid = '19223F3MTKSE5X9';
  empresa = $stateParams.seleccion;
  url= "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol="+empresa+"&apikey="+appid
  //https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=AAPL&apikey=19223F3MTKSE5X9

  $http.get(url).then(function(response){
    $scope.stocksimbol = response.data["Global Quote"]["01. symbol"];
    $scope.currentprice = response.data["Global Quote"]["05. price"];
    $scope.date = response.data["Global Quote"]["07. latest trading day"];
    $scope.trend = response.data["Global Quote"]["09. change"];
    $q = parseFloat($scope.trend);
    if ($q>0) {
    $scope.c="green"
    $scope.eval="keep"
	} else {
    $scope.c="red"
    $scope.eval="sell"
	}

    //$scope.evaluation = response.data.weather[0].icon;
    console.log("ok");
    console.log(url)
    console.log($scope.date);
  }, function(error){
    alert("Unable to see get");
  })


}])
