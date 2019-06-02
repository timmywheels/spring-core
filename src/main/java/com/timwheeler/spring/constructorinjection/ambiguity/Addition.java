package com.timwheeler.spring.constructorinjection.ambiguity;

public class Addition {

    Addition(int a, double b) {
        System.out.println("Inside constructor");
    }

//    Addition(int a, int b) {
//        System.out.println("Inside constructor INT");
//    }
//
//    Addition(String a, String b) {
//        System.out.println("Inside constructor STRING");
//    }
}
