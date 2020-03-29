package test;

import org.springframework.core.io.*;

import beans.Test;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Client {
	public static void main(String args[])
	{
		//find XML
		Resource r =new ClassPathResource("resources/spring.xml");
		//Load XML file into Container
		@SuppressWarnings("deprecation")
		BeanFactory factory =new XmlBeanFactory(r);
		
		//Create test class object
		Object o = factory.getBean("t");
		Test t = (Test)o;
		t.hello();
	}
}
