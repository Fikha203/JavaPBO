/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassandObject;

public class Car {
// attribute declarations  

    String color;
    int speed;
    int power;

public Car(){}
    public Car(String color){
        this.color=color;                    
    }
    public Car(String color, int speed){
        this.color=color;
        this.speed=speed;            
    }
    public Car(String color, int speed,int power){
        this.color=color;
        this.speed=speed;
        this.power=power;    
    }
    
    }
    
    
// method declarations
//    public void drive() {
//        System.out.println("drive");
//    }
//
//    public void turnRight() {
//        System.out.println("turnRight");
//    }
//
//    public void turnLeft() {
//        System.out.println("turnLeft");
//    }
//
//    public void stop() {
//        System.out.println("stop");
//    }
//}
