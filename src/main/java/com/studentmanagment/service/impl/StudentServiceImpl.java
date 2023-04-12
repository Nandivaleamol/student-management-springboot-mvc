package com.studentmanagment.service.impl;

import com.studentmanagment.entity.Student;
import com.studentmanagment.repository.StudentRepository;
import com.studentmanagment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student Not Found With Id: "+id));
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student, int id) {
        var existStudent = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found With Id " + id));
        existStudent.setName(student.getName());
        existStudent.setEmail(student.getEmail());
        existStudent.setMobileNo(student.getMobileNo());

        return studentRepository.save(existStudent);
    }

    @Override
    public void deleteStudent(int id) {
        var student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student Not Found With Id " + id));
        studentRepository.delete(student);
    }
}
