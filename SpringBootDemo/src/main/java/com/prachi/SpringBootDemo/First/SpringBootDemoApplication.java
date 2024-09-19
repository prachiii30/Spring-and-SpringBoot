package com.prachi.SpringBootDemo.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext c=SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Hey first");

//	programmer obj=new programmer();
//	obj.code();//--manually creating the object

//  now i want spring to create the object


		programmer obj=c.getBean(programmer.class);
		obj.code();

//		programmer2 o=new programmer2();
//		o.fun();
		programmer2 a=c.getBean(programmer2.class);
		a.fun();

	}


}
