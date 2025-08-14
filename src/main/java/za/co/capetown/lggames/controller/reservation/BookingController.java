package za.co.capetown.lggames.controller.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.capetown.lggames.domain.reservation.Booking;
import za.co.capetown.lggames.service.reservation.impl.BookingService;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<Booking> create(@RequestBody Booking booking) {
        return ResponseEntity.ok(bookingService.create(booking));
    }

}
