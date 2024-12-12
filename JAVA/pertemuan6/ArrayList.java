import java.util.ArrayList;
public class ArrayList
{
    public static void main(String[] args)
    {
    
        //deklarasi list dari objek
        ArrayList<Mobil> listMobil = new
        ArrayList<Mobil>();
        
        //instance setiap member list dengan menambahkan kedalam list
        for(int i=0;i<10;i++)
        listMobil.add(new ArrayList());

        //akses setter getter method dari setiap member
        for(int i=0;i<10;i++)
        listMobil.get(i).setPlat("A11.2020."+(i+1));
        
        for(int i=0;i<10;i++)
        System.out.println(listMobil.get(i).getPlat());
    }
}
