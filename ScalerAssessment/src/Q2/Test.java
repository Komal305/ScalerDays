package Q2;


class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

//    Parent constructor followed by Child constructor
//    Compilation Error
//    Parent constructor
//    Child constructor