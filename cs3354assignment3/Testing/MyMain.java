package Testing;
// Notes for Partner:
// - Implement the CSEvent class.
// - Ensure it contains a CSDateTime object.
// - Implement the getName, getDescription, and getEventDateTime methods.
// - Implement the setName and setDescription methods.
// - Override 
// - Implement MyMain.java 

import Classes.CSDate;
import Classes.CSDateTime;

public class MyMain {
    public static void main(String[] args) {
        // Create a CSDate object with a specific date
        CSDate date = new CSDate(15, 9, 2024);
        
        // Print the CSDate using the toString method
        System.out.println("CSDate: " + date);  // It will print: 15 Sept 2024
        
        // Create a CSDateTime object with a specific date and time
        CSDateTime dateTime = new CSDateTime(15, 9, 2024, 10, 30);
        
        // Print the CSDateTime using the toString method
        System.out.println("CSDateTime: " + dateTime);  // It will print: 09/15/2024 10:30
        
        // Modify the date and time for both objects
        date.setDay(20);
        date.setMonth(10);
        date.setYear(2025);
        
        dateTime.setDay(20);
        dateTime.setMonth(10);
        dateTime.setYear(2025);
        dateTime.setHours(14);
        dateTime.setMinutes(45);
        
        // Print the updated CSDate and CSDateTime
        System.out.println("Updated CSDate: " + date);  // It will print: 20 Oct 2025
        System.out.println("Updated CSDateTime: " + dateTime);  // It will print: 10/20/2025 14:45
    }
}
