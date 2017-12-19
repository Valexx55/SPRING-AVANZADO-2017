package edu.val.spring.aopsample;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class RegistroOperaciones {
	
	/**
	 *     @Pointcut("execution(public * *(..))")  

It will be applied on all the public methods.

    @Pointcut("execution(public Operation.*(..))")  

It will be applied on all the public methods of Operation class.

    @Pointcut("execution(* Operation.*(..))")  

It will be applied on all the methods of Operation class.

    @Pointcut("execution(public Employee.set*(..))")  

It will be applied on all the public setter methods of Employee class.

    @Pointcut("execution(int Operation.*(..))")  
	 */

	
	@Pointcut("execution(* MiController.paginicio(..))")  
    public void k(){
		
		
	}//pointcut name  
      
    
    @After("k()")//applying pointcut on before advice  
    public void myadvice2 (JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("Después de K...");  
    } 
    
    
    
    @AfterThrowing("within(edu.val.spring.aopsample.MiController)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Excepción en la clase edu.val.spring.aopsample.MiController , método="+joinPoint.toString());
	}
	
	@AfterReturning(pointcut="k()", returning="pagina")
	public void getNameReturningAdvice(String pagina){
		System.out.println("Obteniendo la vista devuelta="+pagina);
	}
	
	
	@Before("k()")
	public void loggingAdvice(JoinPoint joinPoint){
		
		System.out.println("Antes... de K");  
		System.out.println("Antes de k="+joinPoint.toString());
		
		System.out.println("Argumentos pasados=" + Arrays.toString(joinPoint.getArgs()));

	}
	
	@Before("@annotation(edu.val.spring.aopsample.Chequeable)")
	public void myAdvice(){
		System.out.println("Ey...q se va a ejecutar algo chekeable :)!!");
	}
	
	
	//TODO Importantísimo devolver un objeto en caso de que el método lanzado con proceed
	//devuelva algo
	@Around("execution( * edu.val.spring.aopsample.MiController.paginicio3())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Antes de invocar a paginicio3 method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Después de invocar al meodo, devolvemos ="+value);
		return value;
	}
}
