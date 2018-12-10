package com.think.in.java.aop.declareparents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @DeclareParents(value="com.think.in.java.aop.declareparents.UserService",
            defaultImpl=com.think.in.java.aop.declareparents.BasicVerifier.class)
    public Verifier verifer;
}