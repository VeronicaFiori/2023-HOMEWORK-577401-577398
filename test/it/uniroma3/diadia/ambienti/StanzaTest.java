package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;



import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

import org.junit.Test;

public class StanzaTest {
	
	 Attrezzo osso=new Attrezzo("Osso",20);
	 Attrezzo martello = new Attrezzo("Martello", 42);
	 Attrezzo spada=new Attrezzo("Spada",15);
	 Stanza s1 = new Stanza("s1");
	 Stanza s2= new Stanza("s2");
	
	
	/*Test getstanzaAdiacente*/
	@Test
	public void testGetStanzaAdiacente1() {
		assertNull(s1.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetStanzaAdiacente2() {
		assertNull(s2.getStanzaAdiacente("nord"));
	}
	
	
	/*Test impostaStanzaAdiacente*/
	@Test
	public void testImpostaStanzaAdiacentes1() {
		s1.impostaStanzaAdiacente("sud", s2);
		assertEquals(s2, s1.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testImpostaStanzaAdiacentes2() {
		s2.impostaStanzaAdiacente("nord", s1);
		assertEquals(s1, s2.getStanzaAdiacente("nord"));
	}
	
	/*Test AddAttrezzo*/
	@Test
	public void testAddAttrezzo2() {
		
		assertTrue(s1.addAttrezzo(martello));
	}
	
	@Test
	public void testAddAttrezzo2attrezzi() {
		assertTrue(s1.addAttrezzo(spada));
		assertEquals(spada,s1.getAttrezzo("Spada"));
	}
	
}

