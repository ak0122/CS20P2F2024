import com.phidget22.DigitalOutput;

public class BlinkLED {

	public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);//green led corresponds to the 4th port
        greenLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);
        greenLED.open(1000);

        //Use your Phidgets
        
        for (int i =0; i <3;i++)//for loop repeats it 3 times
        {

            /*
            redLED.setState(true);
            Thread.sleep(2000);//make the light stay on for 2 seconds
            redLED.setState(false);
            Thread.sleep(1000);
             */
            greenLED.setState(true);
            Thread.sleep(2000);
            greenLED.setState(false);
            Thread.sleep(1000);
           
            
        }
    }
}
 
