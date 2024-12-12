import java.util.ArrayList;
public class TestMahasiswaIndividu{
    public static void main(String[] args)
    {
       
        //deklarasi list dari objek
        ArrayList<MahasiswaIndividu> listMhs = new
ArrayList<MahasiswaIndividu>();
  
        //instance setiap member list dengan menambahkan kedalam list
        for(int i=0;i<10;i++)
            listMhs.add(new MahasiswaIndividu());

        //akses setter getter method dari setiap member
        for(int i=0;i<10;i++)
            listMhs.get(i).setNim("A11.2020."+(i+1));

            for(int i=0;i<10;i++)
                System.out.println(listMhs.get(i).getNim());
    }
}

