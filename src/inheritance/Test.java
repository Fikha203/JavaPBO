package inheritance;

public class Test {

    static void pajak(Pegawai p) {
        p.print();
        if (p instanceof Manajer || p instanceof Sekretaris){
            Manajer m = (Manajer)p;
            m.manage();
        }
        System.out.println("Terima kasih anda telah membayar pajak");
    }

    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("Indri", 1000.0);
        pegawai1.setNama("Indri");
        pegawai1.setGaji(1000.0);
        pegawai1.print();
        //pegaw@ai1..nama="Indriati";
        Pegawai manajer1 = new Manajer("Chiko", 4000.0, "Pergudangan");
        manajer1.print();
        Pegawai sekretaris = new Sekretaris("Sasha", 5000.0, "Fron Office");
        sekretaris.print();
        Manajer manajer2 = new Manajer("Chika", 3000.0, "Pemasaran");
        //manajer2.nama="choki";
        manajer2.setNama("Chika");
        manajer2.setGaji(3000.0);
        manajer2.setDepartemen("Pemasaran");
        manajer2.print();
        //System.out.println("Departemen:"+manajer2.getDepartemen());
        System.out.println("==================================");
        pajak(manajer1);
        System.out.println("==================================");
        pajak(sekretaris);
        System.out.println("==================================");
        pajak(manajer2);
    }
}
