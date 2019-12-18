package cz.kudrnto2.springbootjpa.service;

import cz.kudrnto2.springbootjpa.dao.StudentRepository;
import cz.kudrnto2.springbootjpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    private Student student;

    @PostConstruct
    public void initDB(){
        this.student = new Student("Karel", "Novák");
        repository.save(student);

        this.student = new Student("Joe", "Doe");
        repository.save(student);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

}
