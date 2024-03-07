package PojoClassesDesirialization;

public class BookingPojo {
	
	public String bookingid;

	public String getBookingId() {
		return bookingid;
	}

	public void setBookingId(String bookingId) {
		bookingid = bookingId;
	}

	@Override
	public String toString() {
		return "BookingPojo [bookingid=" + bookingid + "]";
	}

}
