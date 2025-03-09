package Classes;
public class CSDateTime extends CSDate {
    private int hours;   // Hours component of the date-time (0-23)
    private int minutes; // Minutes component of the date-time (0-59)
    
    // Default constructor that initializes the date-time to 1 Jan 1800, 00:00
    public CSDateTime() {
        this(1, 1, 1800, 0, 0);  // Calls the parameterized constructor with default values
    }
    
    // Parameterized constructor that sets the date and time, ensuring valid hours and minutes
    public CSDateTime(int d, int m, int y, int h, int min) {
        super(d, m, y);  // Calls the constructor of the superclass (CSDate) to initialize the date
        // Validate the hours (should be between 0 and 23) and minutes (should be between 0 and 59)
        this.hours = (h >= 0 && h <= 23) ? h : 0;  // Default to 0 if invalid
        this.minutes = (min >= 0 && min <= 59) ? min : 0;  // Default to 0 if invalid
    }
    
    // Getter for the hours
    public int getHours() { 
        return hours; 
    }

    // Setter for the hours with validation (ensures hours are between 0 and 23)
    public void setHours(int h) { 
        if (h >= 0 && h <= 23) 
            this.hours = h; 
    }
    
    // Getter for the minutes
    public int getMinutes() { 
        return minutes; 
    }

    // Setter for the minutes with validation (ensures minutes are between 0 and 59)
    public void setMinutes(int min) { 
        if (min >= 0 && min <= 59) 
            this.minutes = min; 
    }
    
    // Override the toString() method to return the date and time in a readable format
    @Override
    public String toString() {
        // Formats the output in the form of "DD/MM/YYYY HH:MM"
        // %02d ensures the day, month, hours, and minutes are always two digits
        return String.format("%02d/%02d/%d %02d:%02d", getMonth(), getDay(), getYear(), hours, minutes);
    }
}
