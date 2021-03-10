package Observer.book.InlileInJava;

public class MiniSimulationWeather {
    public static void main(String[] args) {
        WeatherData weatherData  = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData.nabl);

        weatherData.setMeasurements(20 ,30,50);
    }
}
