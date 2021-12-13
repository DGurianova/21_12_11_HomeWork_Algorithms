


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.ApplicationException;

import java.awt.*;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TesterFibonacci {
    FibonacciNumberOperations fno;


    @BeforeEach
    public void startup() {
        fno = new FibonacciNumberOperations();

    }

    @Test
    public void happyCaseFindFibonacciNumber_2tothe31_1power() {
        assertEquals(6796685077251819234L, fno.findFibonacciNumber(1073741824));

    }

    @Test
    public void happyCaseTwoFindFibonacciNumber_numberFive() {
        assertEquals(3, fno.findFibonacciNumber(5));

    }

    @Test
    public void happyCaseThreeFindFibonacciNumber_numberTwenty() {
        assertEquals(4181, fno.findFibonacciNumber(20));

    }

    @Test
    public void caseFindFibonacciNumber_numberZero() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fno.findFibonacciNumber(0);
        });
        assertEquals("The argument is wrong, it must be 1 and more", thrown.getMessage());

    }

    @Test
    public void happyCaseFindFibonacciNumber_numberOne() {
        assertEquals(0, fno.findFibonacciNumber(1));

    }

    @Test
    public void caseFindFibonacciNumber_numberMinus() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fno.findFibonacciNumber(-1);
        });
        assertEquals("The argument is wrong, it must be 1 and more", thrown.getMessage());
    }

    @Test
    public void caseFindFibonacciNumber_performanceTest() {
        long currentTime = System.currentTimeMillis();
        fno.findFibonacciNumber(1073741824);
        System.out.println(System.currentTimeMillis() - currentTime);

    }


    @Test
    public void happyCaseGetModuloFibonacciNumber_10modulo3() {
        assertEquals(1, fno.getModuloFibonacciNumber(10, 3));

    }

    @Test
    public void happyCaseGetModuloFibonacciNumber_9modulo3() {
        assertEquals(0, fno.getModuloFibonacciNumber(9, 3));

    }

    @Test
    public void unhappyCaseGetModuloFibonacciNumber_10modulo0() {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            fno.getModuloFibonacciNumber(10, 0);
        });
        assertEquals("/ by zero", thrown.getMessage()); //Division by 0 is undefined
    }

    @Test
    public void happyCaseGetModuloFibonacciNumber_9moduloMinus3() {
        assertEquals(0, fno.getModuloFibonacciNumber(9, -3));
    }

    @Test
    public void happyCaseGetModuloFibonacciNumber_10moduloMinus3() {
        assertEquals(1, fno.getModuloFibonacciNumber(10, -3));

    }

    @Test
    public void caseGetModuloFibonacciNumber_performance() {
        long currentTime = System.currentTimeMillis();
        fno.getModuloFibonacciNumber(6796685077251819234L, 9);
        System.out.println(System.currentTimeMillis() - currentTime);
    }


    @Test
    public void happyCaseFindGreatestCommonDivisionTernOper() {
        assertEquals(3, fno.findGreatestCommonDivisionTernOper(6796685077251819234L, 9));

    }

    @Test
    public void happyCaseFindGreatestCommonDivisionTernOper_Zero() {
        assertEquals(6796685077251819234L, fno.findGreatestCommonDivisionTernOper(6796685077251819234L, 0));

    }

    @Test
    public void unhappyCaseFindGreatestCommonDivisionTernOper_Minus9() {

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fno.findGreatestCommonDivisionTernOper(6796685077251819234L, -9);
        });
        assertEquals("The argument is wrong, it must be positive.", thrown.getMessage());
    }

    @Test
    public void caseFindGreatestCommonDivisionTernOper_performanceTest() {
        long currentTime = System.currentTimeMillis();
        fno.findGreatestCommonDivisionTernOper(6796685077251819234L, 9);
        System.out.println(System.currentTimeMillis() - currentTime);
    }


    @Test
    public void happyCaseFindGreatestCommonMultiple() {
        assertEquals(45, fno.findGreatestCommonMultiple(5, 9, 1));

    }

    @Test
    public void unhappyCaseFindGreatestCommonMultiple() {

        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fno.findGreatestCommonMultiple(6796685077251819234L, 9, 3);
        });
        assertEquals("These arguments made long type overflow", thrown.getMessage());


    }

    @Test
    public void caseFindGreatestCommonMultiple_performanceTest() {
        long currentTime = System.currentTimeMillis();
        fno.findGreatestCommonMultiple(45, 9, 1);
        System.out.println(System.currentTimeMillis() - currentTime);
    }

}


