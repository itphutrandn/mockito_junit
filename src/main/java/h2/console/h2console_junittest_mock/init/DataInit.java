package h2.console.h2console_junittest_mock.init;

import h2.console.h2console_junittest_mock.entities.Student;
import h2.console.h2console_junittest_mock.services.IStudentService;
import h2.console.h2console_junittest_mock.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {

    @Autowired
    private StudentServiceImpl studentService;

    public void init() {
        studentService.save(new Student(1,"Nguyen Van A"));
        studentService.save(new Student(2,"Nguyen Van B"));
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        init();
    }
}
