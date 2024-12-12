public class PesawatDemo {
    public static int min2(int a, int b){
        if(a<b)
            return  a;
        else
            return b;
    }

    public static boolean isNamaSama(Pesawat p1, Pesawat p2){

if(p1.getNama().toLowerCase().equals(p2.getNama().toLowerCase()))
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Pesawat[] p = new Pesawat[3];
        p[0] = new Pesawat();
        p[1] = new Pesawat("Garuda Boeing 777", 1990, true, 305);
        p[2] = new Pesawat("Citilink Airbus A320", 1988, true, 150);
        p[0].reset("Wings Air ATR 72-500", 1988, false, 72);

        p[0].cetak(); System.out.println("");
        p[1].cetak(); System.out.println("");
        p[2].cetak(); System.out.println("");

        System.out.print("Nama pesawat pertama dan kedua ");
        if(isNamaSama(p[0], p[1]))
            System.out.println("sama");
        else
            System.out.println("tidak sama");

        System.out.print("");
        if(p[0].getMuatan()<min2(p[1].getMuatan(), p[2].getMuatan()))
            System.out.println("Muatan paling sedikit = "+p[0].getNama());
        else if(p[1].getMuatan()<min2(p[0].getMuatan(),p[2].getMuatan()))
            System.out.println("Muatan paling sedikit = "+p[1].getNama());
        else
            System.out.println("Muatan paling sedikit = "+p[2].getNama());
    }
}
