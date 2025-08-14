package za.co.capetown.lggames.service.reservation;

import za.co.capetown.lggames.domain.reservation.Booking;
import za.co.capetown.lggames.service.IService;

public interface IBookingService extends IService<Booking, String> {
    void cancelBooking(String bookingId);
}
