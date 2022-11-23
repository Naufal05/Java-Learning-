interface A {
    void a();// empty methods

    void b();

    void c();

    void d();
}

// creating abstract class that provides the implementation of one method c
abstract class B implements A {
    public void c() {
        System.out.println("I am C");
    }
}

// creating subclass of abstract class, now we need to provide

class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }

}

// creating a test class that calls the methods of A interface

class Tests {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}