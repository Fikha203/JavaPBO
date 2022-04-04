package RecordAndEnum;

public class Test {

    public static void main(String[] args) {
        Coffee c = new Coffee(Size.SMALL);
        System.out.println("Harga : " + c.getPrice());
        c.printEnum();
        System.out.println(Size.LARGE.compareTo(Size.SMALL));
        System.out.println(Size.SMALL.name());
    }

}
