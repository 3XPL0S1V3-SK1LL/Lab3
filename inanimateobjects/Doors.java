package inanimateobjects;

public class Doors { //создаем класс дверей
    private boolean isClosed;
    public boolean getIsClosed() {
        return isClosed;
    }
    public void setIsClosed(boolean status) {
        this.isClosed = status;
    }
    String toString(boolean isClosed){
        if (isClosed) { return "Дверь закрыта";}
        return "Дверь открыта";
    }
    public Doors(Place fromPlace, Place toPlace) {
        isClosed = true;
        System.out.println("Дверь из " + fromPlace.getPlace().getValue() + " в " + toPlace.getPlace().getValue() + " создана");
    }
    public void open(){
        if (getIsClosed()){
            setIsClosed(false);
            System.out.println(toString(getIsClosed()));
        }
        else {System.out.println("Дверь уже открыта");}
    }
    void close() {
        if (!getIsClosed()) {
            System.out.println("Дверь уже закрыта");
        } else {
            setIsClosed(true);
            System.out.println(toString(getIsClosed()));
        }
    }
}


