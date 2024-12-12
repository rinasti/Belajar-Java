public abstract class Hewan implements MakhlukHidup
{
    public boolean terbang = false;
    public void bisaTerbang(boolean terbang)
    {
        this.terbang = terbang;
    }

    public boolean isTerbang()
    {
        return this.terbang;
    }
    public abstract void bernapas();

    public boolean isHidup()
    {
        return true;
    }
}
