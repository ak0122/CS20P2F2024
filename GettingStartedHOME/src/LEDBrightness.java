import com.phidget22.*;

public class LEDBrightness {

    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //brightness increases in increments of 0.1/sec
        for(double i = 0;i<=10;i++ ) {
        redLED.setDutyCycle(0 + (i/10));
        Thread.sleep(1000);
    }
        
        redLED.setDutyCycle(0.0);
}
}
