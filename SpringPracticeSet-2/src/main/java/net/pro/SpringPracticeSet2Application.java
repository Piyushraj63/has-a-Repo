package net.pro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import eat.model.Employee;
import net.model.Person;


@SpringBootApplication
public class SpringPracticeSet2Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Using BeanFactory
		Resource resource=new ClassPathResource("spring2.xml");  
        BeanFactory factory=new XmlBeanFactory(resource);          
        Employee s=(Employee)factory.getBean("e");  
        s.show();  
        
        //Using ApplicationContext
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring2.xml"); 
	    Employee obj = (Employee) context.getBean("e");
	    obj.show();
 
	}

}
