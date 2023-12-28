package inanimateobjects;

public enum Places{ // задаем допустимые места
    BEDROOM("спальня"),
    STAIRS("лестница"),
    HALL("коридор"),
    ATTIC("чердак");
    private String value;
    private Places(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}