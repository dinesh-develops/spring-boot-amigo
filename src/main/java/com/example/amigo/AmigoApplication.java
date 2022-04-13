package com.example.amigo;

import com.example.amigo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoApplication.class, args);
	}
	@GetMapping
	public List<Student> Hello(){
		return List.of(new Student(1,"Dinesh","dineshtech2000@gmail.com",12, LocalDate.of(2000, Month.JANUARY,30)));
	}
}
