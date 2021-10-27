import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cogent.emsjdbc.config.Config;
import com.cogent.emsjdbc.service.EmployeeService;
import com.cogent.emsjdbc.utils.BeanOne;
import com.cogent.emsjdbc.utils.BeanTwo;

public class SpringDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		
//		
//		EmployeeService es = ac.getBean(EmployeeService.class);
//		
//		System.out.println(es.hashCode());
//		System.out.println(es.getEmployees());
		
//		BeanTwo beanTwo = ac.getBean(BeanTwo.class);
//		beanTwo.doSomthing();
		
//		BeanOne beanOne = ac.getBean(BeanOne.class);
//		beanOne.doSomthing();
//		
	}

}
