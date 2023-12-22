angular.module('myApp').controller('ContactController', ['$scope', 'Contact', function ($scope, Contact) {
    $scope.contacts = [];
    $scope.newContact = {};
 
    // Function to load contacts
    $scope.loadContacts = function () {
        Contact.query().$promise.then(function (data) {
            $scope.contacts = data;
        });
    };
 
    // Function to save or update a contact
    $scope.saveContact = function () {
        if ($scope.newContact.id) {
            // Update existing contact
            Contact.update({ id: $scope.newContact.id }, $scope.newContact, function () {
                $scope.refreshContacts();
            });
        } else {
            // Create new contact
            Contact.save($scope.newContact, function () {
                $scope.refreshContacts();
            });
        }
        $scope.newContact = {};
    };
 
    // Function to edit a contact
    $scope.editContact = function (id) {
        $scope.newContact = Contact.get({ id: id });
    };
 
    // Function to delete a contact
    $scope.deleteContact = function (id) {
        Contact.remove({ id: id }, function () {
            $scope.refreshContacts();
        });
    };
 
    // Function to refresh contacts
    $scope.refreshContacts = function () {
        $scope.loadContacts();
    };
 
    // Load contacts on controller initialization
    $scope.loadContacts();
}]);
 
// app.controller('ContactController', function ($scope, ContactService) {
//     $scope.contacts = [];
 
//     $scope.loadContacts = function () {
//         ContactService.list().then(function (response) {
//             $scope.contacts = response.data;
//             console.log($scope.contacts);
//         }, function (error) {
//             console.error('Error loading contacts', error);
//         });
//     };
 
//     $scope.saveContact = function () {
//         ContactService.save($scope.newcontact).then(function (response) {
//             $scope.loadContacts();
//             $scope.newcontact = {};
//         }, function (error) {
//             console.error('Error saving contact', error);
//         });
//     }
 
//     $scope.edit = function (id) {
//         ContactService.get(id).then(function (response) {
//             $scope.newcontact = response.data;
//         }, function (error) {
//             console.error('Error loading contact for editing', error);
//         });
//     }
 
//     $scope.delete = function (id) {
//         ContactService.delete(id).then(function () {
//             $scope.loadContacts();
//             if ($scope.newcontact.id == id) $scope.newcontact = {};
//         }, function (error) {
//             console.error('Error deleting contact', error);
//         });
//     }
 
//     $scope.loadContacts();
// });