package inanimateobjects;

public class Place { // Данный класс помогает нам отслеживать объект, перемещать его
    private String name;
    private Places type;
    public Place(){ }
    public Place(String name){
        this.name = name;
        System.out.println("Создано место - " + this.name);
    }
    public void setType(Places type){
        this.type = type;
    }
}
