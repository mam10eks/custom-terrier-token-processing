package org.terrier.terms;

import org.lemurproject.kstem.KrovetzStemmer;

public class LemurKrovetzStemmer extends StemmerTermPipeline {
	private KrovetzStemmer stemmer = new KrovetzStemmer();

	public LemurKrovetzStemmer() {
		super();
	}

	public LemurKrovetzStemmer(TermPipeline next) {
		super(next);
	}

	@Override
	public synchronized String stem(String s) {
		return stemmer.stem(s);
	}
}
