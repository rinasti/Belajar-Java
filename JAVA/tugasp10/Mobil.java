public class Mobil {
    private String tipeMobil;
    private double hargaMobil;

    public Mobil(String tipe, double harga) {
        this.tipeMobil = tipe;
        this.hargaMobil = harga;
    }

    public double getHargaMobil() {
        return hargaMobil;
    }

    public String getTipeMobil() {
        return tipeMobil;
    }
}
