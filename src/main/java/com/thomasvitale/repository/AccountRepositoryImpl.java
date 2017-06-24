package com.thomasvitale.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.thomasvitale.model.Account;

@Repository("accountRepository")
public class AccountRepositoryImpl implements AccountRepository {
	
	private Map<String,Account> accountsMap = new HashMap<>();
	
	public AccountRepositoryImpl() {
		Account account = new Account("user", "password");
		accountsMap.put(account.getUsername(), account);
	}
	
	@Override
	public Account findByUsername(String username) {
		return accountsMap.get(username);
	}

}
