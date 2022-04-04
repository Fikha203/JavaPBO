package inheritance;


public class Pegawai {

    private String nama;
    private double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;

    }

    public void print() {
        System.out.println("nama:" + nama);
        System.out.println("gaji:" + gaji);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

}
