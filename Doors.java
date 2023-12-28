package inanimateobjects;

public class Doors { //создаем класс дверей
    private boolean isClosed;

    private boolean toPlace;
    private boolean fromPlace;

    public boolean getStatus() {
        return isClosed;
    }

    public void setStatus(boolean status) {
        this.isClosed = status;
    }

    String toString(boolean isClosed){
        if (isClosed) { return "Дверь закрыта";}
        return "Дверь открыта";
    }
    Doors(){
        boolean status = true;
    }
    public Doors(Places fromPlace, Places toPlace) {
        boolean isClosed = true;
        System.out.println("Дверь из " + fromPlace + " в " + toPlace + " создана");
    }

    public void open(){
        if (isClosed){
            setStatus(false);
            System.out.println(toString(isClosed));
        }
        else {System.out.println("Дверь уже открыта");}
    }
    void close(){
        if (!(isClosed)){
            setStatus(true);
            System.out.println(toString(isClosed)); }
        else {System.out.println("Дверь уже закрыта");}
    }
}

