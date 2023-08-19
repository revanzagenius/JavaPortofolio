package OOPJAVA;

public class Lamp {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println(" Light on ? " +  isOn);
    }
    
    void turnOFF(){
        isOn = false;
        System.out.println(" Light on ? " +  isOn);
    }
    
}
