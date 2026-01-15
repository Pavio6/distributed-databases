public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("AOC-24G2", 24.0);
        Computer desktop = new Computer("Lenovo", 350, "Intel i5", 16, monitor);
        Laptop laptop = new Laptop("Dell", 90, "AMD Ryzen 7", 16, null, 1.6);

        desktop.plugIn(); // Вызов через интерфейс
        desktop.showSpec(true); // Перегрузка метода (с параметром)
        desktop.turnOn();

        ElectronicDevice device = laptop; // Полиморфизм: ссылка на родителя
        device.turnOn();
        device.turnOff();
    }
}
