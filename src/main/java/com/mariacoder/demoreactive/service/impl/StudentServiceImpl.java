package com.mariacoder.demoreactive.service.impl;

import org.springframework.stereotype.Service;

import com.mariacoder.demoreactive.model.Student;
import com.mariacoder.demoreactive.repository.StudentRepository;
import com.mariacoder.demoreactive.service.StudentService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	@Override
	public Mono<Student> save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Flux<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Mono<Student> findById(Integer id) {
		return studentRepository.findById(id);
	}
}
