package org.example.adapter;

/**
 * Класс китайского вентилятора.
 * В структуре паттрерна Адаптера является классом, с которым взаимодействует клиент.
 * @autor Трофимук Глеб
 */
public class ChineseFan {
    private Integer charge = 0;
    /**
     * Функциональность класса, которую дополнит адаптер.
     */
    public void chargeByTypeA(){
        charge++;
    }
    public void setCharge(Integer charge){
        this.charge = charge;
    }
    public void blowWind(){
        while (charge > 0){
            System.out.println("Wind blowing");
            charge--;
        }
        System.out.println("No charge");
    }
}
