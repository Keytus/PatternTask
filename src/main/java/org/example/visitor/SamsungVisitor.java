package org.example.visitor;

import java.util.Random;

/**
 * Класс посетителя.
 * Будет предоставлять услуги устройствам Samsung и отказывать Xiaomi
 * @autor Трофимук Глеб
 */
public class SamsungVisitor implements Visitor{
    public void visitFan(Fan fan){
        if (fan.getBrand() == Device.Brand.Xiaomi){
            System.out.println("Your location must be Mainland China");
            return;
        }
        System.out.println("Getting info from smart house app");
        int min = 1, max = 4;
        Random random = new Random();
        Integer selectedMode = min + random.nextInt(max-min);
        fan.setWindPowerMode(selectedMode);
    }
    public void visitFridge(Fridge fridge){
        if (fridge.getCurrentTemperature() != fridge.getDefaultTemperature()) {
            switch (fridge.getBrand()){
                case Samsung ->
                        System.out.println("Send info to Samsung smart house app");
                case Xiaomi ->
                        System.out.println("Something went wrong");
            }

        }
    }
    public void visitPhone(Phone phone){
        if (phone.getBrand() == Device.Brand.Xiaomi){
            System.out.println("Google play not allowed");
        }
    }
}
