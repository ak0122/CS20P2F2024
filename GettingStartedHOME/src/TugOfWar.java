import com.phidget22.*;


public class TugOfWar {
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
        
        int player1 = 0;
        int player2 = 0;
        
        System.out.println("Player 1 is Red");
        System.out.println("Player 2 is Green");
        
        while(player1 < 10 && player2 < 10)
        {
        	if(redButton.getState())
        	{
        		player1++;
        		
        		
        		System.out.println("Player 1: " + player1);
        		
        		Thread.sleep(150);
        	}
        	
        	
        	if(greenButton.getState())
        	{
        		player2++;
        		
        		
        		System.out.println("Player 2: " + player2);
        		
        		Thread.sleep(150);
        	}
        	Thread.sleep(100);
        }
        
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(1000);
        
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(1000);
        
        if(player1 == 10)
        {
        	System.out.print("Player 1 Wins!");
        	
        	for(int i = 0; i<5; i++)
        	{
        		 redLED.setState(true);
        	        Thread.sleep(1000);
        	        redLED.setState(false);
        	        Thread.sleep(1000);
        	}
        }
        
        if (player2 == 10)
        {
        	System.out.print("Player 2 Wins!");
        	
        	for(int i = 0; i<5; i++)
        	{
        		 greenLED.setState(true);
        	        Thread.sleep(1000);
        	        greenLED.setState(false);
        	        Thread.sleep(1000);
        	}
        }
    }
}
