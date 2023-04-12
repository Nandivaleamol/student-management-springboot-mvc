package com.studentmanagment;

import com.studentmanagment.entity.Student;
import com.studentmanagment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSpringbootMvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSpringbootMvcApplication.class, args);

	}

	@Autowired
	private StudentService studentService;

	@Override
	public void run(String... args) throws Exception {
		
		/*var amol = new Student("Amol", "amol@gmail.com", "9898734327");
		var ramesh = new Student("Ramesh", "ramesh@gmail.com", "9898731233");
		var sanjay = new Student("Sanjay", "sanjay@gmail.com", "9898734223");
		var sagar = new Student("Sagar", "sagar@gmail.com", "9898734301");

		studentService.createStudent(amol);
		studentService.createStudent(ramesh);
		studentService.createStudent(sanjay);
		studentService.createStudent(sagar);
		System.out.println("Done");*/

	}
}
