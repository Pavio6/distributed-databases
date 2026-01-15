/**
 * Настольный компьютер
 */
class Computer extends ElectronicDevice implements Powerable {
    private String cpuModel;
    private int memoryGb;
    private Monitor monitor; // Агрегация: Computer HAS-A Monitor

    public Computer(String brand, int powerWatts) { // Перегрузка конструктора 1
        this(brand, powerWatts, "Unknown CPU", 8, null); // Использование this
    }

    public Computer(String brand, int powerWatts, String cpuModel, int memoryGb) { // Перегрузка конструктора 2
        this(brand, powerWatts, cpuModel, memoryGb, null); // Использование this
    }

    public Computer(String brand, int powerWatts, String cpuModel, int memoryGb, Monitor monitor) { // Перегрузка конструктора 3
        super(brand, powerWatts); // Использование super для конструктора родителя
        this.cpuModel = cpuModel;
        this.memoryGb = memoryGb;
        this.monitor = monitor;
    }

    public void setMonitor(Monitor monitor) { // Агрегация: установка "части"
        this.monitor = monitor;
    }

    public void showSpec() { // Демонстрация перегрузки методов 1
        showSpec(false);
    }

    public void showSpec(boolean detailed) { // Демонстрация перегрузки методов 2
        String base = getBrand() + " CPU=" + cpuModel + " RAM=" + memoryGb + "GB";
        if (detailed && monitor != null) {
            base += " Monitor=" + monitor.getSpec();
        }
        System.out.println(base);
    }

    @Override
    public void plugIn() { // Реализация интерфейса
        System.out.println(getBrand() + " plugged in.");
    }

    @Override
    public void unplug() { // Реализация интерфейса
        System.out.println(getBrand() + " unplugged.");
    }

    @Override
    public void turnOn() { // Переопределение абстрактного метода: для полиморфизма
        System.out.println(getBrand() + " computer is on.");
    }

    @Override
    public void turnOff() { // Переопределение абстрактного метода: для полиморфизма
        System.out.println(getBrand() + " computer is off.");
    }
}
