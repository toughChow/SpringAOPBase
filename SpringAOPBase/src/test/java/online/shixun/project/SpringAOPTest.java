package online.shixun.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import online.shixun.project.service.RegisterService;

@Component
public class SpringAOPTest {

	@Autowired
	private RegisterService registerService;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringAOPTest aopTest = ctx.getBean(SpringAOPTest.class);
		aopTest.testRegist();
	}
	
	public void testRegist(){
		registerService.doRegister("张三");
	}
}
