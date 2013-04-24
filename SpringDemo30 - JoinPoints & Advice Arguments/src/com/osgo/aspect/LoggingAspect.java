package com.osgo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.osgo.model.Circle;

@Aspect
public class LoggingAspect
{
	// @Before("allGetters() && allCircleMethods()")
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint)
	{
		// System.out.println("Advice run.  Get method called.");
		// System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
		// Circle circle = (Circle) joinPoint.getTarget();
		
	} // end method loggingAdvice
	
	
	
	@Before("args(name)")
	public void stringArgumentMethod(String name)
	{
		System.out.println("A method that takes String arguments has been called.  The value is: " + name);
	} // end method stringArgumentMethod
	
	
	
	@Pointcut("execution(* get*())")
	public void allGetters()
	{
	} // end dummy method allGetters
	
	
	
	@Pointcut("within(com.osgo.model.Circle)")						
	public void allCircleMethods()
	{
	} // end dummy method allCircleMethods()
		
	
} // end Class LoggingAspect
