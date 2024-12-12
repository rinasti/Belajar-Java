public class Ayam extends Hewan
{
    public void bernapas()
    {
        System.out.println("aku bernapas");
    }
    public static void main(String[] args)
    {
        Ayam kutuk = new Ayam();
        kutuk.bisaTerbang(true);
        System.out.println("Apakah bisa terbang:"+kutuk.isTerbang());
        kutuk.bernapas();
        System.out.println("Apakah benda hidup:"+kutuk.isHidup());
    }
}
