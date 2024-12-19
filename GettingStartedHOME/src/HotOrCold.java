import com.phidget22.DigitalOutput;
import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class HotOrCold {
	 public static void main(String[] args) throws Exception{
	//Create 
    HumiditySensor humiditySensor = new HumiditySensor();
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    DigitalOutput redLED = new DigitalOutput();
    DigitalOutput greenLED = new DigitalOutput();
    
    //Address
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);
    
    //Open 
    humiditySensor.open(1000);
    temperatureSensor.open(1000);
    redLED.open(1000);
    greenLED.open(1000);
    double T = temperatureSensor.getTemperature();
    
    while (true) {
    if(20 < temperatureSensor.getTemperature() && temperatureSensor.getTemperature() <24 )
    {
    	greenLED.setState(true);
    	redLED.setState(false);
        System.out.println("Temperature: " + temperatureSensor.getTemperature());
    	Thread.sleep(150);
    }
    
    else {
    	redLED.setState(true);
    	greenLED.setState(false);
        System.out.println("Temperature: " + temperatureSensor.getTemperature());
    	Thread.sleep(150);
    }
   }
}
}
