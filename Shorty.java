package livingthings;
import inanimateobjects.*;

public class Shorty extends Human {
    private ChildClothing.Headdress headdress;
    private ChildClothing.TopOuterWear topOuterWear;
    private ChildClothing.DownOuterWear downOuterWear;
    private ChildClothing.Shoes shoes;
    private ChildClothing.Accessories accessories;
    public Shorty(){
        System.out.println("Коротышка создана!");
    } //перегружаем конструкторы, поскольку разное количество параметров может быть задано
    public  Shorty(String name, Sex sex){
        setName(name);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + sex.getValue()+ ")");
    }
    public  Shorty(String name, Sex sex, int age){
        setName(name);
        setAge(age);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + sex.getValue()+ ") " +"Ему" + getAge() + "лет!");
    }

    public ChildClothing.Headdress getHeaddress() {
        return headdress;
    }

    public void setHeaddress(ChildClothing.Headdress headdress) {
        this.headdress = headdress;
        System.out.println("На " + getName() + " установлен головной убор " + headdress.getValue());
    }

    public ChildClothing.TopOuterWear getTopOuterWear() {
        return topOuterWear;
    }

    public void setTopOuterWear(ChildClothing.TopOuterWear topOuterWear) {
        this.topOuterWear = topOuterWear;
        System.out.println("На " + getName() + " установлена верхняя одежда " + topOuterWear.getValue());
    }

    public ChildClothing.DownOuterWear getDownOuterWear() {
        return downOuterWear;
    }

    public void setDownOuterWear(ChildClothing.DownOuterWear downOuterWear) {
        this.downOuterWear = downOuterWear;
        System.out.println("На " + getName() + " установлена нижняя одежда " + downOuterWear.getValue());
    }

    public ChildClothing.Shoes getShoes() {
        return shoes;
    }

    public void setShoes(ChildClothing.Shoes shoes) {
        this.shoes = shoes;
        System.out.println("На " + getName() + " установлена обувь " + shoes.getValue());
    }

    public ChildClothing.Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(ChildClothing.Accessories accessories) {
        this.accessories = accessories;
        System.out.println("На " + getName() + " установлен аксессуар " + accessories.getValue());
    }
    void wear(ChildClothing.Headdress headdress, ChildClothing.Colors headdressColor, ChildClothing.Picture headdressPicture) {
        if (this.headdress != null) {
            System.out.println("Головной убор уже надет!");
        } else {
            setHeaddress(headdress);
            headdress.setHeaddressColor(headdressColor);
            if (headdressPicture == null) {
                headdress.setHeaddressPicture(ChildClothing.Picture.PLAIN);
            } else {
                headdress.setHeaddressPicture(headdressPicture);
            }
        }

    }

    void wear(ChildClothing.Shoes shoes, ChildClothing.Colors shoesColor) {
        if (this.shoes != null) {
            System.out.println("Обувь убор уже надета!");
        } else {
            setShoes(shoes);
            shoes.setShoesColor(shoesColor);
        }

    }

    void wear(ChildClothing.Accessories accessories, ChildClothing.Colors accessoriesColor) {
        if (this.accessories != null) {
            System.out.println("Аксессуар убор уже надет!");
        } else {
            setAccessories(accessories);
            accessories.setAccessoriesColor(accessoriesColor);
        }
    }

    void wear(ChildClothing.TopOuterWear topOuterWear, ChildClothing.Colors topOuterWearColor, ChildClothing.Picture topOuterWearPicture) {
        if (this.topOuterWear != null) {
            System.out.println("Верхняя одежда уже надета!");
        } else {
            setTopOuterWear(topOuterWear);
            topOuterWear.setTopOuterWearColor(topOuterWearColor);
            if (topOuterWearPicture == null) {
                topOuterWear.setTopOuterWearPicture(ChildClothing.Picture.PLAIN);
            } else {
                topOuterWear.setTopOuterWearPicture(topOuterWearPicture);
            }
        }

    }

    void wear(ChildClothing.DownOuterWear downOuterWear, ChildClothing.Colors downOuterWearColor, ChildClothing.Picture downOuterWearPicture) {
        if (this.downOuterWear != null) {
            System.out.println("Нижняя одежда уже надета!");
        } else {
            setDownOuterWear(downOuterWear);
            downOuterWear.setDownOuterWearColor(downOuterWearColor);
            if (downOuterWearPicture == null) {
                downOuterWear.setDownOuterWearPicture(ChildClothing.Picture.PLAIN);
            } else {
                downOuterWear.setDownOuterWearPicture(downOuterWearPicture);
            }
        }

    }

    void takeOffHeaddress() {
        if (this.headdress == null) {
            System.out.println("Головного убора и так нету!");
        } else {
            setHeaddress(null);
            headdress.setHeaddressColor(null);
            headdress.setHeaddressPicture(null);
        }

    }

    void takeOffShoes() {
        if (this.shoes == null) {
            System.out.println("Обуви и так нет!");
        } else {
            setShoes(null);
            shoes.setShoesColor(null);
        }

    }

    void takeOffAccessories() {
        if (this.accessories == null) {
            System.out.println("Аксессуара и так нет!");
        } else {
            setAccessories(null);
            accessories.setAccessoriesColor(null);
            accessories.setAccessoriesPictureColor(null);
            accessories.setAccessoriesPicture(null);
        }
    }

    void takeOffTopOuterWear() {
        if (this.topOuterWear == null) {
            System.out.println("Верхней одежды и так нету!");
        } else {
            setTopOuterWear(null);
            topOuterWear.setTopOuterWearColor(null);
            topOuterWear.setTopOuterWearPictureColor(null);
            topOuterWear.setTopOuterWearPicture(null);
        }

    }

    void takeOffDownOuterWear() {
        if (this.downOuterWear == null) {
            System.out.println("Нижней одежды и так нету!");
        } else {
            setDownOuterWear(null);
            downOuterWear.setDownOuterWearColor(null);
            downOuterWear.setDownOuterWearPictureColor(null);
            downOuterWear.setDownOuterWearPicture(null);
        }

    }

    void takeOff() {
        if ((getHeaddress() == null) & (getTopOuterWear() == null)
                & (getDownOuterWear() == null) & (getAccessories() == null)
                & (getShoes() == null)) {
            System.out.println("И так ничего нет!");
        } else {
            setHeaddress(null);
            headdress.setHeaddressColor(null);
            headdress.setHeaddressPictureColor(null);
            headdress.setHeaddressPicture(null);
            setTopOuterWear(null);
            topOuterWear.setTopOuterWearColor(null);
            topOuterWear.setTopOuterWearPictureColor(null);
            topOuterWear.setTopOuterWearPicture(null);
            setDownOuterWear(null);
            downOuterWear.setDownOuterWearColor(null);
            downOuterWear.setDownOuterWearPictureColor(null);
            downOuterWear.setDownOuterWearPicture(null);
            setAccessories(null);
            accessories.setAccessoriesColor(null);
            accessories.setAccessoriesPictureColor(null);
            accessories.setAccessoriesPicture(null);
            setShoes(null);
            shoes.setShoesColor(null);
        }
    }



}
