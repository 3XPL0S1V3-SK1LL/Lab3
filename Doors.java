public class Doors implements Door { //создаем класс дверей
    private boolean status;
    private boolean toPlace;
    private boolean fromPlace;

    Doors(Places fromPlace, Places toPlace) {

        System.out.println("Дверь из " + fromPlace + " в " + toPlace + " создана");
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean getStatus() {
        return this.status;
    }
    @Override
    public void printStatus() {
        if (status) {
            System.out.println("Дверь открыта");
        } else {
            System.out.println("Дверь закрыта");
        }

    }
}
