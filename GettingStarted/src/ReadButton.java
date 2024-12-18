import com.phidget22.DigitalInput;

public class ReadButton {
	//Handle Exceptions 
    public static void main(String[] args) throws Exception{
        
        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        
        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        greenButton.open(1000);
        

        //Use your Phidgets 
        while(true){
            boolean state_i = false;
            
            boolean state_f = greenButton.getState();
        	if (state_i != state_f )
        	{
            System.out.println("Button State: " + greenButton.getState());
            Thread.sleep(150);
        }
    }
}
}
  
