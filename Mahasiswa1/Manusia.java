public class Manusia {
    String nama;
    String jenisKelamin;
    int umur;
    String alamat;

    public Manusia(String nama, String jenisKelamin, int umur, String alamat) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetakInfo() {
        System.out.println("Nama            : " + this.nama);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Umur            : " + this.umur);
        System.out.println("Alamat          : " + this.alamat);
    }
}