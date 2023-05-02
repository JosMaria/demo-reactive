package com.mariacoder.demoreactive.service.impl;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.mariacoder.demoreactive.model.Student;
import com.mariacoder.demoreactive.repository.StudentRepository;
import com.mariacoder.demoreactive.service.StudentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
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
		log.info("nueva consulta");
		return studentRepository.findAll().delayElements(Duration.ofSeconds(5L));
	}

	@Override
	public Mono<Student> findById(Integer id) {
		return studentRepository.findById(id);
	}
}
