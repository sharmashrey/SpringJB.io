package com.shrey.io;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	
	public static void main(String[] args){
	
	BeanFactory factory = new XmlBeanFactory (new FileSystemResource("spring.xml")) ;	
		Triangle tri = (Triangle) factory.getBean("triangle");
		tri.draw();
	}
}
