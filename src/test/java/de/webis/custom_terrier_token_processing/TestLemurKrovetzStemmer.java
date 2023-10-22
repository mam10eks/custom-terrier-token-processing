package de.webis.custom_terrier_token_processing;

import org.junit.Assert;
import org.junit.Test;
import org.terrier.terms.LemurKrovetzStemmer;
import org.terrier.terms.StemmerTermPipeline;

public class TestLemurKrovetzStemmer {
	private final StemmerTermPipeline stemmer = new LemurKrovetzStemmer();
	
	@Test
	public void testProduce() {
		String expected = "produce";
		String actual = stemmer.stem("produce");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testProducer() {
		String expected = "producer";
		String actual = stemmer.stem("producer");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testProducers() {
		String expected = "producer";
		String actual = stemmer.stem("producers");
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testBe() {
		String expected = "be";
		String actual = stemmer.stem("be");
		
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testAre() {
		String expected = "are";
		String actual = stemmer.stem("are");
		
		Assert.assertEquals(expected, actual);
	}
}
