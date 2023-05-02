package com.mariacoder.demoreactive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mariacoder.demoreactive.model.Student;
import com.mariacoder.demoreactive.service.StudentService;

@SpringBootApplication
public class DemoReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoReactiveApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentService studentService) {
		return args -> {
			for(int i = 0; i < 100; i++) {
				studentService.save(Student.builder()
					.firstname("maria " + i)
					.lastname("aguilar " + i)
					.age(i)
					.build()
				).subscribe();
			}
		};
	}

}
