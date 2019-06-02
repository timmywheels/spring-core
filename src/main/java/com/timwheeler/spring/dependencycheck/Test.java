package com.timwheeler.spring.dependencycheck;

import com.timwheeler.spring.lifecycle.annotations.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyCheckConfig.xml");
        Prescription prescription = (Prescription) context.getBean("prescription");
        System.out.println(prescription.getId());
        System.out.println(prescription.toString());
    }
}