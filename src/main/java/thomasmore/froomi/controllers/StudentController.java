package thomasmore.froomi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thomasmore.froomi.model.Student;
import thomasmore.froomi.repositories.StudentRepository;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/studentList")
    public String studentList(Model model){
        Iterable<Student> students = studentRepository.findAll();

        model.addAttribute("students", students);
        return "studentList";
    }
}
