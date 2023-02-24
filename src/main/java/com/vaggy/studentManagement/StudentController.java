package com.vaggy.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer,Student> db = new HashMap<>();


    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int AdmNo){
         return db.get(AdmNo);
    }

    @PostMapping("/add")
    String addStudent(@RequestBody Student student){
        db.put(student.getAdmNo(),student);
        return "Student is added";
    }

    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int AdmNo){
        db.remove(AdmNo);
        return "Student has been deleted";
    }


}
