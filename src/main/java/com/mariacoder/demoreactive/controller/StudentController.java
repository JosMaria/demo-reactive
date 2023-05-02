package com.mariacoder.demoreactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mariacoder.demoreactive.model.Student;
import com.mariacoder.demoreactive.service.StudentService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	private final StudentService studentService;

	@PostMapping
	public Mono<Student> save(@RequestBody Student student) {
		return studentService.save(student);
	}

	@GetMapping
	public Flux<Student> findAll() {
		return studentService.findAll();
	}

	@GetMapping("/{id}")
	public Mono<Student> findById(@PathVariable("id") Integer id) {
		return studentService.findById(id);
	}
}
