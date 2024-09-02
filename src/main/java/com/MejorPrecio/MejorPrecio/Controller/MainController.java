package com.MejorPrecio.MejorPrecio.Controller;

import com.MejorPrecio.MejorPrecio.Model.Student;
import com.MejorPrecio.MejorPrecio.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    StudentRepository studentRepository;

        @PostMapping("/addStudent")
        public void addStudent(@RequestBody Student student) {
            studentRepository.save(student);
        }
}
