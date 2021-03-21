package com.ning.controller;

import com.ning.domain.Student;
import com.ning.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String strId = request.getParameter("id");
        String strName = request.getParameter("name");
        String strEmail = request.getParameter("email");
        String strAge = request.getParameter("age");

        //创建spring的容器对象
//        String config = "spring.xml";
//        ApplicationContext act = new ClassPathXmlApplicationContext(config);

        WebApplicationContext act = null;
        ServletContext sc = getServletContext();
        act = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);

        System.out.println("容器对象的信息===="+act);

        //获取service
        StudentService service = (StudentService) act.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.parseInt(strId));
        student.setName(strName);
        student.setEmail(strEmail);
        student.setAge(Integer.valueOf(strAge));
        System.out.println(student);
        service.studentAdd(student);

        //给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
