package basics1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	public static void main(String[] args) {
		
//		Using XmlBeanFactory
//		ClassPathResource classPathResource = new ClassPathResource("ioc1.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
//		Mobile mobile = (Mobile) beanFactory.getBean("mymobile");
//		mobile.song();
		
		
//		Using ApplicationContext
		ApplsicationContext applicationContext = new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile mobile = (Mobile) applicationContext.getBean("mymobile");
		mobile.song();
	}
}

