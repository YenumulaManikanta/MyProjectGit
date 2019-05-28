package com.main.meth;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.cnstr.A;
import com.cnstr.B;

public class MainSpring {

	public static void main(String[] args) {
		BeanFactory fact=new XmlBeanFactory(new FileSystemResource("src/com/xmlc/appcontext.xml"));
		A a=(A) fact.getBean("a", A.class);
		B b=(B) fact.getBean("b", B.class);
		System.out.println(a+" "+b);

	}

}
