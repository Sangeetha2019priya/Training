angular.module('contactapp').controller('ContactController', ['$scope', 'ContactService', '$location', function ($scope, ContactService, $location) {
    $scope.contacts = [];
    $scope.newContact = {};
 
    // Function to load contacts
    $scope.loadContacts = function () {
        ContactService.query().$promise.then(function (data) {
            console.log("Raw data from server:", data);
 
            // Ensure data is an array
            $scope.contacts = angular.isArray(data) ? data : [data];
        });
    };
 
    // Function to save or update a contact
    $scope.saveOrUpdateContact = function () {
        if ($scope.Contact.id) {
            // Update existing contact
            ContactService.update({ id: $scope.Contact.id }, $scope.Contact, function () {
                $location.path('/update');
                $scope.refreshContacts();
                $location.path('/');
            });
        } else {
            // Create new contact
            ContactService.save($scope.Contact, function () {
                $scope.refreshContacts();
                $location.path('/');
            });
        }
        $scope.Contact = {};
    };
 
    // Function to edit a contact
    $scope.editContact = function (id) {
        console.log('Editing contact with ID:', id);
        ContactService.get({ id: id }, function (data) {
            console.log('Retrieved contact details:', data);
            $scope.newContact = angular.copy(data); // Update $scope.newContact
            console.log('New contact details:', $scope.newContact);
            $location.path('/update');
        }, function (error) {
            console.error('Error getting contact details:', error);
        });
    };
    

   
    
    $scope.getContactById = function (id) {
        console.log('Getting contact details with ID:', id);
        ContactService.get({ id: id }, function (data) {
            console.log('Retrieved contact details:', data);
            $scope.Contact = data; // Assign data directly without using angular.copy
            $location.path('/'); // Redirect to the default view if needed
        }, function (error) {
            console.error('Error getting contact details:', error);
        });
    };
    

 
 
    // Function to delete a contact
    $scope.deleteContact = function (id) {
        ContactService.remove({ id: id }, function () {
            $scope.refreshContacts();
        });
    };
 
    // Function to refresh contacts
    $scope.refreshContacts = function () {
        $scope.loadContacts();
    };
 
    // Function to navigate to contact details page
    $scope.viewContactDetails = function (id) {
        $location.path('/contacts/' + id);
    };
 
    $scope.redirectToCreateContact = function () {
        $location.path('/create');
    };
 
 
    // Load contacts on controller initialization
    $scope.loadContacts();
}]);
 