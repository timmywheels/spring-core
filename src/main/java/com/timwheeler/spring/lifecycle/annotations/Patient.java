package com.timwheeler.spring.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @PostConstruct
    public void init() {
        System.out.println("Inside init()");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy()");
    }


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }


}
