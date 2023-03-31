package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartitaTest {
	Partita partita=new Partita();

	@Test
	public void testIsFinita() {
		assertTrue(partita.isFinita());
	}
	
	@Test
	public void testIsFinitaSet() {
		partita.setFinita();
		assertTrue(partita.isFinita());
	}

}
