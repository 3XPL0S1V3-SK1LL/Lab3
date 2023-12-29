package livingthings;

import java.util.ArrayList;
import java.util.Objects;

import inanimateobjects.*;
import livingthings.abilities.Abilities;

public class Human {
    private String name;
    private Sex sex;
    private int age;
    private String cloth;
    private Place place;
    public enum Sex{
        MALE("мальчик"),
        FEMALE("девочка");
        private final String value;
        private Sex(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    private ArrayList<Abilities> Abilities = new ArrayList<Abilities>(); //список умений
    public void setPlace(Place place) {
        this.place = place;
    }
    public Place getPlace() {
        return this.place;
    }
    public  void  setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setCloth(String cloth) {
        this.cloth = cloth;
    }
    public String getCloth() {
        return cloth;
    }
    public void setAbilities(ArrayList<Abilities> Abilities) {
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
    public void changePlace(Place toPlace) {
        if (toPlace == place) {
            System.out.println(getName() + " И так уже на этом месте!");
        }
        else {
            System.out.println(getName() + " перешел из " + getPlace().getValue() + " в " + getPlace().getValue() + " !");
            setPlace(toPlace);
        }
    }
    public void climbTheStairs(Stairs stairs) {
        if (stairs != null) {
            if (stairs.getWidth()!= 0 & stairs.getHeight() != 0) {
                System.out.println(getName() + " Поднимается по " + stairs.getDescriptionWidth(stairs.getWidth()) + " и " + stairs.getDescriptionHight(stairs.getHeight()) +
                        " лестнице ведущей из " + stairs.getDownPlace().getValue() + " в " + stairs.getUpPlace().getValue());
                setPlace(stairs.getUpPlace());
            }
            else {
                System.out.println(getName() + " Поднимается по лестнице ведущей из " + stairs.getDownPlace().getValue() + " в " + stairs.getUpPlace().getValue());
                setPlace(stairs.getDownPlace());
            }
        }
        else {
            System.out.println("Такой лестницы нету");
        }
    }
    public void goDownTheStairs(Stairs stairs) {
        if (stairs != null) {
            if (stairs.getWidth()!= 0 & stairs.getHeight() != 0) {
                System.out.println(getName() + " Спускается по " + stairs.getDescriptionWidth(stairs.getWidth()) + " и " + stairs.getDescriptionHight(stairs.getHeight()) +
                        " лестнице ведущей из " + stairs.getUpPlace().getValue() + " в " + stairs.getDownPlace().getValue());
                setPlace(stairs.getDownPlace());
                setPlace(stairs.getDownPlace());
            }
            else {
                System.out.println(getName() + " Спускается по лестнице ведущей из " + stairs.getUpPlace().getValue() + " в " + stairs.getDownPlace().getValue());
                setPlace(stairs.getDownPlace());
            }
        }
        else {
            System.out.println("Такой лестницы нету");
        }
    }


}

