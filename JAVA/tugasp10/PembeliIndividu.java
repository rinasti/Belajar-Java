public class PembeliIndividu extends Pembeli {
    public PembeliIndividu(String nama) {
        super(nama);
    }

    @Override
    public void beliMobil(Mobil mobil, int jumlah) {
        System.out.println("Pembeli Individu " + namaPembeli + " membeli " + jumlah + " " + mobil.getTipeMobil());
    }
}
