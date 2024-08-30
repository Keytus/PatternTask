package org.example.visitor;

/**
 * Класс вентилятора.
 * @autor Трофимук Глеб
 */
public class Fan extends Device{
    private Integer windPowerMode = 1;
    public Fan() {
    }
    public void blowWind(){
        System.out.println("Wind blowing");
    }
    public Integer getWindPowerMode() {
        return windPowerMode;
    }
    public void setWindPowerMode(Integer windPowerMode) {
        this.windPowerMode = windPowerMode;
    }
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visitFan(this);
    }
}
