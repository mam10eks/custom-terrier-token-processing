package de.webis.custom_terrier_token_processing;

import org.junit.Assert;
import org.junit.Test;
import org.terrier.terms.StanfordLemmatizer;
import org.terrier.terms.StemmerTermPipeline;

public class TestCustomStanfordLemmatizer {
	private final StemmerTermPipeline lemmatizer = new StanfordLemmatizer();
	
	@Test
	public void testProduce() {
		String expected = "produce";
		String actual = lemmatizer.stem("produce");

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testProduces() {
		String expected = "produce";
		String actual = lemmatizer.stem("produces");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testProducer() {
		String expected = "producer";
		String actual = lemmatizer.stem("producer");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testProducers() {
		String expected = "producer";
		String actual = lemmatizer.stem("producers");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testBe() {

		String expected = "be";
		String actual = lemmatizer.stem("be");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testAre() {
		String expected = "be";
		String actual = lemmatizer.stem("are");
		
		Assert.assertEquals(expected, actual);
	}
}
