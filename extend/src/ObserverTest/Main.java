package ObserverTest;

/**
 * Created by Ykue on 2017/7/19.
 */
public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        ForeDisplay foreDisplay = new ForeDisplay(weatherData);
        weatherData.setMeasurements(50,24);
        System.out.println(foreDisplay);
        weatherData.setMeasurements(60000,2400);
        System.out.println(foreDisplay);
        weatherData.setMeasurements(500,100);
        System.out.println(foreDisplay);
    }
}
