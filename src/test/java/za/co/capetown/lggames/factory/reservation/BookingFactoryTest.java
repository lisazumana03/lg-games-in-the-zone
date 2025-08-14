package za.co.capetown.lggames.factory.reservation;

import org.junit.jupiter.api.Test;
import za.co.capetown.lggames.domain.authentication.User;
import za.co.capetown.lggames.domain.reservation.Booking;
import za.co.capetown.lggames.domain.reservation.BookingStatus;
import za.co.capetown.lggames.domain.reservation.Event;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {
        String bookingId = "PS0001";
        User user = new User();
        Event eventName = Event.GAMING_TOURNAMENTS;
        String eventDescription = "Anything goes here.";
        int numberOfMembers = 31;
        int eventDuration = 60;
        LocalDateTime bookingDate = LocalDateTime.now();
        BookingStatus bookingStatus = BookingStatus.PENDING;
        Booking booking = BookingFactory.createBooking(bookingId, user, eventName,
                eventDescription, numberOfMembers,
                eventDuration, bookingDate, bookingStatus);
        System.out.println(booking);
        assertNotNull(booking);
    }
}