package com.timwheeler.spring.properties;

import com.timwheeler.spring.map.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLangs");
        System.out.println(countriesAndLanguages.getCountryAndLangs());
        System.out.println(countriesAndLanguages.toString());
    }
}