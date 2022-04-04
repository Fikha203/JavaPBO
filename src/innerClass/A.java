package innerClass;


class A {
    class B {
        int x = 0;//class B ada di dalam class A 
        void methodPadaB() {
            System.out.println("Hello, saya method di kelas B");
            System.out.println("kelas B berada dalam kelas A");
            // System.out.println("x" + A.B.this.x);
        }
    }
    void methodPadaA() {
        B b = new B(); //object b diinstance  pada sebuah method di class A 
        System.out.println("Hello, saya method kelas A");
        System.out.println("Saya membuat object dari inner class B");
        b.methodPadaB();
    }
}
