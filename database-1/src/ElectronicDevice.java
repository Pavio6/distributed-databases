// Абстрактный родительский класс: электронное устройство
abstract class ElectronicDevice {
    private String brand;
    private int powerWatts;

    public ElectronicDevice(String brand, int powerWatts) { // Конструктор
        this.brand = brand;
        this.powerWatts = powerWatts;
    }

    public String getBrand() {
        return brand;
    }

    public int getPowerWatts() {
        return powerWatts;
    }

    public abstract void turnOn(); // Абстрактный метод
    public abstract void turnOff(); // Абстрактный метод
}
