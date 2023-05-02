package com.mariacoder.demoreactive.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.mariacoder.demoreactive.model.Student;

import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

	Flux<Student> findAllByFirstnameIgnoreCase(String firstname);
}
