package za.co.capetown.lggames.domain.reservation;

import jakarta.persistence.*;
import za.co.capetown.lggames.domain.authentication.User;

import java.time.LocalDateTime;
@Entity
public class Booking {
    @Id
    private String bookingId;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private Event eventName;
    private String eventDescription;
    private int numberOfMembers;
    private int eventDuration;
    private LocalDateTime bookingDate;
    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    public Booking(){}

    private Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.user = builder.user;
        this.eventName = builder.eventName;
        this.eventDescription = builder.eventDescription;
        this.numberOfMembers = builder.numberOfMembers;
        this.eventDuration = builder.eventDuration;
        this.bookingDate = builder.bookingDate;
        this.status = builder.status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser(){
        return user;
    }

    public Event getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public int getEventDuration() {
        return eventDuration;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public static class Builder {
        private String bookingId;
        private User user;
        private Event eventName;
        private String eventDescription;
        private int numberOfMembers;
        private int eventDuration;
        private LocalDateTime bookingDate;
        private BookingStatus status;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setUser(User user){
            this.user = user;
            return this;
        }

        public Builder setEventName(Event eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder setEventDescription(String eventDescription) {
            this.eventDescription = eventDescription;
            return this;
        }

        public Builder setNumberOfMembers(int numberOfMembers) {
            this.numberOfMembers = numberOfMembers;
            return this;
        }

        public Builder setEventDuration(int eventDuration) {
            this.eventDuration = eventDuration;
            return this;
        }

        public Builder setBookingDate(LocalDateTime bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setStatus(BookingStatus status) {
            this.status = status;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.eventName = booking.eventName;
            this.eventDescription = booking.eventDescription;
            this.numberOfMembers = booking.numberOfMembers;
            this.eventDuration = booking.eventDuration;
            this.bookingDate = booking.bookingDate;
            this.status = booking.status;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

    }
}
