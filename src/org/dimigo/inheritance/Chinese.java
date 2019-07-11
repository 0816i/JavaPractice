package org.dimigo.inheritance;

public class Chinese extends Person {

    public Chinese(String name) {
        super(name);
    }

    void sayHello() {
        System.out.println("니하오");
    }

    void sayBye() {
        System.out.println("쨔이찌엔");
    }

    @Override
    public String toString() {
        return "저는 중국사람 " + getName() + "입니다.";
    }
}
