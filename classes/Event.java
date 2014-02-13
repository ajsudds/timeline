/**
 * @author Kurt Andres
 * The below attached Event interface for DurationEvent and AtomicEvent
 */
//After reading datastructures/ and algorithms book for other class,
//i have feeling in real project we should use abstract class so we
//have great flexibility to add more methods and don't have to write
//methods twice.

public interface Event {

	//sets the total event except for endDate if DurationEvent
	public void setEvent(String n, String sY, String sM, String sD, String eY, String eM, String eD, String d, String c);

	//set event name
	public void setName(String n);

	//set start year
	public void setStartYear(String sY);

	//set start month
	public void setStartMonth(String sM);

	//set start day
	public void setStartDay(String sD);

	//set end year
	public void setEndYear(String sY);

	//set end month
	public void setEndMonth(String sM);

	//set end day
	public void setEndDay(String sD);

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
