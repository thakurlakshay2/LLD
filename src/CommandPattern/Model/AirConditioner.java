package CommandPattern.Model;



//RECEIVER  /
public class AirConditioner {
    private  boolean isOn;
    private  int temperature;

    public AirConditioner() {
        this.isOn = false;
    }

    public void turnOnAc(){
        this.isOn=true;
        System.out.println("Ac is turned on");
    }

    public void setTemperature(int temp){
        this.temperature=temp;
        System.out.println("Ac is turned on");
    }
    public void tunrOffAc(){
        this.isOn=false;
        System.out.println("Ac is turned Off");
    }
}
