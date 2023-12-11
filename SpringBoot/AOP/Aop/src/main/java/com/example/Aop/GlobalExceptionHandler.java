// package com.example.Aop;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ExceptionHandler;

// @ControllerAdvice
// public class GlobalExceptionHandler {

//     @ExceptionHandler(RuntimeException.class)
//     public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
//         // Log the exception (optional)
//         ex.printStackTrace();

//         // Return a custom error message and HTTP status code
//         return new ResponseEntity<>("An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//     }
// }
