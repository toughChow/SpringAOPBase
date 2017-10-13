package online.shixun.project.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {

	@Around("execution(public void online.shixun.project.service.RegisterService.*(..))")
	public void testArround(ProceedingJoinPoint jp) throws Throwable{
		double start = System.currentTimeMillis();
		System.out.println(jp.getSignature().getDeclaringType()+"方法被調用");
		jp.proceed();
		double end = System.currentTimeMillis();
		System.out.println(jp.getSignature().getDeclaringTypeName()+"運行时间為："+(end-start)/1000+"s");
	}
	
}
