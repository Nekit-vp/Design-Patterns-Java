package BookFacade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}

class Amplifier {
    public void on() {

    }

    public void setDvd(DvdPlayer dvd) {

    }

    public void setSurroundSound() {

    }

    public void setVolume(int i) {

    }

    public void off() {

    }
}

class Tuner {
}

class DvdPlayer {
    public void on() {


    }

    public void play(String movie) {

    }

    public void stop() {

    }

    public void eject() {

    }

    public void off() {

    }
}

class CdPlayer {
}

class Projector {
    public void wideScreenMode() {

    }

    public void on() {

    }

    public void off() {

    }
}

class TheaterLights {
    public void dim(int i) {

    }

    public void on() {

    }
}

class Screen {
    public void down() {

    }

    public void up() {

    }
}

class PopcornPopper {
    public void on() {


    }

    public void pop() {

    }

    public void off() {

    }
}
