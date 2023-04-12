package com.studentmanagment.controller;

import com.studentmanagment.entity.Student;
import com.studentmanagment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    // handler method to handle list student and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    // create new student form
    @GetMapping("/students/new")
    public String createStudent(Model model){
        //create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute ("student") Student student){
        studentService.createStudent(student);
        return "redirect:/api/students";
    }

    @GetMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable int id, Model model){
        model.addAttribute("student",studentService.getStudent(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable int id, @ModelAttribute("student") Student student, Model model){

        // get student from database by id
        var existingStudent = studentService.getStudent(id);

        existingStudent.setId(student.getId());
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setMobileNo(student.getMobileNo());

        //save update student object
        studentService.updateStudent(existingStudent, id);

        return "redirect:/api/students";
    }

    // handler method to handle delete student request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "redirect:/api/students";
    }
}
