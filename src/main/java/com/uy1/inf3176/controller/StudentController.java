package com.uy1.inf3176.controller;

import com.uy1.inf3176.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stds")
public class StudentController {

    @GetMapping("/list")
    public List<Student> getStds(){
        return List.of(
                new Student("Perrin NJ", "22Z2241", "L3"),
                new Student("Rogers peroonee", "19D4141", "M1"),
                new Student("Kevin debruyne ", "22W2317", "L2"),
                new Student("Erling Haaland", "13Z2257", "M2")
        );
    }

}
