package inanimateobjects;

import java.util.Objects;

public class ChildClothing implements Clothing {
    public enum Headdress {
        HAT("Шляпа"),
        BOW("Бантик");
        private String value;
        private Headdress(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        private Colors headdressColor;
        private Picture headdressPicture;
        private Colors  headdressPictureColor;
        public Colors getHeaddressPictureColor() {
            return headdressPictureColor;
        }

        public void setHeaddressPictureColor(Colors headdressPictureColor) {
            if (getHeaddressColor() != null & getHeaddressPicture()!=null & getHeaddressPicture() != ChildClothing.Picture.PLAIN){
                this.headdressPictureColor = headdressPictureColor;
                System.out.println("На головном уборе картинка теперь " + headdressPictureColor.getValue());
            }
            else{
                System.out.println("Необходимо уситановить цвет головного убора и/или картинку!");
            }

        }

        public Colors getHeaddressColor() {
            return headdressColor;
        }

        public void setHeaddressColor(Colors headdressColor) {
            this.headdressColor = headdressColor;
        }

        public Picture getHeaddressPicture() {
            return headdressPicture;
        }

        public void setHeaddressPicture(Picture headdressPicture) {
            this.headdressPicture = headdressPicture;
        }
    }

    public enum TopOuterWear {
        SHIRT("рубашка"),
        DRESS("платье"),
        T_SHIRT("футболка");
        private String value;
        private TopOuterWear(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        private Colors topOuterWearColor;
        private Picture topOuterWearPicture;
        private Colors  topOuterWearPictureColor;
        public Colors getTopOuterWearColor() {
            return topOuterWearColor;
        }

        public void setTopOuterWearColor(Colors topOuterWearColor) {
            this.topOuterWearColor = topOuterWearColor;
        }

        public Picture getTopOuterWearPicture() {
            return topOuterWearPicture;
        }

        public void setTopOuterWearPicture(Picture topOuterWearPicture) {
            this.topOuterWearPicture = topOuterWearPicture;
        }

        public Colors getTopOuterWearPictureColor() {
            return topOuterWearPictureColor;
        }

        public void setTopOuterWearPictureColor(Colors topOuterWearPictureColor) {
            if (getTopOuterWearColor() != null & getTopOuterWearPicture()!=null & getTopOuterWearPicture() != ChildClothing.Picture.PLAIN){
                this.topOuterWearPictureColor = topOuterWearPictureColor;
                System.out.println("На верхней одежде картинка теперь " + topOuterWearPictureColor.getValue());
            }
            else{
                System.out.println("Необходимо уситановить  цвет верхней одежды и/или картинку!");
            }
        }
    }

    public enum DownOuterWear {
        SKIRT("юбка"),
        TROUSERS("штаны");
        private String value;
        private DownOuterWear(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        private Colors downOuterWearColor;
        private Picture downOuterWearPicture;
        private Colors downOuterWearPictureColor;

        public Colors getDownOuterWearPictureColor() {
            return downOuterWearPictureColor;
        }

        public void setDownOuterWearPictureColor(Colors downOuterWearPictureColor) {
            if (getDownOuterWearColor() != null & getDownOuterWearPicture()!=null & getDownOuterWearPicture() != ChildClothing.Picture.PLAIN){
                this.downOuterWearPictureColor = downOuterWearPictureColor;
                System.out.println("На верхней одежде картинка теперь " + downOuterWearPictureColor.getValue());
            }
            else{
                System.out.println("Необходимо уситановить  цвет верхней одежды и/или картинку!");
            }
        }

        public Colors getDownOuterWearColor() {
            return downOuterWearColor;
        }

        public void setDownOuterWearColor(Colors downOuterWearColor) {
            this.downOuterWearColor = downOuterWearColor;
        }

        public Picture getDownOuterWearPicture() {
            return downOuterWearPicture;
        }

        public void setDownOuterWearPicture(Picture downOuterWearPicture) {
            this.downOuterWearPicture = downOuterWearPicture;
        }
    }

    public enum Shoes {
        BOOTS("ботинки"), //ботинки
        SHOES("туфли"); //туфли
        private String value;
        private Colors shoesColor;
        private Shoes(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public Colors getShoesColor() {
            return shoesColor;
        }

        public void setShoesColor(Colors shoesColor) {
            this.shoesColor = shoesColor;
        }
    }

    public enum Accessories {
        TIE("галстук"), //Галстук
        CHAIN("цепочка"), //цепочка
        APRON("передник"); //передник
        private String value;
        private Colors accessoriesColor;
        private Picture accessoriesPicture;
        private Colors accessoriesPictureColor;
        private Accessories(String value) {
            this.value = value;
        }
        public Colors getAccessoriesPictureColor() {
            return accessoriesPictureColor;
        }

        public void setAccessoriesPictureColor(Colors accessoriesPictureColor) {
            if (getAccessoriesColor() != null & getAccessoriesPicture()!=null & getAccessoriesPicture() != ChildClothing.Picture.PLAIN){
                this.accessoriesPictureColor = accessoriesPictureColor;
                System.out.println("На аксессуаре картинка теперь " + accessoriesPictureColor.getValue());
            }
            else{
                System.out.println("Необходимо уситановить аксессуар и/или его цвет и/или картинку!");
            }
        }

        public String getValue() {
            return value;
        }
        public Colors getAccessoriesColor() {
            return accessoriesColor;
        }

        public void setAccessoriesColor(Colors accessoriesColor) {
            this.accessoriesColor = accessoriesColor;
        }

        public Picture getAccessoriesPicture() {
            return accessoriesPicture;
        }

        public void setAccessoriesPicture(Picture accessoriesPicture) {
            this.accessoriesPicture = accessoriesPicture;
        }
    }

    public enum Picture {
        PLAIN("однотонная"), // однотонный
        RABBIT("кролик"),
        SQUIRREL("белочка");
        private String value;
        private Picture(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum Colors {
        GREEN("зеленый"),
        YELLOW("желтый"),
        PINK("розовый"),
        ORANGE("оранжевый"),
        BLUE("синий"),
        RED("красный");
        private String value;
        private Colors(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    private StatusCloth isDirty;

    public StatusCloth getIsDirty() {
        return isDirty;
    }

    public void setStatus(StatusCloth status) {
        this.isDirty = isDirty;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildClothing that)) return false;
        return isDirty == that.isDirty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDirty);
    }

    public void getDirty(){
        if (equals(StatusCloth.DIRTY)){
            isDirty = StatusCloth.DIRTY;
            System.out.println("Одежда запачкалась!");
        }
        else{
            System.out.println("Одежда запачкалась еще больше!");
        }
    }
    public void getCleaned(){
        if (equals(StatusCloth.DIRTY)){
            isDirty = StatusCloth.CLEAN;
            System.out.println("Одежда помыта!");
        }
        else{
            System.out.println("Одежда чистая");
        }
    }
}

