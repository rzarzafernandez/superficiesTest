/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 *
 * @author rzarzafernandez
 */

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LogicParamTest {

    private Modelo mod;
    private float result;


    @Before
    public void initialize() {
//        log = new logic();
    }

    public LogicParamTest(Modelo mod, float result) {
        this.mod = mod;
        this.result = result;

    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
            {new Modelo(0, 25, 5, 0, 0, 0, 0, 0, 0, 0), 25},
            {new Modelo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 0},
            {new Modelo(3, 0, 5, 6, 30.0f, 0, 0, 0, 0, 0), 30.0f},
            {new Modelo(2, 0, 5, 6, 30.0f, 0, 0, 0, 0, 0), 30.0f}
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + result);
        assertEquals(result, Logic.calcular(mod), 2.0); 
    }
}
