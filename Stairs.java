
package inanimateobjects;

public class Stairs extends AbsStairs {
    private boolean isBroken;
    public Places upPlace;
    public Places downPlace;
    public int height;
    public double width;
    public Stairs(){
        System.out.println("Создана Лестница");
    }
    public Stairs(Places upPlace, Places downPlace){
        if (downPlace != upPlace) {
            this.upPlace = upPlace;
            this.downPlace = downPlace;
            System.out.println("Создана Лестница из" + downPlace.getValue() + " в " + upPlace.getValue());
        }
        else{
            System.out.println("Невозможно создать лестницу");
        }
    }
    public Stairs(Places upPlace, Places downPlace, int hight, double width){
        if(upPlace != downPlace & hight > 5 & width > 0.3) {
            this.upPlace = upPlace;
            this.downPlace = downPlace;
            System.out.println("Лестница" + toString(width) + " и " + toString(hight) +
                    " ведущая из " + downPlace.getValue() + " в " + upPlace.getValue() + " создана!");
        }
        else{
            System.out.println("Невозможно создать лестницу");
        }

    }
    public static String toString(double width){
        if (width <= 0.5) {return " узкая ";}
        if (width > 0.5 & width<=1.0) {return "нормального размера в ширину";}
        return "широкая";
    }
    static String toString(int hight){
        if (hight <= 10) {return " маленькая ";}
        if (hight<=15) {return "нормального размера в высоту";}
        return "высока";
    }

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

