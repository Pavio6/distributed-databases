/**
 * Ноутбук
 */
class Laptop extends Computer {
    private double weightKg;

    public Laptop(String brand, int powerWatts, String cpuModel, int memoryGb, Monitor monitor, double weightKg) {
        super(brand, powerWatts, cpuModel, memoryGb, monitor); // Использование super для конструктора родителя
        this.weightKg = weightKg;
    }

    @Override
    public void turnOn() { // Переопределение метода: для полиморфизма
        System.out.println(getBrand() + " laptop is on. Weight=" + weightKg + "kg");
    }
}
