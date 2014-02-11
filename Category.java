/**
 * @author Kurt
 *
 */
import java.util.*;


public class Category {
	// Create a hash map
	TreeMap<String, Timeline> categories = new TreeMap<String, Timeline>();  
	
	public Category(){
		categories = null;
	}

	public void addCategory(Event newEvent){
		categories.put(newEvent.getStartDate(), newEvent);
	}

}
