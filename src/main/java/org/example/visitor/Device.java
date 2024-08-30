package org.example.visitor;
/**
 * Класс устройств, от которого будут наследоваться все устройства.
 * Каждый наследник должен будет реализовать accept для принятия посетителя.
 * @autor Трофимук Глеб
 */
public abstract class Device {
    private Brand brand;
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public abstract void accept(Visitor visitor);
    public enum Brand{
        Samsung,
        Xiaomi
    }
}
