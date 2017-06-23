package com.thomasvitale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thomasvitale.model.Quote;
import com.thomasvitale.service.QuoteService;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
	
	@Autowired
	private QuoteService quoteService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Quote> getQuotes() {
		return quoteService.findAllQuotes();
	}
}
