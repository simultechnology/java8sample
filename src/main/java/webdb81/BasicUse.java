package webdb81;

/**
 * Created by ishi on 2014/07/26.
 */
public class BasicUse {
    public static void main(String[] args) {
        rx.Observable.range(1, 20)
                .filter(n -> n % 3 == 0)
                .map(n -> String.format("[%02d] ", n))
                //.toBlockingObservable()
                .forEach(System.out::print);
    }
}
