package org.scoula.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// @ComponentScan이 진행되면
// Spring Container에 해당 클래스 내용으로 Bean이 등록됨

@Component
// 빈 이름: parrot (클래스명의 camelCase)
// 디폴트 컴포넌트의 name : 클래스명의 camelCase - parrot
public class Parrot {
    private String name;

    @PostConstruct
    public void init(){
        this.name="KiKi";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
