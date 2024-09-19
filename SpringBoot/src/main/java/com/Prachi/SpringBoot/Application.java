package com.Prachi.SpringBoot;

import com.Prachi.SpringBoot.repo.LaptopRepo;
import com.Prachi.SpringBoot.Service.LaptopService;
import com.Prachi.SpringBoot.model.Laptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext con= SpringApplication.run(Application.class, args);
		System.out.println("hey");

//		Alien a=con.getBean(Alien.class);
//		a.code();
//		System.out.println( a.getAge());

		LaptopService service =con.getBean(LaptopService.class);
		LaptopRepo laprepo=con.getBean(LaptopRepo.class);

		Laptop lap=con.getBean(Laptop.class);
		service.addLaptop(lap);
		laprepo.save(lap);

	}

}
