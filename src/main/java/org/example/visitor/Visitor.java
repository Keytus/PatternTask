package org.example.visitor;

/**
 * Интерфейс, который будут реализовывать классы посетители
 * @autor Трофимук Глеб
 */
public interface Visitor {
    void visitFan(Fan fan);
    void visitFridge(Fridge fridge);
    void visitPhone(Phone phone);
}
