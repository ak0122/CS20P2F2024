import com.phidget22.DigitalInput;

public class ReadButton {
	//Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput greenButton = new DigitalInput();
        
        //Address 

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        greenButton.open(1000);
        

        //Use your Phidgets
        boolean state_i = greenButton.getState();
        while(true) {
        	boolean state_f = greenButton.getState();
        	if(state_f != state_i) {
            System.out.println("Button State: " + greenButton.getState());
            state_i = state_f;
        	}
            Thread.sleep(150);
        }	
    }
}
