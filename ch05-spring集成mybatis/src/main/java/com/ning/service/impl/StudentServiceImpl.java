package com.ning.service.impl;

import com.ning.Dao.StudentDao;
import com.ning.domain.Student;
import com.ning.service.StudentService;

import java.util.List;

/**
 * @author XUN~MLF
 */
public class StudentServiceImpl implements StudentService {

    /**引用类型*/
    private StudentDao studentDao;

    /**使用set注入，赋值*/
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return nums;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> studentList = studentDao.selectStudents();
         return studentList;
    }
}
