package cz.kudrnto2.springbootjpa.dao;

import cz.kudrnto2.springbootjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
