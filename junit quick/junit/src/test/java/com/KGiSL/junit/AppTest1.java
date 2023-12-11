// package com.KGiSL.junit;

// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.ClassOrderer;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.MethodOrderer;
// import org.junit.jupiter.api.Nested;
// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.TestClassOrder;
// import org.junit.jupiter.api.TestMethodOrder;

// /**
//  * Unit test for simple App.
//  */
// // @TestMethodOrder(MethodOrderer.MethodName.class)

// // @TestMethodOrder(MethodOrderer.DisplayName.class)

// // @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

// // @TestMethodOrder(MethodOrderer.Random.class)
// // public class AppTest
// // {

// // @BeforeAll
// // static void befall()
// // {
// // System.out.println("Before all");
// // }

// // @AfterAll
// // static void afall()
// // {
// // System.out.println("after all");
// // }

// // @BeforeEach
// // void each()
// // {
// // System.out.println("Started");
// // }

// // @AfterEach
// // void afeach()
// // {
// // System.out.println("Ended");
// // }

// // @DisplayName("1")
// // @Order(5)
// // @Test
// // void myTest1() {
// // System.out.println("myTest5");
// // }

// // // @DisplayName("3")
// // // @Order(2)
// // @Test
// // void abTest2() {
// // System.out.println("myTest2");
// // }

// // // @Order(1)
// // @Test
// // void abbTest2() {
// // System.out.println("myTest1");
// // }
// // }

// // class order
// @TestClassOrder(ClassOrderer.OrderAnnotation.class)
// @Nested
// @Order(2)
// public class AppTest1 {
//     @Test
//     void myTest1() {
//         System.out.println("myTest5");
//     }

  
//     @Test
//     void abTest2() {
//         System.out.println("myTest2");
//     }

//     @Test
//     void abbTest2() {
//         System.out.println("myTest1");
//     }
// }

// @Nested
// @Order(1)
// class AppFlowTests {

//     @Test
//     void test2() {
//         System.out.println("First nested class");
//     }
// }







// package com.KGiSL.junit;

// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.ClassOrderer;
// import org.junit.jupiter.api.Disabled;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.MethodOrderer;
// import org.junit.jupiter.api.Nested;
// import org.junit.jupiter.api.Order;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.TestClassOrder;
// import org.junit.jupiter.api.TestMethodOrder;
// import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;

// /**
//  * Unit test for simple App.
//  */
// // @TestMethodOrder(MethodOrderer.MethodName.class)

// // @TestMethodOrder(MethodOrderer.DisplayName.class)

// // @TestMethodOrder(MethodOrderer.OrderAnnotation.class)

// // @TestMethodOrder(MethodOrderer.Random.class)
// // public class AppTest
// // {

// // @BeforeAll
// // static void befall()
// // {
// // System.out.println("Before all");
// // }

// // @AfterAll
// // static void afall()
// // {
// // System.out.println("after all");
// // }

// // @BeforeEach
// // void each()
// // {
// // System.out.println("Started");
// // }

// // @AfterEach
// // void afeach()
// // {
// // System.out.println("Ended");
// // }

// // @DisplayName("1")
// // @Order(5)
// // @Test
// // void myTest1() {
// // System.out.println("myTest5");
// // }

// // // @DisplayName("3")
// // // @Order(2)
// // @Test
// // void abTest2() {
// // System.out.println("myTest2");
// // }

// // // @Order(1)
// // @Test
// // void abbTest2() {
// // System.out.println("myTest1");
// // }
// // }

// // class order
// // @TestClassOrder(ClassOrderer.OrderAnnotation.class)

// @TestMethodOrder(OrderAnnotation.class)
// @Nested
// @Order(2)
// public class AppTest {
//     @Test
//     @Order(2)
//     void myTest1() {
//         System.out.println("myTest5");
//     }

  
//     @Test
//     void abTest2() {
//         System.out.println("myTest2");
//     }

//     @Test
//     void abbTest2() {
//         System.out.println("myTest1");
//     }
// }

// @Nested
// @Order(1)
// class AppFlowTests {

//     @Test
//     void test2() {
//         System.out.println("First nested class");
//     }

//      @Test
//     @Disabled("This test is disabled for now")
//     void disabledTest() {
//         System.out.println("This test is disabled");
//         // Test logic for disabled test
//     }
 
// }

// @Nested
// @Order(3)
// class AppFlowTests1 {

//     @Test
//     void test21() {
//         System.out.println("First 111nested class");
//     }

//      @Test
//     @Disabled("This test is disabled for now")
//     void disabledTe1st() {
//         System.out.println("This 11test is disabled");
//         // Test logic for disabled test
//     }
// }
 


// package com.KGiSL.junit;
// import org.junit.jupiter.api.Tag;
// import org.junit.jupiter.api.Test;


// public class AppTest {

//     @Test
//     @Tag("fast")
//     void fastTest() {
//         System.out.println("This is a fast test.");
//     }

//     @Test
//     @Tag("slow")
//     void slowTest() {
//         System.out.println("This is a slow test.");
//     }

//     @Test
//     @Tag("integration")
//     void integrationTest() {
//         System.out.println("This is an integration test.");
//     }

//     @Test
//     @Tag("smoke")
//     void smokeTest() {
//         System.out.println("This is a smoke test.");
//     }
// }


