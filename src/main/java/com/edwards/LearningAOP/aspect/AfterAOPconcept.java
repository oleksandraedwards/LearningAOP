package com.edwards.LearningAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// marks as class containing an advice method:

@Aspect
@Configuration
public class AfterAOPconcept {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	// aspect = pointcut + advice
	// point cut - expression thats is targeted for interception;
	// WEAVER - framework that implements weaving
	// WEAVING - the process of implementing AOP around the method
	// joinPoint specific point of execution, where AOP will be plugged in.


	// executes before a join point.
	// cannot prevent execution flow.



	// passing a pointcut : defining which methods to intercept
	// ( package.*(all classes).*()methods

	// after returning - executed after a join point completes normally, eg: no exception
	@AfterReturning(value = "execution(* com.edwards.LearningAOP.CommonJoinPointConfig.*.*(..))",
			returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result){
		logger.info("@afterReturning; {} returned with value {}", joinPoint, result);
	}

	@After(value = "execution(* com.edwards.LearningAOP.business.*.*(..))")
	public void after(JoinPoint joinPoint){
		logger.info("@after; after execution of {}", joinPoint);
	}


}
