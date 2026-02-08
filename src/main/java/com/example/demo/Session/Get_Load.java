package com.example.demo.Session;

import com.example.demo.entity.Student;
import org.hibernate.Session;

public class Get_Load {
    public static void main(String[] args) {
        Session getSession = HibernateUtil
                .getSessionFactory()
                .openSession();

        getSession.beginTransaction();
        Student student=getSession.get(Student.class,1);

        if(student!=null){
            System.out.println("Name"+student.getName());
            System.out.println("Age"+student.getAge());
            }
    }
}
