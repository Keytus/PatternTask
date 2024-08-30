package org.example.adapter;

import java.util.Random;

/**
 * Класс TypeC розетки.
 * В структуре паттрерна Адаптера является классом, функциональность которого нам нужно использовать.
 * @autor Трофимук Глеб
 */
public class SocketTypeC {
    private Boolean isConnect = false;
    public void connect(){
        isConnect = true;
        System.out.println("Connected to type C socket");
    }
    public Integer getChangeByTypeC(){
        if (isConnect){
            int min = 1, max = 10;
            Random random = new Random();
            return min + random.nextInt(max-min);
        }
        else return 0;
    }
}
