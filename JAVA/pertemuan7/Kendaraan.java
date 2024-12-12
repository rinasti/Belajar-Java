public class Kendaraan {
    private String nama;
    private int tahunProduksi;

    public String getNama(){
    return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }
    public Kendaraan(){ //overloading method, ingat.. kontruktor juga merupakan method
    
    }
    public Kendaraan(String nama, int tahunProduksi){ //overloading method
        setNama(nama);
        setTahunProduksi(tahunProduksi);
    }
    public void cetak(){//overriding method
        System.out.println("Nama\t\t= "+nama);
        System.out.println("Tahun Produksi = "+tahunProduksi);
    }
}
