import java.util.arraylist;
import java.util.*;

public abstract class Orang {
    protected String noKTP;
    protected String nama;
    protected String alamat;

    // Constructor
    public Orang(String noKTP, String nama, String alamat) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter & Setter
    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Abstract method
    public abstract void displayInfo();
}


public interface Owner {
    void displayInfo();
}


public interface Worker {
    void displayInfo();
}


public abstract class Orang {
    protected String noKTP;
    protected String nama;
    protected String alamat;

    // Constructor
    public Orang(String noKTP, String nama, String alamat) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
    }

    // Getter & Setter
    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Abstract method
    public abstract void displayInfo();
}


public class Karyawan extends Orang implements Worker {
    private String perusahaanTempatBekerja;
    private double gajiPerBulan;

    public Karyawan(String noKTP, String nama, String alamat, String perusahaan, double gaji) {
        super(noKTP, nama, alamat);
        this.perusahaanTempatBekerja = perusahaan;
        this.gajiPerBulan = gaji;
    }

    public String getPerusahaanTempatBekerja() { return perusahaanTempatBekerja; }
    public double getGajiPerBulan() { return gajiPerBulan; }

    public void setPerusahaanTempatBekerja(String perusahaan) { this.perusahaanTempatBekerja = perusahaan; }
    public void setGajiPerBulan(double gaji) { this.gajiPerBulan = gaji; }

    @Override
    public void displayInfo() {
        System.out.println("Karyawan: " + nama + ", Bekerja di: " + perusahaanTempatBekerja + ", Gaji: " + gajiPerBulan);
    }
}




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




class PerusahaanPengiriman {
    private String id;
    private String nama;
    private Perusahaan pemilik;
    private int tahunBerdiri;
    private int jumlahKaryawan;
    private List<PaketPengiriman> daftarPaket = new ArrayList<>();

    public PerusahaanPengiriman(String id, String nama, Perusahaan pemilik, int tahun, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.pemilik = pemilik;
        this.tahunBerdiri = tahun;
        this.jumlahKaryawan = jumlah;
    }

    public void tambahPaket(PaketPengiriman paket) {
        daftarPaket.add(paket);
    }

    public String getId() { return id; }
    public String getNama() { return nama; }

    public void displayInfo() {
        System.out.println("Ekspedisi: " + nama + ", Pemilik: " + pemilik.getNama());
        System.out.println("  Paket yang ditangani:");
        for (PaketPengiriman p : daftarPaket) {
            System.out.println("    - " + p.getIdPaket());
        }
    }
}


class PaketPengiriman {
    private String idBarcode;
    private String alamatTujuan;
    private String namaPenerima;
    private String namaPengirim;
    private String alamatPengirim;
    private PerusahaanPengiriman perusahaanPengirim;

    public PaketPengiriman(String id, String tujuan, String penerima, String pengirim, String alamatPengirim, PerusahaanPengiriman perusahaan) {
        this.idBarcode = id;
        this.alamatTujuan = tujuan;
        this.namaPenerima = penerima;
        this.namaPengirim = pengirim;
        this.alamatPengirim = alamatPengirim;
        this.perusahaanPengirim = perusahaan;
    }

    public String getIdPaket() {
        return idBarcode;
    }

    public void displayInfo() {
        System.out.println("Paket dikirim oleh: " + perusahaanPengirim.getNama() + " kepada " + namaPenerima);
    }
}

class Produk {
    private String id;
    private String namaProduk;
    private double beratProduk;
    private Perusahaan perusahaanPembuat;

    public Produk(String id, String nama, double berat, Perusahaan perusahaan) {
        this.id = id;
        this.namaProduk = nama;
        this.beratProduk = berat;
        this.perusahaanPembuat = perusahaan;
    }

    public String getNama() {
        return namaProduk;
    }

    public void displayInfo() {
        System.out.println("Produk: " + namaProduk + " dibuat oleh " + perusahaanPembuat.getNama());
    }
}


