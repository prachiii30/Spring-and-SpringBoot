package com.example.SpringJdbc_usingPostgres;

import com.example.SpringJdbc_usingPostgres.model.Student;
import com.example.SpringJdbc_usingPostgres.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
public class SpringJdbcUsingPostgresApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbcUsingPostgresApplication.class, args);
		System.out.println("Hey");

		Student s=context.getBean(Student.class);
		s.setRoll(105);
		s.setName("Prachi");
		s.setMarks(88);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);




	}

}
