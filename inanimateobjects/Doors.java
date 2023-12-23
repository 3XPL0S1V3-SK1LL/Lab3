package inanimateobjects;

public class Doors { //создаем класс дверей
    private boolean status =  true;

    private boolean toPlace;
    private boolean fromPlace;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    String toString(boolean status){
        if (status) { return "Дверь закрыта";}
        return "Дверь открыта";
    }
    Doors(){
        boolean status = true;
    }
    public Doors(Places fromPlace, Places toPlace) {
        boolean status = true;
        System.out.println("Дверь из " + fromPlace + " в " + toPlace + " создана");
    }

    public void open(){
        if (status){
            setStatus(false);
            System.out.println(toString(status));
        }
        else {System.out.println("Дверь уже открыта");}
    }
    void close(){
        if (!(status)){
            setStatus(true);
            System.out.println(toString(status)); }
        else {System.out.println("Дверь уже закрыта");}
    }
}

