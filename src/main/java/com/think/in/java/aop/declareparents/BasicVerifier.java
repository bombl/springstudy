package com.think.in.java.aop.declareparents;

import org.springframework.stereotype.Service;

@Service
public class BasicVerifier implements Verifier {
    @Override
    public boolean validate(User user) {
        if(user.getUsername().equals("jack") && user.getPassword().equals("1234")) {
            return true;
        }
        return false;
    }
}