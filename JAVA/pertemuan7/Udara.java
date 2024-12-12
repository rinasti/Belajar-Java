public class Udara extends Kendaraan {
    private boolean mesin;

    public boolean getMesin(){
        return mesin;
    }
    public void setMesin(boolean mesin){
        this.mesin = mesin;
    }
    public Udara(){//overloading method

    }
    public Udara(String nama, int tahunProduksi, boolean mesin){
    // overloading method   
    super(nama, tahunProduksi); //memanggil konstruktor Kendaraan
    setMesin(mesin);
    }
    public void cetak(){ //overriding method
        super.cetak(); // memanggil method cetak dari Kendaraan
        System.out.println("Mesin\t\t= ");
        if(mesin==true)
            System.out.println("Jet");
        else
            System.out.println("Baling-baling");
    }
}
