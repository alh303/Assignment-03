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
import Classes.CSEvent;

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

        // Create a CSEvent with specific values
        CSEvent event = new CSEvent("Graduation", "Class graduation party for Spring 2025", 15, 5, 2025, 17, 0);

        // Print the CSEvent using the toString method
        System.out.println("CSEvent:");
        System.out.println(event.toString());   // It will print 3 lines: name, description, date

        // Modify all values for the CSEvent object
        event.setName("Meeting");
        event.setDescription("Need to discuss actions for the coming financial quarter.");
        event.getEventDateTime().setDay(14);
        event.getEventDateTime().setMonth(3);
        event.getEventDateTime().setYear(2023);
        event.getEventDateTime().setHours(12);
        event.getEventDateTime().setMinutes(30);

        // Print the modified CSEvent using the toString method
        System.out.println("Updated CSEvent:");
        System.out.println(event.toString());   // It will print 3 lines: name, description, date
    }
}
