package com.ning.service;

import com.ning.domain.Student;

import java.util.List;

/**
 * @author XUN~MLF
 */
public interface StudentService {
    int studentAdd(Student student);
    List<Student> studentServiceSelect();
}
