angular.module('myApp').factory('Contact', ['$resource', function ($resource) {
    return $resource('http://localhost:8080/contacts/:id', { id: '@id' }, {
        'query': { method: 'GET', isArray: true },
        'get': { method: 'GET' },
        'save': { method: 'POST' },
        'update': { method: 'PUT' },
        'remove': { method: 'DELETE' }
    });
}]);


// app.service('ContactService', function ($http) {
 
//     this.list = function () {
//         return $http.get('/contacts/');
//     }
 
//     this.save = function (contact) {
//         return $http.post('/contacts/', contact);
//     }
 
//     this.get = function (id) {
//         return $http.get('/contacts/' + id);
//     }


//     this.update = function (id, updatedContact) {
//         return $http.put('/contacts/' + id, updatedContact);
//     }
 
//     this.delete = function (id) {
//         return $http.delete('/contacts/' + id);
        
//     }
// });