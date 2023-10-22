# An Example on how to add a custom Terrier/PyTerrier Stemmer/Lemmatizer

This repository serves as an example on how to add new stemmers/lemmatizers to Terrier/PyTerrier.

To play around with more stemmers/lemmatizers, we add in this project the KrovetzStemmer and the StanfordNLP Lemmatizer. The goal is to compare them in terms of precision/recall against each other in PyTerrier Pipelines.

## Usage

Load the jar via:

```
wget https://files.webis.de/software/pyterrier-plugins/custom-terrier-token-processing-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Add this jar to your classpath.

## Development

Build this project via:

```
mvn clean install
```
