demo.config(function ($provide) {
    $provide.provider('MathService', function () {
        this.$get = function () {
            var factory = {};

            factory.sum = function (a, b) {
                return a + b;
            }
            return factory;
        };
    });
});

demo.value("defaultInput", 10);

demo.factory('MathService', function () {
    var factory = {};

    factory.sum = function (a, b) {
        return a + b;
    }
    return factory;
});

demo.service('demoService', function (MathService) {
    this.addition = function (a) {
        return MathService.sum(a, a);
    }
});
