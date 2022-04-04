package RecordAndEnum;

public class Coffee {

    private Size size;

    public Coffee(Size size) {
        this.size = size;
    }

    public double getPrice() {
        switch (size) {
            case SMALL:
                return 20.0;
            case MEDIUM:
                return 30.0;
            case LARGE:
                return 40.0;
            default:
                return 0;
        }
    }

    public void printEnum() {
        for (Size s : Size.values()){
            System.out.println(s);
        }
    }
}
