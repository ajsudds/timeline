/**
 * @author Kurt Andres
 *
 */
//may want to use the following for simple date output for getDate()
//import java.text.SimpleDateFormat;

public class DurationEvent implements Event {

	public String name; //event name
        
        public String endYear;
        public String endMonth;
        public String endDay;
        
        public String startYear;
        public String startMonth;
        public String startDay;
        
	public String timelineID; //event start date as continuous string
        
	public String description; //event description
	public String category; //category to associate event with
	public String endDate;

        public void setEvent(String n, String sY, String sM, String sD, String eY, String eM, String eD, String d, String c){
		name = n;
                startYear = sY;
                startMonth = sM;
                startDay = sD;
                endYear = eY;
                endMonth = eM;
                endDay = eD;
		description = d;
		category = c;
	}

	private void setEndDate(String eD) {
		endDay = eD;
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
