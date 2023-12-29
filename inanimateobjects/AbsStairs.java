package inanimateobjects;
public abstract class AbsStairs implements IntStairs {
    private boolean isBroken;
    public boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(boolean status) {
        this.isBroken = status;
    }
    @Override
    public void breakDown() {
        setIsBroken(false);
    }
    @Override
    public void beRapaired() {
        setIsBroken(true);
    }

}
