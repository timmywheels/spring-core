package com.timwheeler.spring.lifecycle.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("interfaceConfig.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient.getId());
        System.out.println(patient.toString());
        context.registerShutdownHook();
    }
}