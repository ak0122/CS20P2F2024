import com.phidget22.*;

public class ButtonEvents {

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
        


        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e1) {
                 if (e1.getState() == true)
                 {
                	 System.out.println("Pressed");
                 }
                 
                 else if (e1.getState() == false)
                 {
                	 System.out.println("Not Pressed");
                 }
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e2) {
                 if (e2.getState() == true)
                 {
                	 try {
						greenLED.setState(true);
					} catch (PhidgetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                 }
                 
                 else if (e2.getState() == false)
                 {
                	 try {
						greenLED.setState(false);
					} catch (PhidgetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
                 }
            }
        });
        //Open
        redButton.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(5000);
        }
    }
}
