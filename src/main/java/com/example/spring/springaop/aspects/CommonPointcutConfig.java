package com.example.spring.springaop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	
	@Pointcut("execution(* com.example.spring.springaop.*.*.*(..))")
	public void businessAndDataPackageConfig() {}

	@Pointcut("execution(* com.example.spring.springaop.business.*.*(..))")
	public void businessPackageConfig() {}

	@Pointcut("execution(* com.example.spring.springaop.data.*.*(..))")
	public void dataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}

	@Pointcut("@annotation(com.example.spring.springaop.aspects.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}


