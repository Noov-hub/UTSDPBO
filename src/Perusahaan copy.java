/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/
import java.util.*;

class Perusahaan {
    private String id;
    private String nama;
    private PemilikPerusahaan pemilik;
    private String alamat;
    private int tahunBerdiri;
    private int jumlahKaryawan;
    private List<Produk> daftarProduk = new ArrayList<>();

    public Perusahaan(String id, String nama, PemilikPerusahaan pemilik, String alamat, int tahun, int karyawan) {
        this.id = id;
        this.nama = nama;
        this.pemilik = pemilik;
        this.alamat = alamat;
        this.tahunBerdiri = tahun;
        this.jumlahKaryawan = karyawan;
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public PemilikPerusahaan getPemilik() { return pemilik; }
    public String getAlamat() { return alamat; }
    public int getTahunBerdiri() { return tahunBerdiri; }
    public int getJumlahKaryawan() { return jumlahKaryawan; }

    public void displayInfo() {
        System.out.println("Perusahaan: " + nama + ", Pemilik: " + pemilik.getNama());
        System.out.println("  Produk:");
        for (Produk p : daftarProduk) {
            System.out.println("    - " + p.getNama());
        }
    }
}