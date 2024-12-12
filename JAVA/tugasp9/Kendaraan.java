public class Kendaraan {
    private String merek;
    private int tahun;

    public Kendaraan(String merek, int tahun) {
        this.merek = merek;
        this.tahun = tahun;
    }

    public void info() {
        System.out.println("Merek: " + merek + ", Tahun: " + tahun);
    }
}
