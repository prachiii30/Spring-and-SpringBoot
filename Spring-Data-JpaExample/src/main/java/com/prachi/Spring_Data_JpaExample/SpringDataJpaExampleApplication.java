package com.prachi.Spring_Data_JpaExample;

import com.prachi.Spring_Data_JpaExample.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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

		repo.save(s1);
		repo.save(s2);



	}

}
