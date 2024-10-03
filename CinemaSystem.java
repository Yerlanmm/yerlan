import ui.*;
import booking.TicketBooking;
import schedule.*;

public class CinemaSystem {
    public static void main(String[] args) {
        UIFactory darkThemeFactory = new DarkThemeFactory();
        UIFactory lightThemeFactory = new LightThemeFactory();


        Button darkButton = darkThemeFactory.createButton();
        TextField darkTextField = darkThemeFactory.createTextField();
        darkButton.render();
        darkTextField.render();


        Button lightButton = lightThemeFactory.createButton();
        TextField lightTextField = lightThemeFactory.createTextField();
        lightButton.render();
        lightTextField.render();


        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A10")
                .setSnackCombo("Popcorn and Soda")
                .setScreeningType("IMAX")
                .build();


        System.out.println(booking);


        MovieSchedule templateSchedule = new StandardSchedule("Inception", "18:00", "2024-10-05");


        templateSchedule.displaySchedule();


        MovieSchedule clonedSchedule1 = templateSchedule.clone();
        clonedSchedule1.setTime("21:00");
        clonedSchedule1.displaySchedule();
        MovieSchedule clonedSchedule2 = templateSchedule.clone();
        clonedSchedule2.setDate("2024-10-06");
        clonedSchedule2.displaySchedule();
        MovieSchedule clonedSchedule3 = templateSchedule.clone();
        clonedSchedule3.setTime("15:00");
        clonedSchedule3.setDate("2024-10-07");
        clonedSchedule3.displaySchedule();
    }
}





















