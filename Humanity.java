public interface Humanity{ //задаем базовое поведение человека
    void setSex(Sex sex_); //пол
    String getSex();
    void setAge(int age); // сколько лет
    int getAge();
    void setName(String name); // имя
    String getName();
    void setCloth(String cloth); // одежда
    String getCloth();
    void walk(Places fromPlace, Places toPlace); //умение перепещаться
}