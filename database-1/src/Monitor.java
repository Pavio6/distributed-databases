// "Часть" в агрегации
class Monitor {
    private String model;
    private double sizeInches;

    public Monitor(String model, double sizeInches) { // Конструктор
        this.model = model;
        this.sizeInches = sizeInches;
    }

    public String getSpec() {
        return model + " " + sizeInches + " inch";
    }
}
