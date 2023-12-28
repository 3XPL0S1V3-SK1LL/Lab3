package livingthings;

import java.util.ArrayList;
import java.util.Objects;

import inanimateobjects.*;
import livingthings.abilities.Abilities;

public class Human{
    private String name;
    private int age;
    private String cloth;
    private String sex;
    private Places place;
    public static enum Sex{
        MALE,
        FEMALE;
    }
    private ArrayList<Abilities> Abilities = new ArrayList<Abilities>(); //список умений
    public void setPlace(Places place){
        this.place = place;
    }
    public Places getPlace(){
        return this.place;
    }
    public void setSex (Sex sex_){
        if (sex_ == Sex.MALE) {sex = "Мальчик";}
        if (sex_ == Sex.FEMALE) {sex = "Девочка";}
    }
    public String getSex(){
        return sex;
    }

    public  void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setCloth(String cloth){
        this.cloth = cloth;
    }
    public String getCloth(){
        return cloth;
    }
    public void setAbilities(ArrayList<Abilities> Abilities){
        this.Abilities = Abilities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(cloth, human.cloth) && Objects.equals(sex, human.sex) && Objects.equals(Abilities, human.Abilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cloth, sex, Abilities);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cloth='" + cloth + '\'' +
                ", sex='" + sex + '\'' +
                ", Abilities=" + Abilities +
                '}';
    }

    public ArrayList<Abilities> getAbilities() {
        return Abilities;
    }
    public boolean addAbility(Abilities newAbility) {
        System.out.println(this.getName() + " теперь умеет " + newAbility.getName()
                + " (" + newAbility.getDetails()+ ")");
        Abilities.add(newAbility);
        return true;
    }
    public void changePlace(Places toPlace){
        if(toPlace == place){
            System.out.println(getName() + " И так уже на этом месте!");
        }
        else {
            System.out.println(getName() + " перешел из " + place.getValue() + " в " + toPlace.getValue() + " !");
            setPlace(toPlace);
        }
    }
    public void climbTheStairs(Places downPlace, Places upPlace){
        System.out.println(getName() + " Поднимается по лестнице, ведущей из " + downPlace.getValue() + " на " + upPlace.getValue());
    }
    public void climbTheStairs(Places upPlace, Places downPlace, int hight, double width){
        if (upPlace != downPlace) {
            System.out.println(getName() + " Поднимается по" + Stairs.toString(width) + " и " + Stairs.toString(hight) +
                    "лестницце ведущей из " + downPlace.getValue() + " на " + upPlace.getValue());
            IntStairs.creak();
            IntStairs.creak();
            IntStairs.creak();
        }
        else{
            System.out.println("Невозможно создать лестницу");
        }
    }
    public void goDownTheStairs(Places upPlace, Places downPlace, int hight, double width){
        if (upPlace != downPlace & hight > 5 & width > 0.3) {
            Place fromPlace = new Place();
            fromPlace.setType(upPlace);
            Place toPlace = new Place();
            toPlace.setType(downPlace);
            System.out.println(getName() + " Спусткается по " + Stairs.toString(width) + " и " + Stairs.toString(hight) +
                    "лестнице ведущей из " + downPlace.getValue() + " на " + upPlace.getValue());
            IntStairs.creak();
            IntStairs.creak();
            IntStairs.creak();
        }
        else{
            System.out.println("Невозможно создать лестницу");
        }
    }


}

