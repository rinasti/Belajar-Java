public class Tumbuhan extends Dedaunan implements MakhlukHidup
{
    public void bernapas()
    {
        System.out.println("aku tidak bernapas");
    }
    public boolean isHidup()
    {
        return true;
    }
    public static void main(String[] args)
    {
        Tumbuhan cemara = new Tumbuhan();
        cemara.bernapas();
        System.out.println("Apakah benda hidup:"+cemara.isHidup());
        cemara.daunBergerak();
    }
}
