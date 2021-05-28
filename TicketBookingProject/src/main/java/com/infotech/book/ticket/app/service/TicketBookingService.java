package com.infotech.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Ticket getTicketById(int ticketId) {
		return ticketBookingDao.findById(ticketId).orElse(null);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
	public String deleteTicket(int ticketId) {
		ticketBookingDao.deleteById(ticketId);
		return "Deleted";
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.findById(ticketId).orElse(null);
		ticketFromDb.setEmail(newEmail);
		Ticket upadedTicket = ticketBookingDao.save(ticketFromDb);
		return upadedTicket;
	}
	public Ticket getTicketByEmail(String email) {
		return ticketBookingDao.findByEmail(email);
	}
	
	public boolean getTicketExistById(int id) {
		return ticketBookingDao.existsById(id);
	}
	
	
}
