package livingthings;
import inanimateobjects.*;
import java.util.ArrayList;
public class Shorty extends Human {
    private ArrayList<KidClothing> clothing = new ArrayList<KidClothing>();
    public Shorty() {
        System.out.println("Коротышка создана!");
    } //перегружаем конструкторы, поскольку разное количество параметров может быть задано
    public Shorty(String name, Sex sex) {
        setName(name);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + sex.getValue()+ ")");
    }
    public Shorty(String name, Sex sex, int age) {
        setName(name);
        setAge(age);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + sex.getValue()+ ") " +"Ему" + getAge() + "лет!");
    }
    public void wear(KidClothing clothing) {
        boolean flag = false;
        for (KidClothing cloth: this.clothing) {
            if (cloth.getType().getType().equals(clothing.getType().getType())) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(clothing.getType().getType());
        }
        else {
            this.clothing.add(clothing);
        }
    }
    public void takeOff(KidClothing clothing) {
        if (this.clothing.contains(clothing)) {
            this.clothing.remove(this.clothing.indexOf(clothing));
            System.out.println("C" + getName() + " снята " + clothing.getType().getValue());
        }
        else {
            System.out.println("Такой одежды нет!");
        }
    }
    public ArrayList<KidClothing> getClothing() {
        return this.clothing;
    }
}
