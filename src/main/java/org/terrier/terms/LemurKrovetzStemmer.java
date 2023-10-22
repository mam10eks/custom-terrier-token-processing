package org.terrier.terms;

import org.lemurproject.kstem.KrovetzStemmer;

public class LemurKrovetzStemmer extends StemmerTermPipeline {
	private KrovetzStemmer stemmer = new KrovetzStemmer();
	
	@Override
	public synchronized String stem(String s) {
		return stemmer.stem(s);
	}
}
