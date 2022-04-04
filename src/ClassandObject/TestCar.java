package ClassandObject;

public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car("Tosca",1000,150);
//        car1.drive();
        System.out.println("Warna : " + car1.color);
        System.out.println("Power : " + car1.power);
        System.out.println("Speed : " + car1.speed);
        Car car2 = new Car("kuning",1500,100);
        
//        car2.drive();
        System.out.println("Warna : " + car2.color);
        System.out.println("Power : " + car2.power);
        System.out.println("Speed : " + car2.speed);
        Car car3 = new Car("Merah",1200,120);
//        car3.drive();
        System.out.println("Warna : " + car3.color);
        System.out.println("Power : " + car3.power);
        System.out.println("Speed : " + car3.speed);
    }
}
