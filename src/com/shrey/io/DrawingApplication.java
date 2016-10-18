package com.shrey.io;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	
	public static void main(String[] args){
	
		//old deprecated resource
		//	BeanFactory factory = new XmlBeanFactory (new FileSystemResource("spring.xml")) ;	
		ApplicationContext context = new ClassPathXmlApplicationContext("file:spring.xml");
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();
	}
}
