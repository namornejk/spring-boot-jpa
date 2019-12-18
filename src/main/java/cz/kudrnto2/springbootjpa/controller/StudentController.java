package cz.kudrnto2.springbootjpa.controller;

import cz.kudrnto2.springbootjpa.model.Student;
import cz.kudrnto2.springbootjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    @ResponseBody
    public String studentWriter(){
        String students = "";
        for (Student s : studentService.getStudents()) {
            students = students + s.getName() + " " + s.getSecondName() + "|";
        }
        return students;
    }
}
