package com.studentmanagment.service;

import com.studentmanagment.entity.Student;
import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student getStudent(int id);

    List<Student> getAllStudents();

    Student updateStudent(Student student, int id);

    void deleteStudent(int id);
}
