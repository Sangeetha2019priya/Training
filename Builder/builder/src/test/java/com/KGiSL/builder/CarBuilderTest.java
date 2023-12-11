package com.KGiSL.builder;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
import com.KGiSL.builder.Entity.Car;
import com.KGiSL.builder.Entity.CarBuilder;

public class CarBuilderTest {

    
   @Test
   public void testCarBuilder() {
    CarBuilder carBuilder = new CarBuilder();
    Car c1 = carBuilder.id(1).Name("Sangeetha").build();
  

    assertEquals(1, c1.getId());
    assertEquals("Sangeetha",c1.getName());
    
}
}