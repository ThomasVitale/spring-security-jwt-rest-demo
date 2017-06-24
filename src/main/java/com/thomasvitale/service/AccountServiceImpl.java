package com.thomasvitale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thomasvitale.repository.AccountRepository;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountRepository;

}
