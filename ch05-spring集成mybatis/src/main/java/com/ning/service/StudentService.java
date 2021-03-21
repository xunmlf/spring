package com.ning.service;

import com.ning.domain.Student;

import java.util.List;

/**
 * @author XUN~MLF
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
