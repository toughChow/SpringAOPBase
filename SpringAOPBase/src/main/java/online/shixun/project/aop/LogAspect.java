package online.shixun.project.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution(public void online.shixun.project.dao.RegisterDao.*(..))")
	public void pointCut1(){
		
	}
	
	@Before(value = "pointCut1()")
	public void beforeService(JoinPoint jp){
		System.out.println("插入信息為："+Arrays.toString(jp.getArgs()));
		
	}
}
