public interface Door{ //задаем поведение двери
    void setStatus(boolean status); // у нее можеть быть статус: закрытая или открытая (true or false)
    boolean getStatus();
    void printStatus(); // так же мы можем узнать открыта она или закрыта
}
