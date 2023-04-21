package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class BorsaTest {

	Borsa borsa = new Borsa();
	Attrezzo spada;
	Attrezzo martello;
	
	@Before
	public void setUp() {
		spada = new Attrezzo("spada", 10);
		martello = new Attrezzo("martello", 7);
	}

	@Test
	public void testAddAttrezzoPesoMinoreDiDieci() {
		assertTrue(borsa.addAttrezzo(spada));

	}
	
	@Test
	public void testAddAttrezzoPesoMaggioreDiDieci() {
		assertTrue(borsa.addAttrezzo(martello));

	}
	
	@Test
	public void testGetPeso() {
		borsa.addAttrezzo(spada);
		assertNotEquals(martello, borsa.getAttrezzo("spada"));

	}
}

