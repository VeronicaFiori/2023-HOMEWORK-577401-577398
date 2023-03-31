package it.uniroma3.diadia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {
	
	
	Labirinto labirinto;
	Stanza biblioteca;
	Stanza N10;

	@Before
	public void setUp() {
		labirinto = new Labirinto();
		biblioteca = new Stanza("Biblioteca");
		N10 = new Stanza("N10");
	}


	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", labirinto.getStanzaVincente().getNome());
	}


	@Test
	public void testSetStanzaCorrente() {
		labirinto.setStanzaCorrente(N10);
		assertEquals(N10, labirinto.getStanzaCorrente());
	}
	@Test
	public void testGetStanzaCorrente() {
		assertEquals("Atrio", labirinto.getStanzaCorrente().getNome());
	}

}
