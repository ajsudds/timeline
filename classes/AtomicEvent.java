/**
 * @author Kurt Andres
 *
 */
//may want to use the following for simple date output for getDate()
//import java.text.SimpleDateFormat;

public class AtomicEvent implements Event {

	public String name; //event name
	public String startDate; //event start date
	public String description; //event description
	public String category; //category to associate event with

	public void setEvent(String n, String sD, String d, String c){
		name = n;
		startDate = sD;
		description = d;
		category = c;
	}

	public void setName(String n){
		name = n;

	}

	public void setStartDate(String sD){
		startDate= sD;

	}

	public void setDescription(String d){
		description = d;

	}

	public void setCategory(String c){
		category = c;	
	}

	public String getName(){
		return name;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getDescription(){
		return description;
	}

	public String getCategory(){
		return category;
	}

}
