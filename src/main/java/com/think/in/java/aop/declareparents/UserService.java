package com.think.in.java.aop.declareparents;

@org.springframework.stereotype.Service
public class UserService implements Service {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}
