package Transport;

import java.util.Deque;

public class ServiceStation {

    private Deque<Transport> deque;

    public void addCarToQueue(Transport car) {
        deque.addLast(car);
    }

    public void startDiagnostic(Transport car) {
        for (Transport transport : deque) {
            if (car.needDiagnostic(car)) {
                System.out.println(car + " проходит ТО");
                deque.pollFirst();
            }
        }
    }
}
