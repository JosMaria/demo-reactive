package com.mariacoder.demoreactive.service;

import com.mariacoder.demoreactive.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

	Mono<Student> save(Student student);

	Flux<Student> findAll();

	Mono<Student> findById(Integer id);

}
