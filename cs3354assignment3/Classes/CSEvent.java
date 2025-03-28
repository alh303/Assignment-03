package Classes;

public class CSEvent {

  //**************************************************
  //Private variables
	private String name;
  	private String description;
  	private CSDateTime eventDate;
  //**************************************************
  
  //**************************************************
  //Accessor functions
  	public String getName()
  {
    	return name;
  }
  	public String getDescription() 
  {
    	return description;
  }
  	public CSDateTime getEventDateTime()
  {
    	return eventDate;
  }
  //**************************************************
  
  
  //**************************************************
  //Mutator functions
	public void setName(String n)
  {
    	if(n.equals("") || n == null)
    	{
      		name = "Unknown";
      	} else {
      		name = n;
      	}	
  }
  	public void setDescription(String d)
  {
    	if(d == null)
    	{
      		description = "";
    	} else {
      		description = d;
    	}
  }
  //**************************************************
  //toString function that returns the string description of the overall event in 3 lines.
  	@Override
  	public String toString()
  {
    	return "[" + name + "]\n" + description + "\n" + eventDate.toString();
  }
  //**************************************************
  
  
  //**************************************************
  //Constructor that uses input to assign values to the variables members.
  public CSEvent(String n, String d, int day, int m, int y, int h, int min)
  {
    setName(n);
    setDescription(d);
    eventDate = new CSDateTime(day, m, y, h, min);
  }
  //**************************************************
}
