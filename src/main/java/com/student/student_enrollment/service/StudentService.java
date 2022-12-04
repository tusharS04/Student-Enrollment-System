package com.student.student_enrollment.service;

import com.student.student_enrollment.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
