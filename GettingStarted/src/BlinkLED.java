import com.phidget22.DigitalOutput;

public class BlinkLED {

	public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput greenLED = new DigitalOutput();

        //Address 

        greenLED.setHubPort(4);//green led corresponds to the 4th port
        greenLED.setIsHubPortDevice(true);

        //Open 
        greenLED.open(1000);

        //Use your Phidgets
        
        for (int i =0; i <3;i++)//for loop repeats it 3 times
        {

            
            greenLED.setState(true);
            Thread.sleep(2000);
            greenLED.setState(false);
            Thread.sleep(1000);
           
            
        }
    }
}
 
