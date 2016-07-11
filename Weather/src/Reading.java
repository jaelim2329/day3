import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Reading {
    
    private String day;
    private int hour;
    private int temp;
    private int windSpeed;

    public Reading() {
    }

    public Reading(String input){
        String[] elements = input.split(", ");
        System.out.println(Arrays.toString(elements));
        day = elements[0];
        hour = Integer.valueOf(elements[1]);
        temp = Integer.valueOf(elements[2]);
        windSpeed = Integer.valueOf(elements[3]);
    }

    public static void main(String[] args) throws Throwable {
        BufferedReader br = Files.newBufferedReader(Paths.get("weather.csvx"));
        Reading[] readings = new Reading[12];
        String line;
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }
        
        for (Reading r : readings) {
        	System.out.println(r.getTime() + " was " + r.rateTemperature());
        }
        
        
    }
    
    public String rateTemperature() {
    	int temperature = this.temp; 
    	
    	if (temperature < 55) {
    		return "cold";
    	}
    	else if (temperature < 65) {
    		return "mild";
    	}
    	else if (temperature < 80) {
    		return "warm";
    	}
    	else {
    		return "hot";
    	}
    }
    
    public String getTime() {
    	StringBuilder sb = new StringBuilder();
    	String day = this.day;
    	int hour = this.hour;
    	
    	sb.append(day);
    	if (hour < 9) {
    		sb.append(" morning");
    	}
    	else if (hour < 15) {
    		sb.append(" afternoon");
    	}
    	else {
    		sb.append(" evening");
    	}
    	return sb.toString();
    	
    	
    }
}
