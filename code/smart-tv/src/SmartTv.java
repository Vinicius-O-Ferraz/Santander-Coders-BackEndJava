public class SmartTv {
    boolean turnedOn = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        turnedOn = true;
    }

    public void turnOff(){
        turnedOn = false;
    }

    public void increaseVolume(){
        volume++;
    }

    public void decreaseVolume(){
        volume--;
    }

     public void increaseChannel(){
        channel++;
    }

    public void decreaseChannel(){
        channel++;
    }
}
