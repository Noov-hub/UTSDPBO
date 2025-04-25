/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
import java.util.ArrayList;

public class PemilikPerusahaan extends Orang implements Owner {
    private ArrayList<Perusahaan> daftarPerusahaan;

    public PemilikPerusahaan(String noKTP, String nama, String alamat) {
        super(noKTP, nama, alamat);
        this.daftarPerusahaan = new ArrayList<>();
    }

    public ArrayList<Perusahaan> getDaftarPerusahaan() { return daftarPerusahaan; }

    public void tambahPerusahaan(Perusahaan perusahaan) {
        daftarPerusahaan.add(perusahaan);
    }

    @Override
    public void displayInfo() {
        System.out.println("Pemilik: " + nama);
        for (Perusahaan p : daftarPerusahaan) {
            System.out.println("  Memiliki perusahaan: " + p.getNama());
        }
    }
}
