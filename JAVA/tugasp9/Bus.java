public class Bus extends MobilBerat {
    private int jumlahKursi;

    public Bus(String merek, int tahun, int jumlahPintu, double kapasitasMuatan, int jumlahKursi) {
        super(merek, tahun, jumlahPintu, kapasitasMuatan);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}
