package studiKasus21;

public class Tes {
    
    static void behavior(Karyawan p){
        if(p instanceof SupirTravel){
            SupirTravel t = (SupirTravel)p;
            t.travel();
        } else if(p instanceof SupirRentCar){
            SupirRentCar t = (SupirRentCar)p;
            t.sewa();
        }
    }

    public static void main(String[] args) {

        Karyawan supirTravel1 = new SupirTravel("hakim",18,"depok","901850","pria","supirTravel","50 km");
        supirTravel1.print();
        behavior(supirTravel1);
        System.out.println("==============================");
        Karyawan supirRentCar1 = new SupirRentCar("budi",25,"malang","901850","pria","supirTravel","3 hari");
        supirRentCar1.print();
        behavior(supirRentCar1);
    }

}
