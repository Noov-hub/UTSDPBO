/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
import java.util.ArrayList;

public class Marketplace {
    private String id;
    private String nama;
    private Perusahaan perusahaanPemilik;
    private int tahunBerdiri;
    private int jumlahKaryawan;
    private ArrayList<PerusahaanPengiriman> ekspedisiKerjaSama;

    public Marketplace(String id, String nama, Perusahaan pemilik, int tahun, int karyawan) {
        this.id = id;
        this.nama = nama;
        this.perusahaanPemilik = pemilik;
        this.tahunBerdiri = tahun;
        this.jumlahKaryawan = karyawan;
        this.ekspedisiKerjaSama = new ArrayList<>();
    }

    public void tambahEkspedisi(PerusahaanPengiriman ekspedisi) {
        ekspedisiKerjaSama.add(ekspedisi);
    }

    public void displayInfo() {
        System.out.println("Marketplace: " + nama + ", Dimiliki oleh: " + perusahaanPemilik.getNama());
        System.out.println("Ekspedisi Bekerja Sama:");
        for (PerusahaanPengiriman eksp : ekspedisiKerjaSama) {
            System.out.println("  - " + eksp.getNama());
        }
    }
}
