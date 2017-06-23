package com.thomasvitale.repository;

import java.util.Collection;

import com.thomasvitale.model.Quote;

public interface QuoteRepository {

	Collection<Quote> findAllQuotes();

}