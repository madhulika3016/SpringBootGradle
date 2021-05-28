package com.infotech.book.ticket.app.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

@SpringBootTest
public class TicketBookingServiceTest {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@MockBean
	private TicketBookingDao ticketBookingDao;
	
	@Test
	//@Ignore
	public void testCreateTicket(){

		Ticket ticket = new Ticket();
		ticket.setTicketId(1);
		ticket.setPassengerName("Madhu Dubey");
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("Delhi");
		ticket.setBookingDate(new Date());
		ticket.setEmail("madhu.123@gmail.com");
		
	    Mockito.when(ticketBookingDao.save(ticket)).thenReturn(ticket);
	    
	    assertThat(ticketBookingService.createTicket(ticket)).isEqualTo(ticket);
	
	}
	
	
	@Test
	public void testGetTicketById(){
		Ticket ticket = new Ticket();
		ticket.setTicketId(1);
		ticket.setPassengerName("Madhu Dubey");
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("Delhi");
		ticket.setBookingDate(new Date());
		ticket.setEmail("madhu.123@gmail.com");
		Optional<Ticket> ticket1=Optional.ofNullable(ticket);
		
	    Mockito.when(ticketBookingDao.findById(1)).thenReturn(ticket1);
	    assertThat(ticketBookingService.getTicketById(1)).isEqualTo(ticket);
	}
	
	@Test
	public void testGetAllBookedTickets(){
		Ticket ticket1 = new Ticket();
		ticket1.setPassengerName("Madhuri Bindra");
		ticket1.setSourceStation("Kolkata");
		ticket1.setDestStation("Delhi");
		ticket1.setBookingDate(new Date());
		ticket1.setEmail("madhuri.s2017@gmail.com");
		
		Ticket ticket2 = new Ticket();
		ticket2.setPassengerName("Sia Mishra");
		ticket2.setSourceStation("Kolkata");
		ticket2.setDestStation("Mumbai");
		ticket2.setBookingDate(new Date());
		ticket2.setEmail("sia.123@gmail.com");
		
		List<Ticket> ticketList = new ArrayList<>();
		ticketList.add(ticket1);
		ticketList.add(ticket2);
		
		Mockito.when(ticketBookingDao.findAll()).thenReturn(ticketList);
		
		assertThat(ticketBookingService.getAllBookedTickets()).isEqualTo(ticketList);
	}
	
	
	@Test
	public void testDeleteTicket(){
		Ticket ticket=new Ticket();
		ticket.setTicketId(1);
		ticket.setPassengerName("Madhu");
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("Delhi");
		ticket.setBookingDate(new Date());
		ticket.setEmail("madhu.123@gmail.com");
		Optional<Ticket> ticket1=Optional.ofNullable(ticket);
	    Mockito.when(ticketBookingDao.findById(1)).thenReturn(ticket1);
	    Mockito.when(ticketBookingDao.existsById(ticket.getTicketId())).thenReturn(false);
	   assertFalse(ticketBookingService.getTicketExistById(ticket.getTicketId()));
	}
	
	
	@Test
	public void testUpdateTicket(){
		Ticket ticket = new Ticket();
		ticket.setTicketId(1);
		ticket.setPassengerName("Madhu Dubey");
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("Delhi");
		ticket.setBookingDate(new Date());
		ticket.setEmail("madhu.123@gmail.com");
		Optional<Ticket> ticket1=Optional.ofNullable(ticket);
		
		Mockito.when(ticketBookingDao.findById(1)).thenReturn(ticket1);
		
		ticket.setEmail("madhu.456@gmail.com");
		Mockito.when(ticketBookingDao.save(ticket)).thenReturn(ticket);
		
		assertThat(ticketBookingService.updateTicket(1, "madhu.456@gmail.com")).isEqualTo(ticket);
		
	}
	
	@Test
	public void testGetTicketByEmail(){
		
		Ticket ticket = new Ticket();
		ticket.setTicketId(1);
		ticket.setPassengerName("Madhu Dubey");
		ticket.setSourceStation("Mumbai");
		ticket.setDestStation("Delhi");
		ticket.setBookingDate(new Date());
		ticket.setEmail("madhu.123@gmail.com");
		
	    Mockito.when(ticketBookingDao.findByEmail("madhu.123@gmail.com")).thenReturn(ticket);
	    
	    assertThat(ticketBookingService.getTicketByEmail("madhu.123@gmail.com")).isEqualTo(ticket);
	}
	
}
