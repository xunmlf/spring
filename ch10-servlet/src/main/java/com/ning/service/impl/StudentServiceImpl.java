package com.ning.service.impl;

import com.ning.dao.StudentDao;
import com.ning.domain.Student;
import com.ning.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int studentAdd(Student student) {
        int num = studentDao.studentInsert(student);
        return num;
    }

    @Override
    public List<Student> studentServiceSelect() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
