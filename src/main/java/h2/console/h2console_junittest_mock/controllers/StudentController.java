package h2.console.h2console_junittest_mock.controllers;

import h2.console.h2console_junittest_mock.entities.Student;
import h2.console.h2console_junittest_mock.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @Value("${text-prop}")
    private String textValue;

    @GetMapping("list")
    public List<Student> getList() {
        System.out.println("text-prop :"+textValue);
        return studentService.findAll();
    }
}
