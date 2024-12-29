	//Add Phidgets Library
	import com.phidget22.*;
public class AttachDetachEvents {

		static boolean turnRedLEDon = false;


	    public static void main(String[] args) throws Exception {
	       
	         //Create
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        
	      //Address
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        
	      //Open
	        temperatureSensor.open(1000);
	        redButton.open(1000);
	        redLED.open(1000);

	        //Data Event
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	                //Print temperature
	                System.out.println("Temperature: " + e.getTemperature() + "°C");
	            }
	        });

	        //Attach Event 
	        temperatureSensor.addAttachListener(new AttachListener() {
	            public void onAttach(AttachEvent e) {
	                System.out.println("Attach Temperature Sensor!");
	            }
	        });

	        //Detach Event
	        temperatureSensor.addDetachListener(new DetachListener() {
	            public void onDetach(DetachEvent e) {
	                System.out.println("Detach Temperature Sensor!");
	            }
	        });

	        //Data event for button + LED
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	        	public void onStateChange(DigitalInputStateChangeEvent e) {
	        		if(e.getState()) {
	        			turnRedLEDon = true;
	        		}
	        		else {
	        			turnRedLEDon = false;
	        		}
	        	}
	        });
	        
	        //Attach event for button
	        redButton.addAttachListener(new AttachListener() {
	        	public void onAttach(AttachEvent e) {
	        		System.out.println("Attach Red Button!");
	        	}
	        });
	        
	      //Detach event for LED
	        redButton.addDetachListener(new DetachListener() {
	        	public void onDetach(DetachEvent e) {
	        		System.out.println("Detach Red Button!");
	        	}
	        });
	        
	      //Attach event for button
	        redLED.addAttachListener(new AttachListener() {
	        	public void onAttach(AttachEvent e) {
	        		System.out.println("Attach Red LED!");
	        		
	        		 try {
	        	            // Reopen the red LED
	        	            redLED.setHubPort(1);
	        	            redLED.setIsHubPortDevice(true);
	        	            redLED.open(1000);
	        	        } catch (PhidgetException ex) {
	        	            System.err.println("Error reinitializing Red LED: " + ex.getMessage());
	        	        }
	        	}
	        });
	        
	      //Detach event for button
	        redLED.addDetachListener(new DetachListener() {
	        	public void onDetach(DetachEvent e) {
	        		System.out.println("Detach Red LED!");
	        	}
	        });
	        

	        //Keep program running
	        while (true) {
	            try {
	                Thread.sleep(150);
	                if (redLED.getAttached()) { // Check if the device is attached
	                    redLED.setState(turnRedLEDon);
	                } else {
	                    System.out.println("Red LED is not attached.");
	                }
	            } catch (PhidgetException ex) {
	                System.err.println("Error in while loop: " + ex.getMessage());
	            }
	        }
	    }
	}
