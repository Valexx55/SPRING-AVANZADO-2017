package edu.val.spring.tdd.testingbasico;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	@Test(expected = RuntimeException.class)
    public final void masDeDosNumerosEsExcepccion() {
        StringCalculator.add("1,2,3");
    }
    @Test
    public final void dosNumerosCasoCorrecto() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void casoDeNumeroYNoNumeroEsExcepcion() {
        StringCalculator.add("1,X");
    }
}
