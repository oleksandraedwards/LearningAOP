package com.edwards.LearningAOP.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut ("execution(* com.edwards.LearningAOP.data.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut ("execution(* com.edwards.LearningAOP.business.*.*(..))")
	public void businessLayerExecution(){}
	
	@Pointcut ("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution(){}
		
	
	// will intercept any beans that are defined with his specification:
	@Pointcut ("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut ("within(com.edwards.LearningAOP.data..*)")
	public void dataLayerExecutionWithWithin(){}
	
	@Pointcut ("@annotation(com.edwards.LearningAOP.aspect.TrackTime)")
	public void trackTimeAnnotation(){}
}
	

