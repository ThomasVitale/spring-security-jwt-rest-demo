package com.thomasvitale.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomasvitale.model.Quote;
import com.thomasvitale.repository.QuoteRepository;

@Service("quoteService")
public class QuoteServiceImpl implements QuoteService {
	
	@Autowired
	private QuoteRepository quoteRepository;
	
	@Override
	public List<Quote> findAllQuotes() {
		List<Quote> quotes = new ArrayList<>(quoteRepository.findAllQuotes());
		return quotes;
	}
	
}
