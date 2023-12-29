
package inanimateobjects;

public class Stairs extends AbsStairs {
    private boolean isBroken;
    private int height;
    private double width;
    private final Place upPlace;
    private final Place downPlace;
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Stairs(Place upPlace, Place downPlace){
        isBroken = false;
        this.upPlace = upPlace;
        this.downPlace = downPlace;
        if(getWidth() != 0 & getHeight() != 0){
            if(upPlace.getPlace() != downPlace.getPlace() & getHeight() > 5 & width > 0.3) {
                System.out.println("Лестница" + toString(width) + " и " + toString(getHeight()) +
                        " ведущая из " + downPlace.getPlace().getValue() + " в " + upPlace.getPlace().getValue() + " создана!");
            }
            else{
                System.out.println("Невозможно создать лестницу");
            }

        }
        else {
            if (upPlace.getPlace() != downPlace.getPlace()) {
                System.out.println("Создана Лестница из" + downPlace.getPlace().getValue() + " в " + upPlace.getPlace().getValue());
            } else {
                System.out.println("Невозможно создать лестницу");
            }
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
    public Place getUpPlace() {
        return upPlace;
    }

    public Place getDownPlace() {
        return downPlace;
    }
}