// Main.java


public class Main {
    public static void main(String[] args) {
        // Pemilik Perusahaan
        PemilikPerusahaan pemilik1 = new PemilikPerusahaan("111", "Andi", "Jakarta");
        PemilikPerusahaan pemilik2 = new PemilikPerusahaan("112", "Budi", "Bandung");

        // Perusahaan
        Perusahaan perusahaan1 = new Perusahaan("P001", "PT Maju Jaya", pemilik1, "Jakarta", 2010, 50);
        Perusahaan perusahaan2 = new Perusahaan("P002", "PT Sukses Makmur", pemilik2, "Bandung", 2015, 30);
        pemilik1.tambahPerusahaan(perusahaan1);
        pemilik2.tambahPerusahaan(perusahaan2);

        // Karyawan
        Karyawan karyawan1 = new Karyawan("201", "Rina", "Depok", "PT Maju Jaya", 5000000);
        Karyawan karyawan2 = new Karyawan("202", "Tono", "Bekasi", "PT Sukses Makmur", 4500000);

        // Produk
        Produk produk1 = new Produk("PR01", "Laptop Andi", 2.5, perusahaan1);
        Produk produk2 = new Produk("PR02", "Printer Jaya", 4.0, perusahaan1);
        Produk produk3 = new Produk("PR03", "Tablet Sukses", 1.2, perusahaan2);
        Produk produk4 = new Produk("PR04", "Smartphone Makmur", 0.8, perusahaan2);
        perusahaan1.tambahProduk(produk1);
        perusahaan1.tambahProduk(produk2);
        perusahaan2.tambahProduk(produk3);
        perusahaan2.tambahProduk(produk4);

        // Perusahaan Pengiriman
        PerusahaanPengiriman ekspedisi1 = new PerusahaanPengiriman("EXP01", "JNE", perusahaan1, 2000, 500);
        PerusahaanPengiriman ekspedisi2 = new PerusahaanPengiriman("EXP02", "TIKI", perusahaan2, 2005, 400);

        // Paket Pengiriman
        PaketPengiriman paket1 = new PaketPengiriman("PKT001", "Jl. Merdeka No.1", "Ali", "Arie", "Jl. Jendral No.2", ekspedisi1);
        PaketPengiriman paket2 = new PaketPengiriman("PKT002", "Jl. Gatot Subroto No.3", "Siti", "John", "Jl. Sudirman No.4", ekspedisi2);
        ekspedisi1.tambahPaket(paket1);
        ekspedisi2.tambahPaket(paket2);

        // Marketplace
        Marketplace market1 = new Marketplace("M001", "Tokopaedi", perusahaan1, 2018, 80);
        Marketplace market2 = new Marketplace("M002", "Shopii", perusahaan2, 2020, 70);
        market1.tambahEkspedisi(ekspedisi1);
        market2.tambahEkspedisi(ekspedisi2);

        // Tampilkan semua data
        System.out.println("=== Data Pemilik ===");
        pemilik1.displayInfo();
        pemilik2.displayInfo();

        System.out.println("\n=== Data Perusahaan ===");
        perusahaan1.displayInfo();
        perusahaan2.displayInfo();

        System.out.println("\n=== Data Karyawan ===");
        karyawan1.displayInfo();
        karyawan2.displayInfo();

        System.out.println("\n=== Data Produk ===");
        produk1.displayInfo();
        produk2.displayInfo();
        produk3.displayInfo();
        produk4.displayInfo();

        System.out.println("\n=== Data Perusahaan Pengiriman ===");
        ekspedisi1.displayInfo();
        ekspedisi2.displayInfo();

        System.out.println("\n=== Data Paket Pengiriman ===");
        paket1.displayInfo();
        paket2.displayInfo();

        System.out.println("\n=== Data Marketplace ===");
        market1.displayInfo();
        market2.displayInfo();
    }
}
