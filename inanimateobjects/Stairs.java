
package inanimateobjects;

public class Stairs implements IntStairs {
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
    public boolean getIsBroken() {
        return isBroken;
    }

    public void setIsBroken(boolean status) {
        this.isBroken = status;
    }
    public Place getUpPlace() {
        return upPlace;
    }

    public Place getDownPlace() {
        return downPlace;
    }

    public Stairs(Place upPlace, Place downPlace) {
        isBroken = false;
        this.upPlace = upPlace;
        this.downPlace = downPlace;
        if (getWidth() != 0 & getHeight() != 0) {
            if (getUpPlace() != getDownPlace() & getHeight() > 5 & width > 0.3) {
                System.out.println("Лестница" + getDescriptionWidth(getWidth()) + " и " + getDescriptionHight(getHeight()) +
                        " ведущая из " + downPlace.getValue() + " в " + upPlace.getValue() + " создана!");
            }
            else {
                System.out.println("Невозможно создать лестницу");
            }

        }
        else {
            if (getUpPlace() != getDownPlace()) {
                System.out.println("Создана Лестница из" + downPlace.getValue() + " в " + upPlace.getValue());
            }
            else {
                System.out.println("Невозможно создать лестницу");
            }
        }
    }
    public String getDescriptionWidth(double width) {
        if (width <= 0.5) {
            return " узкая ";
        }
        if (width > 0.5 & width<=1.0) {
            return "нормального размера в ширину";
        }
        return "широкая";
    }
    public String getDescriptionHight(int hight) {
        if (hight <= 10) {
            return " маленькая ";
        }
        if (hight<=15) {
            return "нормального размера в высоту";
        }
        return "высокая";
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

