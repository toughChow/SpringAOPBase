package online.shixun.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.aop.PerformanceAware;
import online.shixun.project.dao.RegisterDao;

@Service
public class RegisterService {

	private RegisterDao registerDao;
	
	@Autowired
	public RegisterService(RegisterDao registerDao){
		this.registerDao = registerDao;
	}
	
	@PerformanceAware
	public void doRegister(String username){
		int randomSleepTime = (int) (Math.random()*5000);
		try {
			Thread.sleep(randomSleepTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		registerDao.saveUser(username);
	}
	
}
