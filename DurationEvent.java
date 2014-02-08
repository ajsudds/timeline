/**
 * 
 */

/**
 * @author Kurt Andres
 *
 */
public class DurationEvent implements Event {

	public String name; //event name
	public String startDate; //event start date
	public String description; //event description
	public String category; //category to associate event with
	public String endDate;

	public void setEvent(String n, String sD, String d, String c) {
		name = n;
		startDate = sD;
		description = d;
		category = c;
	}

	private void setEndDate(String eD) {
		endDate = eD;
	}

	public void setName(String n) {
		name = n;

	}

	public void setStartDate(String sD) {
		startDate= sD;

	}

	public void setDescription(String d) {
		description = d;

	}

	public void setCategory(String c) {
		category = c;	
	}

	public String getName() {
		return name;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

}
