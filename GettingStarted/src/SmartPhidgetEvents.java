	//Add Phidgets Library
	import com.phidget22.*;


public class SmartPhidgetEvents {


	    public static void main(String[] args) throws Exception {
	        
	        //Create
	        HumiditySensor humiditySensor = new HumiditySensor();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	        //Open
	        humiditySensor.open(1000);
	        temperatureSensor.open(1000);
	        
	        
	        //Humidity Event 
	        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
	            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
	                System.out.println("Humidity: " + e.getHumidity() + "%RH");
	            }
	        });
	        
	        //Temperature Event
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	            	if (e.getTemperature()<21)
	            	{
	            		System.out.println("The room is too cold");
	            	}
	            	else {
	            		System.out.println("Temperature: " + e.getTemperature() + "°C");
	            	}
	                
	            }
	        });

	        

	        //Keep program running
	        while (true) {
	            Thread.sleep(150);
	        }
	    }
	}
