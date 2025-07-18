package com.ut.unit_testing.junitTesting;

import com.ut.unit_testing.Calc;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Create only one instance of object per class
// PER_METHOD need static keyword for all methods to work
@SpringBootTest
public class CalcTest {
    @Autowired
    private Calc calc;
    @BeforeEach
    public void beforeEach(){
        System.out.println("Testing being started!");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Testing being end!");
    }

    @Test
    public void testAllAtOnce(){
        String str = null;
        Assertions.assertAll(
            ()->Assertions.assertTrue(calc.devid(4,2)),
            ()-> Assertions.assertThrows(NullPointerException.class,()->calc.nullPointException(str))
        );
    }
    @Test
    public void testDeviation(){
        Assertions.assertTrue(calc.devid(4,2));
    }
    @Test
    public void assertThrowsException(){
        String str = null;
        // To catch the message it needs to use lambda expression
        // ()->
        Assertions.assertThrows(NullPointerException.class,()->calc.nullPointException(str));
    }
    @Test 
    public void testPerformance(){
        
    }
}
