package gupta.shanu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
		context.registerShutdownHook();
		//Triangle triangle = (Triangle) context.getBean("triangle");
		//triangle.draw();
		System.out.println(context.getMessage("greeting", null, "default greeting", null));
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
