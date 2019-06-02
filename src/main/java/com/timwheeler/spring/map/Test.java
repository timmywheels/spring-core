package com.timwheeler.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mapConfig.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer.getId());
        System.out.println(customer.getProducts());
        System.out.println(customer.toString());
    }
}