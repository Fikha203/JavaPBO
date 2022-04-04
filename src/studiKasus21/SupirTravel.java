package studiKasus21;

public class SupirTravel extends Karyawan {
    
    private String jarakTempuh;
    public SupirTravel(String nama, int umur, String alamat, String noTelp, String kelamin, String kategori, String jarakTempuh){
        super(nama,umur,alamat,noTelp,kelamin,kategori);
        this.jarakTempuh = jarakTempuh;
        
    }
    
    public void print(){
        super.print();
        System.out.println("jarak tempuh : " + jarakTempuh);
    }
    public void travel(){
        System.out.println("Mobil berangkat menuju tujuan");
    }
}
