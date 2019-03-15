package br.com.ds.securityspring.repository;

import br.com.ds.securityspring.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student findByStudentId(Integer studentId);

}
