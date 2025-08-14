package za.co.capetown.lggames.factory.reservation;

import za.co.capetown.lggames.domain.authentication.User;
import za.co.capetown.lggames.domain.reservation.Booking;
import za.co.capetown.lggames.domain.reservation.BookingStatus;
import za.co.capetown.lggames.domain.reservation.Event;

import java.time.LocalDateTime;

public class BookingFactory {
    public static Booking createBooking(String bookingId, User user, Event eventName,
                                        String eventDescription, int numberOfMembers, int eventDuration, LocalDateTime bookingDate,
                                        BookingStatus bookingStatus) {
        return new Booking.Builder()
                .setBookingId(bookingId)
                .setUser(user)
                .setEventName(eventName)
                .setEventDescription(eventDescription)
                .setNumberOfMembers(numberOfMembers)
                .setEventDuration(eventDuration)
                .setBookingDate(bookingDate)
                .setStatus(bookingStatus)
                .build();
    }

}
