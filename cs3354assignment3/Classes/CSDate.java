package Classes;
public class CSDate {
    private int day;
    private int month;
    private int year;
    
    // Default constructor that initializes the date to 1 Jan 1800
    public CSDate() {
        this(1, 1, 1800);  // Calls the parameterized constructor with default values
    }
    
    // Parameterized constructor that sets the date, ensuring it's a valid date
    public CSDate(int d, int m, int y) {
        // If the date is invalid, it sets to default values (1 Jan 1800)
        if (!isValidDate(d, m, y)) {
            this.day = 1;
            this.month = 1;
            this.year = 1800;
        } else {
            this.day = d;
            this.month = m;
            this.year = y;
        }
    }
    
    // Getter for the day
    public int getDay() { 
        return day; 
    }

    // Setter for the day with validation
    public void setDay(int d) { 
        if (isValidDate(d, this.month, this.year)) 
            this.day = d; 
    }
    
    // Getter for the month
    public int getMonth() { 
        return month; 
    }

    // Setter for the month with validation
    public void setMonth(int m) { 
        if (isValidDate(this.day, m, this.year)) 
            this.month = m; 
    }
    
    // Getter for the year
    public int getYear() { 
        return year; 
    }

    // Setter for the year, ensuring it's within the valid range
    public void setYear(int y) { 
        if (y >= 1800 && y <= 2025) 
            this.year = y; 
    }
    
    // This method returns the month name based on the numeric month value
    public String getMonthName() {
        // Array of month names
        String[] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        return months[month - 1]; // Subtract 1 because array indices are zero-based
    }
    
    // Private helper method to validate a date
    private boolean isValidDate(int d, int m, int y) {
        // Check if month is between 1 and 12, day is between 1 and 31, and year is within the valid range
        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1800 || y > 2025) 
            return false;

        // Array for the number of days in each month (non-leap year)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check if the day is within the valid range for the month
        return d <= daysInMonth[m - 1];
    }

    // Override the toString() method to print the date in a readable format
    @Override
    public String toString() {
        // Returns a string with the format: "day monthName year"
        return day + " " + getMonthName() + " " + year;
    }
}

