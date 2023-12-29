package inanimateobjects;

public class Place { // Данный класс помогает нам отслеживать объект, перемещать его
    public enum Places{ // задаем допустимые места
        BEDROOM("спальня"),
        STAIRS("лестница"),
        HALL("коридор"),
        ATTIC("чердак");
        private final String value;
        private Places(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    private Places place;
    public Place(){
        System.out.println("Создано новое место!");
    }

    public Places getPlace() {
        return place;
    }

     public void setPlace(Places place) {
        this.place = place;
    }
}
