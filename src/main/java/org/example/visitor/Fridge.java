package org.example.visitor;

/**
 * Класс холодильника.
 * @autor Трофимук Глеб
 */
public class Fridge extends Device{
    private final Float defaultTemperature = 3.0f;

    private Float currentTemperature = defaultTemperature;
    public Fridge() {
    }
    public void freeze(){
        System.out.println("Freezing");
    }
    public Float getCurrentTemperature() {
        return currentTemperature;
    }
    public void setCurrentTemperature(Float currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
    public Float getDefaultTemperature() {
        return defaultTemperature;
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitFridge(this);
    }
}
