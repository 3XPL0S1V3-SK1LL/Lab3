package inanimateobjects;
public abstract class AbsStairs implements IntStairs{
    private boolean isBroken;
    private Place upPlace;
    private Place downPlace;
    private double height;
    private double width;
    public boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(boolean status) {
        this.isBroken = status;
    }
    @Override
    public void breakDown(){
        setIsBroken(false);
        System.out.println("О нет! Лестница сломалась!");
    }
    @Override
    public void beRapaired(){
        setIsBroken(true);
        System.out.println("Лестница починена!");
    }

}
