package br.com.ds.securityspring.controllers;

import br.com.ds.securityspring.models.Student;
import br.com.ds.securityspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    private StudentRepository repository;

    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Student> listAll() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Student findStudent(@PathVariable Integer id) {
        return repository.findByStudentId(id);
    }

    @PostMapping
    public Student addStudent(@RequestParam String name, @RequestParam Integer age) {
        Student student = new Student(name, age);
        repository.save(student);

        return student;
    }

}
