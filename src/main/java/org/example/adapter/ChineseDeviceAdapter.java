package org.example.adapter;

/**
 * Класс адаптера
 * @autor Трофимук Глеб
 */
public class ChineseDeviceAdapter extends ChineseFan {
    private final SocketTypeC socketTypeC = new SocketTypeC();
    /**
     * Предоставляем возможность китайскому устройству заражаться от TypeC.
     */
    @Override
    public void chargeByTypeA(){
        socketTypeC.connect();
        setCharge(socketTypeC.getChangeByTypeC());
    }
}
