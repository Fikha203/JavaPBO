package innerClass;


public class C {
    public static void main(String[] args) {
        A.B b = new A().new B(); //kelas B dibuat di luar kelas A 
        b.methodPadaB();
        //B d = new B(); gabisa
        A a = new A();
        a.methodPadaA();
    }
}
