package Observer.book.Implementation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new
                CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80 ,65,30);
        weatherData.setMeasurements(25,60,32);
    }

}
