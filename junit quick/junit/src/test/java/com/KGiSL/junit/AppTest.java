package com.KGiSL.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("unit")
class UnitTests {

    @Test
    @Tag("fast")
    void fastUnitTest() {
        System.out.println("Executing fast unit test.");
        // Test logic
    }

    @Test
    @Tag("slow")
    void slowUnitTest() {
        System.out.println("Executing slow unit test.");
        // Test logic
    }
}
