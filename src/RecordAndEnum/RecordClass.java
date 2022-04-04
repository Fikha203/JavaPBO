package RecordAndEnum;


record Rectangle(double length, double width) { }
public class RecordClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        System.out.println(r.toString());
        System.out.println(r.hashCode());
        System.out.println(r.length());
        System.out.println(r.width());
    }    
}
