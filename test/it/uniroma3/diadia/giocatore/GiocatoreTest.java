package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
	
	Giocatore giocatore = new Giocatore();
	
	@Test
	public void testGetCfu() {
		assertEquals(20, giocatore.getCfu());
	}
	
	@Test
	public void testSetCfu() {
		giocatore.setCfu(12);
		assertEquals(12, giocatore.getCfu());
	}

	@Test
	public void testGetBorsa() {
		assertNotNull(giocatore.getBorsa());
	}
}
