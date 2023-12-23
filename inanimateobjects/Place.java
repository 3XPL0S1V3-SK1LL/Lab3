package inanimateobjects;

public class Place { // Данный класс помогает нам отслеживать объект, перемещать его
    private String name;
    private Places type;
    public Place(){ }
    public Place(String name){
        this.name = name;
        System.out.println("Создано место - " + this.name);
    }
    public String getType(){
        this.type = type;
        String typeName = "";
        switch(this.type){
            case BEDROOM : typeName = "Спальная";
                break;
            case STAIRS : typeName = "Лестница";
                break;
            case HALL : typeName = "Коридор";
                break;
            case ATTIC: typeName = "Чердак";
                break;
        }
        return typeName;
    }
    public void setType(Places type){
        this.type = type;
    }
}
