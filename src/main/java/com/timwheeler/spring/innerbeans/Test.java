package com.timwheeler.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerBeanConfig.xml");

        Employee employee = (Employee) context.getBean("employee");

        System.out.println(employee);

    }
}