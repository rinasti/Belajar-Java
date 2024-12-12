public class TestPolymorphism 
{
    public static void main(String[] args)
    {
        Kotak persegi = new Kotak();
        persegi.setColor("Blue");
        ObjekGeometri bentukSem = new ObjekGeometri();
        bentukSem.setColor("Black");

        displayObject(persegi);
        displayObject(new Lingkaran());
        displayObject(bentukSem);
    }
    public static void displayObject(ObjekGeometri obj)
    {
        System.out.println(obj.getColor());
    }
    
}
