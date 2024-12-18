	import com.phidget22.*;
public class UseButtonLED {

	    //Handle Exceptions 
	    public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open 
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        //Use your Phidgets
	        int sum = 0;
	        while(true){
	            if( redButton.getState()){
	                sum += 1;
	                greenLED.setState(false);
	                System.out.println("Buttons Pressed: " + sum);
	            } else {
	                greenLED.setState(true);
	            }

	            if(greenButton.getState()){
	                sum += 1;
	                redLED.setState(false);
	                System.out.println("Buttons Pressed: " + sum);
	            } else {
	                redLED.setState(true);
	            }

	            Thread.sleep(150);
	        }
	    }
	}
	  

