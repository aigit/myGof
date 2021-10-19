package org.pattern.protype.protype;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Student implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public void show(){
        log.info("我的名字:{}",name);
    }
}
