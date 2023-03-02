package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


 class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

        //GIVEN
        boolean para = true;
        //WHEN
        boolean actual = Main.methode(true);
        //THEN
        assertEquals (false, actual);
        // Test Code


    }
}