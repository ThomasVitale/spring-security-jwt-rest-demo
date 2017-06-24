package com.thomasvitale.security.service;

import static java.util.Collections.emptyList;

import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.thomasvitale.model.Account;
import com.thomasvitale.security.repository.AccountRepository;

@Service("userDetailsService")
public class AccountService implements UserDetailsService {
	
	private AccountRepository accountRepository;
	private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

	public AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		// Fetch the account corresponding to the given username
		Account account = accountRepository.findByUsername(username); 

		// If the account doesn't exist
		if (account == null) {
			throw new UsernameNotFoundException("User " + username + " not found");
		}
		
		// User(username, password, enabled, accountNonExpired, credentialsNotExpired, accountNonLocked, authorities)
		User user = new User(account.getUsername(), account.getPassword(), account.isEnabled(), true, true, true, emptyList());
				
		detailsChecker.check(user);

		return user;
	}

}
