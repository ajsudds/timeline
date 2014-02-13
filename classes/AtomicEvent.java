/**
 * @author Kurt Andres
 *
 */
//may want to use the following for simple date output for getDate()
//import java.text.SimpleDateFormat;

public class AtomicEvent implements Event {

	public String name; //event name
        public String startYear;
        public String startMonth;
        public String startDay;
        
        public String endYear;
        public String endMonth;
        public String endDay;
        
	public String timelineID; //event start date as continuous string for treeMap key
	public String description; //event description
	public String category; //category to associate event with

	public void setEvent(String n, String sY, String sM, String sD, String eY, String eM, String eD, String d, String c){
		name = n;
                startYear = sY;
                startMonth = sM;
                startDay = sD;
                endYear = "null";
                endMonth = "null";
                endDay = "null";
		description = d;
		category = c;
        }

	public void setName(String n){
		name = n;

	}

	public void setStartYear(String sD){
		startYear= sD;

	}
        
        public void setStartMonth(String sD){
		startMonth= sD;

	}
        
        public void setStartDay(String sD){
		startDay= sD;

	}
        
        public void setEndYear(String sD){
		endYear= sD;

	}
        
        public void setEndMonth(String sD){
		endMonth= sD;

	}
        
        public void setEndDay(String sD){
		endDay= sD;
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
