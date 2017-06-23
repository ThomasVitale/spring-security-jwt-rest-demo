package com.thomasvitale.service;

import java.util.List;

import com.thomasvitale.model.Quote;

public interface QuoteService {

	List<Quote> findAllQuotes();

}