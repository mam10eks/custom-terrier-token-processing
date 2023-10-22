package org.terrier.terms;

import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class StanfordLemmatizer extends StemmerTermPipeline {

	private  StanfordCoreNLP pipeline = pipeline();
	
	public StanfordLemmatizer() {
		super();
	}

	public StanfordLemmatizer(TermPipeline next) {
		super(next);
	}
	
	@Override
	public synchronized String stem(String s) {
		Annotation t = new Annotation(s);
		this.pipeline.annotate(t);

		for(CoreMap sentence: t.get(SentencesAnnotation.class)) {
			for (CoreLabel token: sentence.get(TokensAnnotation.class)) {
				return token.get(LemmaAnnotation.class);
			}
		}

		return null;
	}

	private static synchronized StanfordCoreNLP pipeline() {
		Properties props = new Properties();

		props.put("annotators", "tokenize, ssplit, pos, lemma");

		return new StanfordCoreNLP(props);
	}
}
