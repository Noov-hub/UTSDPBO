/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/

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
