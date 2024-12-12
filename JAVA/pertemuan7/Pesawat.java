public class Pesawat extends Udara{
    private int muatan;
    
    public int getMuatan(){
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan = muatan;
    }
    public Pesawat(){//overloading method

    }
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){ //overloading method
        super(nama, tahunProduksi, mesin); //memanggil konstruktor Udara
        setMuatan(muatan);

    }
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
    setNama(nama); //memanggil method setNama dari Kendaraan
    setTahunProduksi(tahunProduksi); //memanggil method setTahunProduksi dari Kendaraan
    setMesin(mesin); //memanggil method setMesin dari Udara
    setMuatan(muatan);
    }
    public String kategori(int muatan){
        if(muatan<=100)
            return "Mini";
        else if(muatan<=200)
            return "Sedang";
        else
            return "Besar";
    }
    public void cetak(){ //overriding metho
        super.cetak();//memanggil method cetak dari Udara
        System.out.println("Muatan \t\t= "+muatan+" orang");
        System.out.println("Kategori\t= "+kategori(muatan));
    }
}

