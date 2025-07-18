package com.ut.unit_testing;

import org.springframework.stereotype.Component;

@Component
public class Calc {

    public boolean devid(double num1,double num2){
        return true;
    }
    
    public String nullPointException(String str) {
        try {
            // Forcefully throw a NullPointerException
            str.length();  // this line throws NullPointerException
            return "No exception";
        } catch (NullPointerException ex) {
            // Just rethrow the exception (optional: log or handle)
            throw new NullPointerException("Caught: " + ex.getMessage());
        }
    }
}
