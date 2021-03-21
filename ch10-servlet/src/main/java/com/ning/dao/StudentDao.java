package com.ning.dao;

import com.ning.domain.Student;

import java.util.List;

/**
 * @author XUN~MLF
 */
public interface StudentDao {
    int studentInsert(Student student);
    List<Student> selectStudents();
}
