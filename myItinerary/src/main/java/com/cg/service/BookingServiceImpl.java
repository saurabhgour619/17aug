package com.cg.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.BookingDAO;
import com.cg.entities.Dining;
import com.cg.entities.Resort;

@Transactional
@Service
public class BookingServiceImpl implements BookingService {
	private static final Logger LOGGER = LogManager.getLogger("BookingServiceImpl.class");

	@Autowired
	BookingDAO bookingDAO;

	/* Resort Booking Service */
	@Override
	public Resort bookResort(Resort resort, long guestID) {
		LOGGER.debug("BookingServiceImpl:Debugging bookResort method");
		LOGGER.info("BookingServiceImpl: Executing bookResort method.");
		return bookingDAO.bookResort(resort, guestID);
	}

	@Override
	public Resort updateBookResort(Resort resort, long resortBookingId) {
		LOGGER.debug("BookingServiceImpl:Debugging updateBookResort method");
		LOGGER.info("BookingServiceImpl: Executing updateBookResort method.");
		return bookingDAO.updateBookResort(resort, resortBookingId);
	}

	@Override
	public Resort cancelBookResort(long resortBookingId) {
		LOGGER.debug("BookingServiceImpl:Debugging cancelBookResort method");
		LOGGER.info("BookingServiceImpl: Executing cancelBookResort method.");
		return bookingDAO.cancelBookResort(resortBookingId);
	}

	/* Dining Booking Service */
	@Override
	public Dining bookDining(Dining dining, long diningBookingId) {
		LOGGER.debug("BookingServiceImpl:Debugging bookDining method");
		LOGGER.info("BookingServiceImpl: Executing bookDining method.");
		return bookingDAO.bookDining(dining, diningBookingId);

	}

	@Override
	public Dining updateBookedDining(Dining dining, long diningBookingId) {
		LOGGER.debug("BookingServiceImpl:Debugging updateBookedDining method");
		LOGGER.info("BookingServiceImpl: Executing updateBookedDining method.");
		return bookingDAO.updateBookedDining(dining, diningBookingId);
	}

	@Override
	public Dining cancelBookedDining(long diningBookingId) {
		LOGGER.debug("BookingServiceImpl:Debugging cancelBookedDining method");
		LOGGER.info("BookingServiceImpl: Executing cancelBookResort method.");
		return bookingDAO.cancelBookedDining(diningBookingId);
	}

	/* View Booking Service */
	@Override
	public List<Resort> getAllResortDetails(long guest_id) {
		LOGGER.debug("BookingServiceImpl:Debugging getAllResortDetails method");
		LOGGER.info("BookingServiceImpl: Executing getAllResortDetails method.");
		return bookingDAO.getAllResortDetails(guest_id);
	}

	@Override
	public List<Dining> getAllDiningDetails(long guest_id) {
		LOGGER.debug("BookingServiceImpl:Debugging getAllDiningDetails method");
		LOGGER.info("BookingServiceImpl: Executing getAllDiningDetails method.");
		return bookingDAO.getAllDiningDetails(guest_id);
	}

	@Override
	public Resort getResort(long rReservationNumber) {
		LOGGER.debug("BookingServiceImpl:Debugging getResort method");
		LOGGER.info("BookingServiceImpl: Executing getResort method.");
		return bookingDAO.getResort(rReservationNumber);
	}

	@Override
	public Dining getDining(long dReservationNumber) {
		LOGGER.debug("BookingServiceImpl:Debugging getDining method");
		LOGGER.info("BookingServiceImpl: Executing getDining method.");
		return bookingDAO.getDining(dReservationNumber);
	}

}
