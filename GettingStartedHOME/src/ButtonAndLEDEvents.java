//Add Phidgets Library
	import com.phidget22.*;
public class ButtonAndLEDEvents {
	  
	

	    //Turn on/off LEDs with Global Variables
	    static boolean turnRedLEDOn = false;
	    static boolean turnGreenLEDOn = false;
	    static int player1 = 0;
        static int player2 = 0;

	    //Handle Exceptions
	    public static void main(String[] args) throws Exception {

	        //Create
	        DigitalInput redButton = new DigitalInput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);
	        
	        //Open
	        redLED.open(1000);
	        greenLED.open(1000);
	        redButton.open(1000);
	        greenButton.open(1000);

	        //Event 
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                //Record button state to turn on/off the red LED
	                if(e.getState())
	                {
	                	turnRedLEDOn = true;
	                	player1 += 1;
	                	System.out.println("Player 1: " + player1);
	                }
	                
	                else {
	                	turnRedLEDOn =false;
	                }
	                
	            }
	        });

	        //Event 
	        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                //Record button state to turn on/off the green LED
	            	if(e.getState()) {
	            	turnGreenLEDOn = true;
	            	player2+=1;
	                System.out.println("Player 2: " + player2);
	                
	            }
	            
	            else {
                	turnGreenLEDOn =false;
                }
	            
	        }});

	        

	        System.out.println("Player 1 is Red and Player 2 is Green");
	        
	        while(player1 < 10 && player2 < 10) {
	            //turn red LED on based on red button input
	            redLED.setState(turnRedLEDOn);
	            //turn green LED on based on green button input
	            greenLED.setState(turnGreenLEDOn);
	            //sleep for 50 milliseconds 
	            Thread.sleep(50);
  
	        }
	        
	        redButton.close();
        	greenButton.close();
        	
	        if(player1 == 10) {
	        	
	        	greenLED.close();
	        	System.out.print("Player 1 Wins!");
	        	
	        	for(int i = 0; i<5; i++)
	        	{
	        		 redLED.setState(true);
	        	        Thread.sleep(500);
	        	        redLED.setState(false);
	        	        Thread.sleep(500);
	        	}
	        }
	       else {
	    	   System.out.print("Player 2 Wins!");
	    	   redLED.close();
	        	for(int i = 0; i<5; i++)
	        	{
	        		 greenLED.setState(true);
	        	        Thread.sleep(500);
	        	        greenLED.setState(false);
	        	        Thread.sleep(500);
	        	        
	        	}
	       }
	    }
	}
