package com.molim.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAopExpressions {

	@Pointcut("execution(* com.molim.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.molim.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("execution(* com.molim.aopdemo.dao.*.*(..))  && !(getter() || setter())")
	public void myPointcut() {}
	
}
