package Observer.book.InlileInJava;

import Observer.my.Observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public Nabl nabl;

    private static class Nabl extends Observable {
        private  static Nabl instance = new Nabl();

        public Nabl getInstanse(){
            return this;
        }

        public void measurementsChanged() {
            setChanged();
            notifyObservers();
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        nabl.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}


