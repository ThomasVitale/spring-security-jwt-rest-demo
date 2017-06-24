package com.thomasvitale.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.thomasvitale.model.Account;
import com.thomasvitale.repository.AccountRepository;
import com.thomasvitale.repository.AccountRepositoryImpl;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();
	
	private AccountRepository accountRepository = new AccountRepositoryImpl();

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Account account = accountRepository.findByUsername(username); 

		if (account == null) {
			throw new UsernameNotFoundException("User " + username + " not found");
		}
		
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("USER");
		List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
		simpleGrantedAuthorities.add(simpleGrantedAuthority);
		
		User user = new User(account.getUsername(), account.getPassword(), simpleGrantedAuthorities);
		
		detailsChecker.check(user);

		return user;
	}

}
