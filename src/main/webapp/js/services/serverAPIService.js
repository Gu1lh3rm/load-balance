angular.module("listaTelefonica").service("serverAPI", function ($http, config, configUrl) {
   var _getUrl = function () {
       return $http.get(configUrl.baseUrl + "");
   };
   var _getServers = function () {
       return $http.get(config.baseUrl + "/servers");
   };
   
   var _getServer = function (id) {
       return $http.get(config.baseUrl + "/servers/" + id);
   };

   var carregarServers = function () {
       $http.get(config.baseUrl + "/servers").success(function (data) {
           //$scope.servers = data;
       })
   }

    carregarServers();

   return {
       getUrl: _getUrl,
       getServers: _getServers,
       getServer: _getServer
   };
});