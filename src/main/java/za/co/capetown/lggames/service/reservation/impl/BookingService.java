package za.co.capetown.lggames.service.reservation.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.capetown.lggames.domain.reservation.Booking;
import za.co.capetown.lggames.repository.reservation.IBookingRepository;
import za.co.capetown.lggames.service.reservation.IBookingService;

import java.util.List;

@Service
public class BookingService implements IBookingService {

    @Autowired
    private IBookingRepository bookingRepository;

    @Override
    public void cancelBooking(String bookingId) {

    }

    @Override
    public Booking create(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking read(String bookingId) {
        return bookingRepository.getReferenceById(bookingId);
    }

    @Override
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking update(String bookingId,Booking booking) {
        if(booking.getBookingId() != null) {
            return bookingRepository.save(booking);
        }
        return null;
    }

    @Override
    public void delete(String bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}
