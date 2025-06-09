package org.scoula.app;

import org.scoula.config.ProjectConfig;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p  = context.getBean(Parrot.class);
        System.out.println(p.getName());

//        Parrot p2 = context.getBean(Parrot.class);
//        System.out.println(p2.getName());
//
//        System.out.println(p == p2);

        String s = context.getBean(String.class);
        System.out.println(s);

        // 이름으로 빈 객체 얻기 - (이름 , 타입)
        String s2 = context.getBean("hello", String.class);
        System.out.println(s2);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
