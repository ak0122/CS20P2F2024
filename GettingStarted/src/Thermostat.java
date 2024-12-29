
import com.phidget22.*;

public class Thermostat {
	
	private static double setT = 21;
	
	 public static void main(String[] args) throws Exception{
			//Create 
		    TemperatureSensor temperatureSensor = new TemperatureSensor();
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
		    temperatureSensor.open(1000);
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);
	        
	        
	        double previousSetT = setT;
	        
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	                //Print temperature
	                System.out.println("Temperature: " + e.getTemperature() + "°C");
	                System.out.println("Set Temperature: " + setT);
	                
	            }
	        });
	        
	        temperatureSensor.setDataInterval(10000);
	        
	      while(true)  
	      {   
	    	  if (setT == previousSetT) {
	    		  
	              if(greenButton.getState()){
	    	  setT += 1;
	    	  System.out.println("You have increased the temperature to " + setT);
	    	  Thread.sleep(150);
	      }
	      
	      else if(redButton.getState()){
	    	  setT -= 1;
	    	  System.out.println("You have decreased the temperature to " + setT);
	    	  Thread.sleep(150);
	      }
	              
	              previousSetT = setT;
	          }
	      
	      
	      
	      if(Math.abs( setT-(temperatureSensor.getTemperature()) ) < 2)
	      {
	    	  greenLED.setState(true);
	    	  redLED.setState(false);
	      }
	      
	      else
	      {
	    	  greenLED.setState(false);
	    	  redLED.setState(true);
	      }

	      Thread.sleep(150);	
	 }
}
}
