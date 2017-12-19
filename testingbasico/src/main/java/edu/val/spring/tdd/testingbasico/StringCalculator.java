package edu.val.spring.tdd.testingbasico;

public class StringCalculator {
	
	public static final void add(final String numbers) {
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) 
        	{
            	throw new RuntimeException("Máximo de 2 numeros separados por coma");
        	} 
        else 
        	{
            for (String number : numbersArray) 
            	{
                	Integer.parseInt(number); 
                }
        }
    }

}
