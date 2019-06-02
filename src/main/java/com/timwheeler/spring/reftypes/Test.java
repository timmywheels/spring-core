package com.timwheeler.spring.reftypes;

import com.timwheeler.spring.set.CarDealer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refTypesConfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getScores());
        System.out.println(student);
    }
}