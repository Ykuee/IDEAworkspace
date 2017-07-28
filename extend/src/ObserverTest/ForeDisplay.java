package ObserverTest;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Ykue on 2017/7/19.
 */
public class ForeDisplay implements Observer{
    Observable observable;
    private int temp;
    private int age;

    public ForeDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.age = weatherData.getAge();
        }
    }

    @Override
    public String toString() {
        return "ForeDisplay{" +
                "temp=" + temp +
                ", age=" + age +
                '}';
    }
}

