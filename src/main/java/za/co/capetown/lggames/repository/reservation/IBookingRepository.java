package za.co.capetown.lggames.repository.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.capetown.lggames.domain.reservation.Booking;

@Repository
public interface IBookingRepository extends JpaRepository<Booking, String> {

}
