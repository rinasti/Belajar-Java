public class Truk extends MobilBerat {
    private int jumlahRoda;

    public Truk(String merek, int tahun, int jumlahPintu, double kapasitasMuatan, int jumlahRoda) {
        super(merek, tahun, jumlahPintu, kapasitasMuatan);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

