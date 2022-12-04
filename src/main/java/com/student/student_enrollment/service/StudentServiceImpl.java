package com.student.student_enrollment.service;

import com.student.student_enrollment.model.Student;
import com.student.student_enrollment.repository.StudentRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepositroy studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
