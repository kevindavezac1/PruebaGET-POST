package com.MejorPrecio.MejorPrecio.Controller;

import com.MejorPrecio.MejorPrecio.Model.Student;
import com.MejorPrecio.MejorPrecio.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class MainController {
    @Autowired
    StudentRepository studentRepository;

        @PostMapping("/addStudent")
        public void addStudent(@RequestBody Student student) {
            studentRepository.save(student);
        }

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{nro}")
    public Optional<Student> getStudentById(@PathVariable Integer nro) {
        return studentRepository.findById(nro);
    }

}
