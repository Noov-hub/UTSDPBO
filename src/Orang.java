/*Saya Ibnu Fadhilah dengan NIM 2300613 mengerjakan UTS dalam mata kuliah Desain dan
        Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan
        seperti yang telah dispesifikasikan. Aamiin.
*/

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
