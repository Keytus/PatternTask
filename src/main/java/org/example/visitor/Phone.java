package org.example.visitor;

/**
 * Класс телефона.
 * @autor Трофимук Глеб
 */
public class Phone extends Device{
    public Phone() {
    }

    public void call(){
        System.out.println("Calling");
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitPhone(this);
    }
}
