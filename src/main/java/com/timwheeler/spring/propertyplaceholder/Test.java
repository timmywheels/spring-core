package com.timwheeler.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyPlaceholderConfig.xml");

        MyDAO myDAO = (MyDAO) context.getBean("myDAO");

        System.out.println(myDAO);

    }

}
