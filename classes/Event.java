package classes;

/**
 * @author Kurt Andres
 * The below attached Event interface for DurationEvent and AtomicEvent
 */

public interface Event {

	//sets the total event except for endDate if DurationEvent
	public void setEvent(String n, int sY, int sM, int sD, int eY, int eM, int eD, String d, String c);

	//set event name
	public void setName(String n);
        
        //sets event timelineID
        public void setID(int sY, int sM, int sD);

	//set start year
	public void setStartYear(int sY);

	//set start month
	public void setStartMonth(int sM);

	//set start day
	public void setStartDay(int sD);

	//set end year
	public void setEndYear(int sY);

	//set end month
	public void setEndMonth(int sM);

	//set end day
	public void setEndDay(int sD);

	//sets event Description
	public void setDescription(String d);

	//sets event category
	public void setCategory(String c);

	//return event Name
	public String getName();

	//return event StartYear
        public int getStartYear();
        
        //return start month
        public int getStartMonth();
        
        //return start day
        public int getStartDay();
        
        //return end year
        public int getEndYear();
        
        //return end month
        public int getEndMonth();
        
        //return end day
        public int getEndDay();
        
        //return timelineID
        public int getID();
        
	//returns event Description
	public String getDescription();

	//returns event category
	public String getCategory();
}
