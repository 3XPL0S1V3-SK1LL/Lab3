package inanimateobjects;

import java.util.Objects;

public class ChildClothing implements Clothing {
    public enum Headdress {
        HAT,
        BOW;
    }

    public enum TopOuterWear {
        SHIRT, //рубашка
        DRESS,
        T_SHIRT;

    }

    public enum DownOuterWear {
        SKIRT,
        TROUSERS,
    }

    public enum Shoes {
        BOOTS, //ботинки
        SHOES; //туфли
    }

    public enum Accessories {
        TIE, //Галстук
        CHAIN, //цепочка
        APRON; //передник
    }

    public enum Picture {
        PLAIN, // однотонный
        RABBIT,
        SQUIRREL;
    }

    public enum Colors {
        GREEN,
        YELLOW,
        PINK,
        ORANGE,
        BLUE,
        RED;
    }
    private StatusCloth status;

    public StatusCloth getStatus() {
        return status;
    }

    public void setStatus(StatusCloth status) {
        this.status = status;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildClothing that)) return false;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    public static String toString(Headdress headdress) {
        if (headdress == ChildClothing.Headdress.HAT) {
            return "шляпа";
        }
        return "бантик";
    }

    public static String toString(TopOuterWear topOuterWear) {
        if (topOuterWear == TopOuterWear.SHIRT) {
            return "рубаха";
        }
        if (topOuterWear == TopOuterWear.T_SHIRT) {
            return "футболка";
        }
        return "платье";
    }

    public static String toString(DownOuterWear downOuterWear) {
        if (downOuterWear == DownOuterWear.TROUSERS) {
            return "штаны";
        }
        return "юбка";
    }

    public static String toString(Shoes shoes) {
        if (shoes == Shoes.SHOES) {
            return "туфли";
        }
        return "ботинки";
    }

    public static String toString(Accessories accessories) {
        if (accessories == Accessories.TIE) return "галстук";
        if (accessories == Accessories.CHAIN) return "цепочка";
        return "передник";
    }
    public static String toString(Colors color) {
        if (color == Colors.GREEN) {
            return "зеленый";
        } else if (color == Colors.YELLOW) {
            return "желтый";
        } else if (color == Colors.PINK) {
            return "розовый";
        } else if (color == Colors.BLUE) {
            return "синий";
        } else if (color == Colors.RED) {
            return "красный";
        }
        return "оранжевый";
    }
    public static String toString(Picture picture) {
        if (picture == Picture.RABBIT) {
            return "кролик";
        } else if (picture ==  Picture.SQUIRREL) {
            return "белочка";
        }
        return "однотонный";
    }
    public void getDirty(){
        if (equals(StatusCloth.DIRTY)){
            status = StatusCloth.DIRTY;
            System.out.println("Одежда запачкалась!");
        }
        else{
            System.out.println("Одежда запачкалась еще больше!");
        }
    }
    public void getCleaned(){
        if (equals(StatusCloth.DIRTY)){
            status = StatusCloth.CLEAN;
            System.out.println("Одежда помыта!");
        }
        else{
            System.out.println("Одежда чистая");
        }
    }
}

