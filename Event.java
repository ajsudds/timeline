/**
 * @author Kurt Andres
 * The below attached Event interface for DurationEvent and AtomicEvent
 */
public interface Event {
	
	//sets the total event except for endDate if DurationEvent
	public void setEvent(String n, String sD, String d, String c);
	
	//set event name
	public void setName(String n);

	//sets event StartDate
	public void setStartDate(String sD);
	
	//sets even Description
	public void setDescription(String d);
	
	//sets event category
	public void setCategory(String c);

	//return event Name
	public String getName();
	
	//returns event StartDate
	public String getStartDate();
	
	//returns event Description
	public String getDescription();
	
	//returns event category
	public String getCategory();
}
