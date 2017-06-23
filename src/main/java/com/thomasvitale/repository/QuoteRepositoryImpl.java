package com.thomasvitale.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.thomasvitale.model.Quote;

@Repository("quoteRepository")
public class QuoteRepositoryImpl implements QuoteRepository {
	
	private Map<String,Quote> quotesMap = new HashMap<>();
	
	public QuoteRepositoryImpl() {
		Quote q1 = new Quote("Hermione Granger", "It's leviosa, not leviosar!");
		quotesMap.put("Hermione Granger", q1);
		Quote q2 = new Quote("Sheldon Cooper", "Bazinga!");
		quotesMap.put("Sheldon Cooper", q2);
		Quote q3 = new Quote("Gandalf The Grey", "You shall not pass!");
		quotesMap.put("Gandalf The Grey", q3);
	}
	
	@Override
	public Collection<Quote> findAllQuotes() {
		return quotesMap.values();
	}
	
}
