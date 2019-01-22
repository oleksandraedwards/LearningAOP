package com.edwards.LearningAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// Configuration
// AOP

@Aspect
@Configuration
public class UserAccessAspect {

	Logger logger = LoggerFactory.getLogger(this.getClass());


	// aspect = pointcut + advice
	// point cut - expression that is targeted for interception;
	// WEAVER - framework that implements weaving
	// WEAVING - the process of implementing AOP around the method
	// joinPoint specific point of execution (address)

	@Before("execution(* com.edwards.LearningAOP.business.*.*())")
	public void before(JoinPoint joinPoint) {
		logger.info("check for user access");
		logger.info("allow execution - {}", joinPoint);
	}

}
