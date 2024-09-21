package com.Prachi.SpringJDBCusingH2;

import com.Prachi.SpringJDBCusingH2.Service.StudentService;
import com.Prachi.SpringJDBCusingH2.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCusingH2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringJdbCusingH2Application.class, args);
//		System.out.println("hey");

		Student s=context.getBean(Student.class);
		s.setRoll(104);
		s.setName("Kaddu");
		s.setMarks(99);

		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);

		List<Student> students=service.getStudents();
		System.out.println(students);


	}

}
