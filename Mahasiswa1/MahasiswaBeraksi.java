public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa romi = new Mahasiswa("Romi Rahman", "Laki-Laki", 20, "Tambun", "312310581 ", "Teknik Informatika");

        romi.cetakInfo();
        System.out.println("NIM             : " + romi.getNim());
        System.out.println("Jurusan         : " + romi.getJurusan());
    }
}