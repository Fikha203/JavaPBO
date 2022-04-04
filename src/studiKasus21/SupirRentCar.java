package studiKasus21;

public class SupirRentCar extends Karyawan {

    private String lamaMenyewa;

    public SupirRentCar(String nama, int umur, String alamat, String noTelp, String kelamin, String kategori, String lamaMenyewa) {
        super(nama, umur, alamat, noTelp, kelamin, kategori);
        this.lamaMenyewa = lamaMenyewa;
    }
    
    public void print(){
        super.print();
        System.out.println("lamaMenyewa : " + lamaMenyewa);
    }
    public void sewa(){
        System.out.println("Kendaraan telah di sewa");
    }
            
}
