package org.pattern.protype;

import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");
        student.show();
        Student a = student.clone();
        a.setName("里斯");
        student.show();
        a.show();

    }
}
