package ObserverTest;

import java.util.Observable;

/**
 * Created by Ykue on 2017/7/19.
 */
public class WeatherData extends Observable {
    private int temp;
    private int age;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(int temp, int age){
        this.temp = temp;
        this.age = age;
        measurementsChanged();
    }

    public int getTemp() {
        return temp;
    }


    public int getAge() {
        return age;
    }

}
