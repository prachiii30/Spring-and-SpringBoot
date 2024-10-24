package com.prachi.Spring_Data_JpaExample;

import com.prachi.Spring_Data_JpaExample.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaExampleApplication.class, args);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		StudentRepo repo=context.getBean(StudentRepo.class);

		s1.setRollNo(101);
		s1.setName("Prachi");
		s1.setMarks(89);

		s2.setRollNo(102);
		s2.setName("Youvraj");
		s2.setMarks(59);

		s3.setRollNo(103);
		s3.setName("Utakrsh");
		s3.setMarks(99);

		//to insert into the table
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		//to fetch all record
//		System.out.println(repo.findAll());

		//to fetch one record
		System.out.println(repo.findById(101)) ;

//		it migth be possible that it contains the null value so the better option is

		Optional<Student> s=repo.findById(102);
		System.out.println(s.orElse(new Student()));

		System.out.println(repo.findByName("Prachi"));

//		to update
		s2.setRollNo(102);
		s2.setName("Youvi");
		s2.setMarks(59);

		repo.save(s2);
		repo.delete(s3 );






	}

}
