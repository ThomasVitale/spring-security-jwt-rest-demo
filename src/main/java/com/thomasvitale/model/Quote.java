package com.thomasvitale.model;

public class Quote {

	private String author;
	private String sentence;
	
	public Quote() {
	}

	public Quote(String author, String sentence) {
		this.author = author;
		this.sentence = sentence;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
}
