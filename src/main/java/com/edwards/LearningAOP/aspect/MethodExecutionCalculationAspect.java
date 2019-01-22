package com.edwards.LearningAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Configuration
// AOP

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	// aspect = pointcut + advice, functionality want to implement.
	// point cut - expression that's is targeted for interception;
	// WEAVER - framework that implements weaving
	// WEAVING - the process of implementing AOP around the method
	// linking aspects

	// joinPoint specific point of execution

	//Pointcut (what methods to intercept) :
	@Around ("execution(* com.edwards.LearningAOP.business.*.*(..))")
	// join point is basically an execution instance:


	// proceedingJoinPoint allows the method to proceed:
	public void before(ProceedingJoinPoint joinPoint) throws Throwable{

		// advice:
		long startTime = System.currentTimeMillis();
		// find out method execution time:
		joinPoint.proceed();

		long timeTaken = System.currentTimeMillis() - startTime;
		
		
		logger.info("an example of @Around advice: Time taken by {} is {}", joinPoint, timeTaken);
	}
	

}
