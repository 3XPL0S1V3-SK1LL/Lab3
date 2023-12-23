package livingthings;

import java.util.ArrayList;
import inanimateobjects.*;

public class Shorty extends Human {
    private ChildClothing.Headdress headdress;
    private ChildClothing.Picture headdressPicture;
    private ChildClothing.Colors headdressPictureColor;
    private ChildClothing.Colors headdressColor;
    private ChildClothing.TopOuterWear topOuterWear;
    private ChildClothing.Picture topOuterWearPicture;
    private ChildClothing.Colors topOuterWearPictureColor;
    private ChildClothing.Colors topOuterWearColor;
    private ChildClothing.DownOuterWear downOuterWear;
    private ChildClothing.Picture downOuterWearPicture;
    private ChildClothing.Colors downOuterWearPictureColor;
    private ChildClothing.Colors downOuterWearColor;
    private ChildClothing.Shoes shoes;
    private ChildClothing.Colors shoesColor;
    private ChildClothing.Accessories accessories;
    private ChildClothing.Colors accessoriesColor;
    private ChildClothing.Picture accessoriesPicture;
    private ChildClothing.Colors accessoriesPictureColor;
    public Shorty(){
        System.out.println("Коротышка создана!");
    } //перегружаем конструкторы, поскольку разное количество параметров может быть задано
    public  Shorty(String name, Sex sex){
        setName(name);
        setSex(sex);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + getSex()+ ")");
    }
    public  Shorty(String name, Sex sex, int age){
        setName(name);
        setAge(age);
        setSex(sex);
        System.out.println("Коротышка по имени " + getName() + " создан! " + "(" + getSex()+ ") " +"Ему" + getAge() + "лет!");
    }

    public ChildClothing.Headdress getHeaddress() {
        return headdress;
    }

    public void setHeaddress(ChildClothing.Headdress headdress) {
        this.headdress = headdress;
        System.out.println("На " + getName() + " установлен головной убор " + ChildClothing.toString(headdress));
    }

    public ChildClothing.TopOuterWear getTopOuterWear() {
        return topOuterWear;
    }

    public void setTopOuterWear(ChildClothing.TopOuterWear topOuterWear) {
        this.topOuterWear = topOuterWear;
        System.out.println("На " + getName() + " установлена верхняя одежда " + ChildClothing.toString(topOuterWear));
    }

    public ChildClothing.DownOuterWear getDownOuterWear() {
        return downOuterWear;
    }

    public void setDownOuterWear(ChildClothing.DownOuterWear downOuterWear) {
        this.downOuterWear = downOuterWear;
        System.out.println("На " + getName() + " установлена нижняя одежда " + ChildClothing.toString(downOuterWear));
    }

    public ChildClothing.Shoes getShoes() {
        return shoes;
    }

    public void setShoes(ChildClothing.Shoes shoes) {
        this.shoes = shoes;
        System.out.println("На " + getName() + " установлена обувь " + ChildClothing.toString(shoes));
    }

    public ChildClothing.Accessories getAccessories() {
        return accessories;
    }

    public void setAccessories(ChildClothing.Accessories accessories) {
        this.accessories = accessories;
        System.out.println("На " + getName() + " установлен аксессуар " + ChildClothing.toString(accessories));
    }

    public ChildClothing.Picture getHeaddressPicture() {
        return headdressPicture;
    }

    public void setHeaddressPicture(ChildClothing.Picture headdressPicture) {
        if(getHeaddress() != null & getHeaddressColor() != null) {
            this.headdressPicture = headdressPicture;
            System.out.println("На " + getName() + " головной убор установлена картинка"
                    + ChildClothing.toString(headdressPicture));
        }
        else{
            System.out.println("Необходимо установить головной убор и/или его цвет");
        }
    }

    public ChildClothing.Colors getHeaddressColor() {
        return headdressColor;
    }

    public void setHeaddressColor(ChildClothing.Colors headdressColor) {
        if(getHeaddress() != null) {
            this.headdressColor = headdressColor;
            System.out.println("На " + getName() + " установлен цвет головного убора "
                    + ChildClothing.toString(headdressColor));
        }
        else{
            System.out.println("Нельзя изменить цвет того, чего нету (необходимо установить головной убор)");
        }
    }

    public ChildClothing.Picture getTopOuterWearPicture() {
        return topOuterWearPicture;
    }

    public void setTopOuterWearPicture(ChildClothing.Picture topOuterWearPicture) {
        if(getTopOuterWear() != null & getTopOuterWearColor() != null) {
            this.topOuterWearPicture = topOuterWearPicture;
            System.out.println("На " + getName() + " головной убор установлена картинка"
                    + ChildClothing.toString(topOuterWearPicture));
        }
        else{
            System.out.println("Необходимо установить головной убор и/или его цвет");
        }
    }

    public ChildClothing.Colors getTopOuterWearColor() {
        return topOuterWearColor;
    }

    public void setTopOuterWearColor(ChildClothing.Colors topOuterWearColor) {
        if(getTopOuterWear() != null) {
            this.topOuterWearColor = topOuterWearColor;
            System.out.println("На " + getName() + " установлена верхняя одежда цвета "
                    + ChildClothing.toString(headdressColor));
        }
        else{
            System.out.println("Нельзя изменить цвет того, чего нету (необходимо установить верхнюю одежду)");
        }
    }

    public ChildClothing.Picture getDownOuterWearPicture() {
        return downOuterWearPicture;
    }

    public void setDownOuterWearPicture(ChildClothing.Picture downOuterWearPicture) {
        if(getDownOuterWear() != null) {
            this.downOuterWearPicture = downOuterWearPicture;
            System.out.println("На " + getName() + " нижнюю одежду установлена картинка " + ChildClothing.toString(downOuterWearPicture));
        }
        else{
            System.out.println("Необходимо установить головной убор и/или его цвет");
        }
    }
    public ChildClothing.Colors getDownOuterWearColor() {
        return downOuterWearColor;
    }

    public void setDownOuterWearColor(ChildClothing.Colors downOuterWearColor) {
        if(getDownOuterWear() != null) {
            this.downOuterWearColor = downOuterWearColor;
            System.out.println("На " + getName() + " установлена верхняя одежда " +
                    " цвета " + ChildClothing.toString(downOuterWearColor));
        }
        else{
            System.out.println("Нельзя изменить цвет того, чего нету (необходимо установить нижнюю одежду)");
        }
    }

    public ChildClothing.Colors getShoesColor() {
        return shoesColor;
    }

    public void setShoesColor(ChildClothing.Colors shoesColor) {
        if(getShoes() != null) {
            this.shoesColor = shoesColor;
            System.out.println("На " + getName() + " установлена обувь цвета "
                    + ChildClothing.toString(shoesColor));
        }
        else{
            System.out.println("Нельзя изменить цвет того, чего нету (необходимо установить обувь)");
        }
    }

    public ChildClothing.Colors getAccessoriesColor() {
        return accessoriesColor;
    }

    public void setAccessoriesColor(ChildClothing.Colors accessoriesColor) {
        if(getAccessories() != null) {
            this.accessoriesColor = accessoriesColor;
            System.out.println("На " + getName() + " установлен аксессуар цвета "
                    + ChildClothing.toString(accessoriesColor));
        }
        else{
            System.out.println("Нельзя изменить цвет того, чего нету (необходимо установить аксессуар)");
        }
    }
    public void setAccessoriesPicture(ChildClothing.Picture accessoriesPicture) {
        if(getAccessories() != null) {
            this.accessoriesPicture = accessoriesPicture;
            System.out.println("На " + getName() + " аксессуар установлена картинка "
                    + ChildClothing.toString(accessoriesPicture));
        }
        else{
            System.out.println("Нельзя изменить цвет того, чего нету (необходимо установить аксессуар)");
        }
    }
    public ChildClothing.Picture getAccessoriesPicture(){
        return accessoriesPicture;
    }

    public ChildClothing.Colors getHeaddressPictureColor() {
        return headdressPictureColor;
    }

    public void setHeaddressPictureColor(ChildClothing.Colors headdressPictureColor) {
        if (getHeaddress()!= null & getHeaddressColor() != null & getHeaddressPicture()!=null & getHeaddressPicture() != ChildClothing.Picture.PLAIN){
            this.headdressPictureColor = headdressPictureColor;
            System.out.println("На головном уборе картинка теперь " + ChildClothing.toString(headdressPictureColor));
        }
        else{
            System.out.println("Необходимо уситановить головной убор и/или его цвет и/или картинку!");
        }
    }

    public ChildClothing.Colors getTopOuterWearPictureColor() {
        return topOuterWearPictureColor;
    }

    public void setTopOuterWearPictureColor(ChildClothing.Colors topOuterWearPictureColor) {
        if (getTopOuterWear()!= null & getTopOuterWearColor() != null & getTopOuterWearPicture()!=null & getTopOuterWearPicture() != ChildClothing.Picture.PLAIN){
            this.topOuterWearPictureColor = topOuterWearPictureColor;
            System.out.println("На верхней одежде картинка теперь " + ChildClothing.toString(topOuterWearPictureColor));
        }
        else{
            System.out.println("Необходимо уситановить верхнюю одежду и/или её цвет и/или картинку!");
        }
    }

    public ChildClothing.Colors getDownOuterWearPictureColor() {
        return downOuterWearPictureColor;
    }

    public void setDownOuterWearPictureColor(ChildClothing.Colors downOuterWearPictureColor) {
        if (getDownOuterWear()!= null & getDownOuterWearColor() != null & getDownOuterWearPicture()!=null & getDownOuterWearPicture() != ChildClothing.Picture.PLAIN){
            this.downOuterWearPictureColor = downOuterWearPictureColor;
            System.out.println("На нижней одежде картинка теперь " + ChildClothing.toString(downOuterWearPictureColor));
        }
        else{
            System.out.println("Необходимо уситановить нижнюю одежду и/или её цвет и/или картинку!");
        }
    }

    public ChildClothing.Colors getAccessoriesPictureColor() {
        return accessoriesPictureColor;
    }

    public void setAccessoriesPictureColor(ChildClothing.Colors accessoriesPictureColor) {
        if (getAccessories()!= null & getAccessoriesColor() != null & getAccessoriesPicture()!=null & getAccessoriesPicture() != ChildClothing.Picture.PLAIN){
            this.downOuterWearPictureColor = downOuterWearPictureColor;
            System.out.println("На аксессуаре картинка теперь " + ChildClothing.toString(accessoriesPictureColor));
        }
        else{
            System.out.println("Необходимо уситановить аксессуар и/или его цвет и/или картинку!");
        }
    }

    void wear(ChildClothing.Headdress headdress, ChildClothing.Colors headdressColor, ChildClothing.Picture headdressPicture) {
        if (this.headdress != null) {
            System.out.println("Головной убор уже надет!");
        } else {
            setHeaddress(headdress);
            setHeaddressColor(headdressColor);
            if (headdressPicture == null) {
                setHeaddressPicture(ChildClothing.Picture.PLAIN);
            } else {
                setHeaddressPicture(headdressPicture);
            }
        }

    }

    void wear(ChildClothing.Shoes shoes, ChildClothing.Colors shoesColor) {
        if (this.shoes != null) {
            System.out.println("Обувь убор уже надета!");
        } else {
            setShoes(shoes);
            setShoesColor(shoesColor);
        }

    }

    void wear(ChildClothing.Accessories accessories, ChildClothing.Colors accessoriesColor) {
        if (this.accessories != null) {
            System.out.println("Аксессуар убор уже надет!");
        } else {
            setAccessories(accessories);
            setAccessoriesColor(accessoriesColor);
        }
    }

    void wear(ChildClothing.TopOuterWear topOuterWear, ChildClothing.Colors topOuterWearColor, ChildClothing.Picture topOuterWearPicture) {
        if (this.topOuterWear != null) {
            System.out.println("Верхняя одежда уже надета!");
        } else {
            setTopOuterWear(topOuterWear);
            setTopOuterWearColor(topOuterWearColor);
            if (topOuterWearPicture == null) {
                setTopOuterWearPicture(ChildClothing.Picture.PLAIN);
            } else {
                setTopOuterWearPicture(topOuterWearPicture);
            }
        }

    }

    void wear(ChildClothing.DownOuterWear downOuterWear, ChildClothing.Colors downOuterWearColor, ChildClothing.Picture downOuterWearPicture) {
        if (this.downOuterWear != null) {
            System.out.println("Нижняя одежда уже надета!");
        } else {
            setDownOuterWear(downOuterWear);
            setDownOuterWearColor(downOuterWearColor);
            if (downOuterWearPicture == null) {
                setTopOuterWearPicture(ChildClothing.Picture.PLAIN);
            } else {
                setDownOuterWearPicture(downOuterWearPicture);
            }
        }

    }

    void takeOffHeaddress() {
        if (this.headdress == null) {
            System.out.println("Головного убора и так нету!");
        } else {
            setHeaddress(null);
            setHeaddressColor(null);
            setHeaddressPicture(null);
        }

    }

    void takeOffShoes() {
        if (this.shoes == null) {
            System.out.println("Обуви и так нет!");
        } else {
            setShoes(null);
            setShoesColor(null);
        }

    }

    void takeOffAccessories() {
        if (this.accessories == null) {
            System.out.println("Аксессуара и так нет!");
        } else {
            setAccessories(accessories);
            setAccessoriesColor(accessoriesColor);
        }
    }

    void takeOffTopOuterWear() {
        if (this.topOuterWear == null) {
            System.out.println("Верхней одежды и так нету!");
        } else {
            setTopOuterWear(null);
            setTopOuterWearColor(null);
            setTopOuterWearPicture(null);
        }

    }

    void wearDownOuterWear() {
        if (this.downOuterWear == null) {
            System.out.println("Нижней одежды и так нету!");
        } else {
            setDownOuterWear(null);
            setDownOuterWearColor(null);
            setDownOuterWearPicture(null);
        }

    }

    void takeOff() {
        if ((getHeaddress() == null) & (getTopOuterWear() == null)
                & (getDownOuterWear() == null) & (getAccessories() == null)
                & (getShoes() == null)) {
            System.out.println("И так ничего нет!");
        } else {
            setHeaddress(null);
            setTopOuterWear(null);
            setDownOuterWear(null);
            setAccessories(null);
            setShoes(null);
        }
    }



}
