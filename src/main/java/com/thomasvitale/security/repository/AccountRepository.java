package com.thomasvitale.security.repository;

import com.thomasvitale.model.Account;

public interface AccountRepository {

	Account findByUsername(String username);

}