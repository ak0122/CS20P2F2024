import com.phidget22.*;

public class ButtonEvents {

	static boolean turnGreenLEDon = false;
	 //Handle Exceptions
    public static void main(String[] args) throws Exception {
       
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        //Open
        redButton.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);


        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                 if (e.getState())
                 {
                	 System.out.println("Pressed");
                 }
                 
                 else
                 {
                	 System.out.println("Not Pressed");
                 }
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                 if (e.getState())
                 {
                	 turnGreenLEDon = true;
                 }
                 
                 else
                 {
                	 turnGreenLEDon = false;
                 }
            }
        });
        

        //Keep program running
        while (true) {
            Thread.sleep(10);
            greenLED.setState(turnGreenLEDon);
        }
    }
}
